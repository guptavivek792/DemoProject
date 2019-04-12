package com.healogics.pretx.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.healogics.iheal.utility.IHealRestClient;
import com.healogics.pretx.utility.PreTxUtills;
import com.healogics.pretx.utility.S3Utill;

/**
 * @author Vivek Patidar
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.healogics" })
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:/var/healogics/properties/application.properties", ignoreResourceNotFound = true)
public class SpringConfig implements WebMvcConfigurer {

	@Autowired
	private Environment env;

	@Bean
	public PropertiesFactoryBean systemProperties() {
		PropertiesFactoryBean bean = new PropertiesFactoryBean();
		bean.setIgnoreResourceNotFound(true);
		bean.setLocations(new ClassPathResource("application.properties"),
				new FileSystemResource("/var/healogics/properties/application.properties"));
		return bean;
	}

	@Bean
	public AppListener webAppInitializer() {
		return new AppListener();
	}

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasenames("classpath:/lang/messages");

		return messageSource;
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/patientRequest").setViewName("patientRequest");
	}

	@Bean
	public void setConstantsProperties() {

		String awsS3AccessKey = env.getProperty("aws.s3_access_key");
		String awsS3SecretKey = env.getProperty("aws.s3_secret_key");
		String bucketRegion = env.getProperty("aws.s3_bucket_region");
		String bucketName = env.getProperty("aws.s3_bucket_name");

		S3Utill.setAmazonS3Client(awsS3AccessKey, awsS3SecretKey, bucketRegion);
		S3Utill.setBucketName(bucketName);

		String encryptionSecret = env.getProperty("encryption_secret");
		PreTxUtills.setEncryptionSecret(encryptionSecret);

		IHealRestClient.IHEAL_IP = env.getProperty("iheal_ip");
		IHealRestClient.HOST_NAME = env.getProperty("host_name");
		IHealRestClient.PRIVATE_KEY = env.getProperty("private_key");
		IHealRestClient.isLocalDevEnv = Boolean.parseBoolean(env.getProperty("local_dev_env"));
		IHealRestClient.local_dev_url = env.getProperty("local_dev_url");

		List<String> providerRoles = Arrays
				.asList(env.getProperty("iheal.role.provider").split(env.getProperty("iheal.role.seprator")));
		PreTxUtills.setProviderRoles(providerRoles);

		List<String> reviewerRoles = Arrays
				.asList(env.getProperty("iheal.role.reviewer").split(env.getProperty("iheal.role.seprator")));
		PreTxUtills.setReviewerRoles(reviewerRoles);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(webInterceptor()).addPathPatterns("/**").excludePathPatterns("/api/**", "/resources/**",
				"/iHeal/**");
		registry.addInterceptor(restInterceptor()).addPathPatterns("/api/**");

		WebMvcConfigurer.super.addInterceptors(registry);
	}

	@Bean
	public WebInterceptor webInterceptor() {
		return new WebInterceptor();
	}

	@Bean
	public RESTInterceptor restInterceptor() {
		return new RESTInterceptor();
	}

	@Bean
	public MappingJackson2HttpMessageConverter customJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		ObjectMapper objectMapper = new ObjectMapper();

		objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
		objectMapper.setVisibility(PropertyAccessor.CREATOR, JsonAutoDetect.Visibility.ANY);
		objectMapper.setVisibility(PropertyAccessor.SETTER, JsonAutoDetect.Visibility.NONE);
		objectMapper.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
		objectMapper.setVisibility(PropertyAccessor.IS_GETTER, JsonAutoDetect.Visibility.NONE);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
		objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
		objectMapper.configure(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, true);

		objectMapper.registerModule(new Hibernate5Module());
		JavaTimeModule javaTimeModule = new JavaTimeModule();
		javaTimeModule.addDeserializer(LocalDateTime.class,
				new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		javaTimeModule.addSerializer(LocalDateTime.class,
				new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		objectMapper.registerModule(javaTimeModule);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		objectMapper.setDateFormat(df);

		jsonConverter.setObjectMapper(objectMapper);
		return jsonConverter;
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(customJackson2HttpMessageConverter());
		WebMvcConfigurer.super.configureMessageConverters(converters);
	}

	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(-1);// -1 indicates no limit
		return multipartResolver;
	}
}
