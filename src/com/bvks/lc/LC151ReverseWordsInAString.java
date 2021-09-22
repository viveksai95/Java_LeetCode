package com.bvks.lc;

public class LC151ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("a good   example"));
	}

	public static String reverseWords(String s) {
		String[] strArray = s.trim().split(" ");
		for (int i = 0; i < strArray.length / 2; i++) {
			int index = strArray.length - i - 1;
			String temp = strArray[i];
			strArray[i] = strArray[index];
			strArray[index] = temp;
		}

		StringBuilder sb = new StringBuilder();

		for (String str : strArray) {
			sb.append(str.trim() + " ");
		}

		return sb.toString().trim();
	}
}
