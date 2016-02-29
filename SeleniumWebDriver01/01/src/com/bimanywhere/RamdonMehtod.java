package com.bimanywhere;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RamdonMehtod {
	
	private final static String temp ="AutoTest-Time-";
	public  String title(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		return temp+s;
	}
	
	public String email() {
		int x = (int) (Math.random()*5);
		 int y = (int) (Math.random()*10);
		 int z = (int) (Math.random()*100);
		 String emailStr = "AutoTestEmail"+x+z+y+"@gmail.com";
		 return emailStr;
	}
	
	public static void main(String[] args) {
		RamdonMehtod r = new RamdonMehtod();
		System.out.println(r.email());
	}
}

