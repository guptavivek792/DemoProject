package com.healogics.iheal.utility;

import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class IHealResponseConverter {

	private IHealResponseConverter() {
		throw new IllegalStateException("IHealResponseConverter class");
	}

	private static final ObjectMapper mapper = new ObjectMapper();

	public static Object jsonResponseToClass(String input, Class clazz) throws IOException {
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		return mapper.readValue(input, clazz);
	}
}
