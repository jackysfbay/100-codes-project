package com.ontargetcloud.util;

import java.util.ArrayList;

public class PasswordVerify {
	private String temp = "Auto@Test@";

	public ArrayList<String> invalidPasswordList() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("Ab");
		list.add("Ab2");
		list.add("Ad2@#!");
		list.add("             ");
		list.add("Fd23Fedd2");
		list.add("aaaaaaaaaaaa");
		list.add("AAAAAAAAAAAAA");
		list.add("2222222222");
		list.add("!!!!!!!!@@@@@");
		list.add("aaaaAaaaaaaaaa");
		list.add("AAAAAAAAA22222");
		list.add("1111111111@@@@");
		list.add("aA222222222222");
		list.add("A2@@@@@@@@@@@@");
		list.add("2#############");
//		list.add("@3Aa@@@@@@@@@@@");
		
		return list;
	}
	
	

	public String validPasswordList() {
		int num = (int)(Math.random()*10);
		return temp+num;
	}
	
	public static void main(String[] args) {
		PasswordVerify obj =new PasswordVerify();
		
		System.out.println(obj.invalidPasswordList().size());
	}
}
