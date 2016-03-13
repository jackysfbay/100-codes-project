package com.java.algorithm;

public class PrimeFactor {

	public static void main(String[] args) {
		isFactor(24
				);
	}

	public static void isFactor(int num) {
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				num = num / i;
				if (isPrime(num)) {
					System.out.print(num);
				} else {
					isFactor(num);
				}
				return;
			}
		}
	}

	public static boolean isPrime(int num) {

		int k = (int) (Math.sqrt(num));
		for (int i = 2; i <= k; i++) {

			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
