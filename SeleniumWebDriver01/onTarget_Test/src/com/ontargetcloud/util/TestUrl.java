package com.ontargetcloud.util;

import java.net.HttpURLConnection;
import java.net.URL;

public class TestUrl {

	public int testUrlStatus(String link) throws Exception {

		URL url = new URL(link);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int code = connection.getResponseCode();
		return code;
	}

	public static void main(String[] args) throws Exception {
		TestUrl testUrl = new TestUrl();
		System.out.println(testUrl.testUrlStatus("http://52.87.243.57:8080/ontarget/"));
	}
}
