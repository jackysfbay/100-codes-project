package com.java.sorting;

import java.util.Random;

public class Bubble {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 333, 45, 6, 7 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (Integer list : arr) {
			System.out.print(list + " ");
		}
	}
}
