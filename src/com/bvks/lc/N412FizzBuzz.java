package com.bvks.lc;

import java.util.ArrayList;
import java.util.List;

public class N412FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String str : fizzBuzz(100)) {
			System.out.println(str);
		}
	}

	//Time Complexity - O(N)
	public static List<String> fizzBuzz(int n) {
		List<String> outputList = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			outputList.add(calculateFizzBuzz(i));
		}

		return outputList;
	}

	public static String calculateFizzBuzz(int input) {
		if (input % 5 == 0 && input % 3 == 0) {
			return "FizzBuzz";
		} else if (input % 3 == 0) {
			return "Fizz";
		} else if (input % 5 == 0) {
			return "Buzz";
		} else {
			return Integer.toString(input);
		}
	}

}
