package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
	public static void main(String[] args) {
//		   
//		String msg = "The issue Issue - AutoTest-Time-2016-02-28 21:03:01 have been created.";
//		
//	    Boolean b = msg.contains("AutoTest-Time-2016-02-28 21:03:01 have been created");
//		System.out.println(b);
		
		String str ="Page 22 of 23 (220)";
		
	 

		
		String str1 = str.replaceAll("[^0-9]*([0-9]*)[^0-9]*", "$1\'");
		String[] str2=str1.split("'");

		System.out.println(str2[2]);

		
	
		
		
	}
}
