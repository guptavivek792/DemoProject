package com.healogics.pretx.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import liquibase.integration.spring.SpringLiquibase;

/**
 * 
 * @author Vivek Patidar
 */

@Configuration
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:/var/healogics/properties/application.properties", ignoreResourceNotFound = true)
@ComponentScan(basePackages = "com.healogics.pretx.domain")
@EnableTransactionManagement
public class HibernateConfig {

	@Autowired
	private Environment env;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan("com.healogics.pretx.domain");
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	@Bean
	public DataSource dataSource() {

		HikariConfig configuration = new HikariConfig();
		configuration.setDriverClassName(env.getProperty("datasource.driver"));
		configuration.setJdbcUrl(env.getProperty("database.url"));
		configuration.setUsername(env.getProperty("database.user"));
		configuration.setPassword(env.getProperty("database.password"));

		return new HikariDataSource(configuration);
	}

	@Bean
	public PlatformTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

	private Properties hibernateProperties() {

		Properties properties = new Properties();

		properties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		properties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		properties.setProperty("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
		properties.setProperty("hibernate.use_sql_comments", env.getProperty("hibernate.use_sql_comments"));
		properties.setProperty("hibernate.jdbc.batch_size", env.getProperty("database.batchsize"));
		properties.setProperty("hibernate.cache.region.factory_class",
				env.getProperty("hibernate.cache.region.factory_class"));
		properties.setProperty("hibernate.cache.use_second_level_cache",
				env.getProperty("hibernate.cache.use_second_level_cache"));
		properties.setProperty("hibernate.cache.use_query_cache", env.getProperty("hibernate.cache.use_query_cache"));
		properties.setProperty("hibernate.id.new_generator_mappings", "false");

		return properties;
	}

	@Bean
	public SpringLiquibase liquibase() {
		// If the database is out of date, this will update it to the latest schema.
		SpringLiquibase lb = new SpringLiquibase();
		lb.setChangeLog("classpath:database/db.update.xml");
		lb.setDataSource(dataSource());
		return lb;
	}
}
