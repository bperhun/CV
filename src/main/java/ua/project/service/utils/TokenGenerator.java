package ua.project.service.utils;

import org.apache.commons.lang.RandomStringUtils;

public final class TokenGenerator {

	private static int defaultLength = 100;
	
	public static String generate() {
		return RandomStringUtils.randomAlphabetic(defaultLength);
	}
	
	 public static String generate(int length) {
		return RandomStringUtils.randomAlphabetic(length);
	}	
}
