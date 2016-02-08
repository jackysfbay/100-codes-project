package com.java.sorting;

public class InsertSort {

	public static void main(String[] args) {
		
		/*
		 *  1. if previousNum < currernNumber, then for loop keep going, 
		 *  2. if  previousNum > currernNumber, the previousNum and currernNumber will switch index each other, 
		 *  	then the small number will compare with the previousNum one by one until from small to largest
 		 */
		
		int[] arr = { 1, 4, 5, 3, 90, 66 };

		for (int i = 1; i < arr.length; i++) {

			int currernNumber = arr[i];

			int j = i - 1; // previousNum -> arr[j]

			while (j >= 0 && arr[j] > currernNumber) {

				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = currernNumber;
		}

		System.out.println("----------------");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
