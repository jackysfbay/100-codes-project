package com.ontargetcloud.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RamdonString {
	private final static String temp ="AutoTest_";

	
	public String ramdonName(String str) {

		if (str.equals("First")) {
			return temp+"First Name";
		} else if (str.equals("Last")) {
			return temp+"Last Name";
		} else {
			return temp+ "Full Name";
		}
	}

	public String ramdonValidEmail() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String s = sdf.format(d);
		String emailStr = temp+"Email_" + s + "@gmail.com";
		return emailStr;
	}
	public String ramdonTitle() {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String s = sdf.format(d);
		return temp+"Title_"+s;
	}
	
	public String ramdonPassword(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String s = sdf.format(d);
		
		return temp+s+"@";
	}
	
	
	
	
	public static void main(String[] args) {
		RamdonString ram = new RamdonString();
	
		System.out.println(ram.ramdonPassword());
	}
}
