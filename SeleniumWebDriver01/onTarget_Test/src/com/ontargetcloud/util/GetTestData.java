package com.ontargetcloud.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class GetTestData {

	public String getTestData(String name) throws IOException {
		InputStream in = getClass().getClassLoader().getResourceAsStream("config.properties");
		Properties properties = new Properties();
		properties.load(in);
		String url = properties.getProperty(name);
		return url;
	}

	public static void main(String[] args) throws IOException {
		 GetTestData url = new GetTestData();
		 System.out.println(url.getTestData("testPassword"));
	}
}
