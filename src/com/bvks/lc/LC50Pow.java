package com.bvks.lc;

public class LC50Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow(2.0, -3));
	}

	// Partially Correct Solution - 291 / 305 test cases passed.
	// Time Limit Exceeded

	public static double myPow(double x, int n) {
		double powerProduct = 1.0;
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				powerProduct *= x;
			}
		} else if (n < 0) {
			for (int i = n; i < 0; i++) {
				powerProduct /= x;
			}
		}

		// Last executed input
		// 0.00001
		// 2147483647

		return powerProduct;
	}

	// Wrong Attempt #2 -- Corrected Brute Force Approach

	public static double myPowV2(double x, int n) {
		// overlooked negative powers and sample i/o also
		double powerProduct = 1.0;
		for (int i = 1; i <= n; i++) {
			powerProduct *= x;
		}
		return powerProduct;
	}

	// Wrong Attempt #1 -- Brute Force Approach

	public static double myPowV1(double x, int n) {
		for (int i = 2; i <= n; i++) {
			x *= x; // for(2,10) it should rather be 2*2*2*....2
			// it was ((((2*2)*4)*16)*256)..... - worst and wrong
		}
		return x;
	}

}
