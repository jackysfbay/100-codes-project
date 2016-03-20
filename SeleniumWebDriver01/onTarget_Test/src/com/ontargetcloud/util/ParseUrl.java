package com.ontargetcloud.util;

public class ParseUrl {

	public String[] parseUrlWithSlash(String url) {

		String[] parse = url.split("/");

		return parse;
	}

//	public static void main(String[] args) {
//		ParseUrl parse = new ParseUrl();
//		String[] str = parse.parseUrlWithSlash("http://52.87.243.57:8080/ontarget/#/page/signup");
//		String str1 = str[str.length - 1];
//		System.out.println(str1.contains("signup"));
//	}

}
