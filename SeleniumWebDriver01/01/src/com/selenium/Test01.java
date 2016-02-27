package com.selenium;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		   
		String url ="http://stage-cpanel.bimanywhere.com/Projects/dashboard?r=true&type=welcome_back";
		
		String[] list  = url.split("=");
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}
}
