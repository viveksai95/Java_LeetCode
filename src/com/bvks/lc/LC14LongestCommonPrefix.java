package com.bvks.lc;

public class LC14LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "abcde", "ab" };
		System.out.println("Main " + longestCommonPrefix(strs));
		System.out.println("zdfdsfabcdefgh".indexOf("abcde"));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		}

		return prefix;
	}

	public String longestCommonPrefixV2(String[] strs) {
		String prefix = strs[0];

		for (String str : strs) {
			int len = str.length();
			for (int i = len; i >= 0; i--) {
				if (prefix.startsWith(str.substring(0, len))) {
					prefix = str.substring(0, len);
					break;
				}
			}
		}

		return prefix;
	}

}
