package com.selenium;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		   
		String msg = "The issue Issue - AutoTest-Time-2016-02-28 21:03:01 have been created.";
		
	    Boolean b = msg.contains("AutoTest-Time-2016-02-28 21:03:01 have been created");
		System.out.println(b);
	}
}
