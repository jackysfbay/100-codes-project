package com.java.interview.test;

/**
 * Description
You are given a very large integer, read implementation of calculating the sum of digits.

Input
The input should be a non-negative integer less than 10100.

Output
 The result should be in the format of String with  {"zero","one","two","three","four","five","six","seven","eight","nine"}


 */

import java.util.ArrayList;

public class ReadSumofDigits {

	public String readDidits(int i) {

		if (1 == i) {
			return "one";
		} else if (2 == i) {
			return "two";
		} else if (3 == i) {
			return "three";
		} else if (4 == i) {
			return "four";
		} else if (5 == i) {
			return "five";
		} else if (6 == i) {
			return "six";
		} else if (7 == i) {
			return "seven";
		} else if (8 == i) {
			return "eight";
		} else if (9 == i) {
			return "nine";
		} else if (0 == i) {
			return "zero";
		}
		return null;
	}

	public static void main(String[] args) {
		int testNum = 132490;
		ReadSumofDigits test = new ReadSumofDigits();
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();

		Integer n = new Integer(testNum);

		String str = n.toString();

		char[] chs = str.toCharArray();

		for (int i = 0; i < chs.length; i++) {
			int x = Integer.parseInt(chs[i] + "");
			list.add(x);
		}

		for (int i = 0; i < list.size(); i++) {
			Integer n1 = (Integer) list.get(i);
			int n2 = n1.intValue();
			list2.add(test.readDidits(n2));
		}
		System.out.print(list2);
	}

}
