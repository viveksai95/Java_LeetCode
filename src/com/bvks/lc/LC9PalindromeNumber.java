package com.bvks.lc;

public class LC9PalindromeNumber {

	public static void main(String[] args) {
		isPalindromeV2(12344321);
	}

	// Time Complexity - O(log N) - Base 10
	public static boolean isPalindrome(int x) {
		int reversedInput = 0;
		int temp = x;

		while (temp > 0) {
			reversedInput = reversedInput * 10 + temp % 10;
			temp /= 10;
		}
		System.out.println(reversedInput);

		return reversedInput == x;
	}

	// Time Complexity - O(log N)
	public static boolean isPalindromeV2(int input) {
		if (input < 0 || input % 10 == 0 && input != 0)
			return false;

		int reversedNum = 0;

		while (input > reversedNum) {
			reversedNum = reversedNum * 10 + input % 10;
			input /= 10;
		}
		System.out.println("x is : " + input);
		System.out.println("reversedNum is : " + reversedNum);
		return input == reversedNum || input == reversedNum / 10;
	}
}
