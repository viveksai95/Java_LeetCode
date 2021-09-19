package com.bvks.lc;

public class LC172FactorialTrailingZeroes {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(30));
	}

	// Reference Solution
	// Time Complexity - O(log N) - Base 5
	public static int trailingZeroes(int n) {
		int zeroesCount = 0;
		while (n > 0) {
			n /= 5;
			zeroesCount += n;
		}

		return zeroesCount;
	}

	// Wrong Attempt #3 -- After correcting the logic

	public static int trailingZeroesV3(int n) {
		int zeroesCount = 0;
		for (int i = 1; i <= n; i++) {
			int factor = i;
			while (factor > 0) {
				// if input < 25, this logic works as expected, post which fails
				// 26%5 != 0 -- OK, 26/5 = 5 -> 5%5 == 0 -- its actually wrong
				// the idea of this logic is to find the sum of 5 in each factor
				if (factor % 5 == 0) {
					zeroesCount++;
				}
				factor /= 5;
			}
		}
		return zeroesCount++;
	}

	// Wrong Attempt #2 -- After understanding the logic

	public static int trailingZeroesV2(int n) {
		int zeroesCount = 0;
		for (int i = 1; i <= n; i++) {
			while (i > 0) {
				if (i % 5 == 0) {
					zeroesCount++;
				}
				i /= 5; // This is causing the infinite loop
			}
		}

		return zeroesCount++;
	}

	// Wrong Attempt #1 -- Brute Force - 30 Factorial cant be stored even in
	// long type.

	public static int trailingZeroesV1(int n) {
		long factorial = calculateFactorial(n);
		return calculateTrailingZeroes(factorial);
	}

	public static int calculateTrailingZeroes(long input) {
		int zeroesCount = 0;

		while (input > 0) {
			long lastDigit = input % 10;
			input /= 10;
			if (lastDigit == 0) {
				zeroesCount++;
			} else {
				break;
			}
		}
		return zeroesCount;
	}

	public static long calculateFactorial(int input) {
		long factorial = 1L;
		for (int i = 1; i <= input; i++) {
			factorial *= i;
		}
		return factorial;
	}

}
