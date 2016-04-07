package com.ontargetcloud.util;

import java.util.ArrayList;

public class EmailVerify {

	public ArrayList<String> invalidEmailList() {

		ArrayList<String> emailList = new ArrayList<String>();
		emailList.add("1_invalidEmail@.com");
		emailList.add("2_invalidEmail@gamil");
		emailList.add("3____@gamil");
		emailList.add("4_invalidEmail@gamil.comqqweqwewqe");
		emailList.add("5_invalidEmail@ga@il.comq");
		emailList.add("6_invali@dEmail@gail.com");
//		emailList.add("7_invalidEmail@gail.com");

		return emailList;
	}

	public String existsEmail(String sampleEmail) {

		return sampleEmail;
	}

	public void checkEmailBox() {
	}

}
