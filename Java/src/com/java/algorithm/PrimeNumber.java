package com.java.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	/**
	 * A prime number (or a prime) is a natural number greater than 1 that has
	 * no positive divisors other than 1 and itself. A natural number greater
	 * than 1 that is not a prime number is called a composite number.
	 * 
	 * 1. 大于1 的自然数, 也就是2以上 2. 只能被1和它自己本身所整除的数成为素数或质数 3. 不能表示为任
	 * 何其它两个整数的乘积。例如，15＝3＊5，所以15不是素数 解决: 给一个数是否能开根号,
	 */

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <=18; i++) {
			if(isPrime(i)){
				list.add(i);
			}
		}
		System.out.println(list);
	}

	public static boolean isPrime(int num) {
		/**
		 * 1.关于变量k.变量k的作用是优化整个算法,因为比如要判断一个数13是不是素数,我们没必要从2循环到13.只要循环到对13开根号.
		 * 13开根号大概是3.6多,强转为int类型后是3.也就是说只要检查2,3是否能整除13.如果不能,13肯定是一个素数.因为比如48这个数,
		 * 你前面检测到被4整除等于12,那么继续循环超过Math.sqrt(48)的话,无非就是得到一个反过来的被12除等于4的结果.这个没有必要.
		 */
		int k = (int) (Math.sqrt(num));
		for (int i = 2; i <= k; i++) {
				
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
