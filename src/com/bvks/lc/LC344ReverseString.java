package com.bvks.lc;

public class LC344ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = { 'c', 'v', 'i' };
		reverseString(charArray);

		System.out.println(charArray);
	}

	// Complexity O(N)
	public static void reverseString(char[] s) {
		int high = (s.length) - 1;
		int low = 0;
		char temp;
		while (low <= high) {
			if (s[low] != s[high]) {
				temp = s[low];
				s[low] = s[high];
				s[high] = temp;
			}
			low++;
			high--;
		}

	}

}
