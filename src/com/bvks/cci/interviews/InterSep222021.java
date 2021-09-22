package com.bvks.cci.interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * ClearTrail
 *
 */
public class InterSep222021 {

	class Student {
		private String city;

		public Student(String city) {
			this.city = city;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSecondHighestElement(new int[] { 1, 2, 3, 4, 5 }));
	}

	// Problem 1
	public static List<String> remove(List<String> stringList, String value) {
		if (stringList == null || value == null)
			return null;

		stringList.remove(value);
		return stringList;
	}

	// Problem 2
	public static int getMaxValue(int[] array) {
		int MAX_VALUE = Integer.MIN_VALUE;
		for (int i : array) {
			if (i > MAX_VALUE) {
				MAX_VALUE = Math.max(i, MAX_VALUE);
			}
		}
		return MAX_VALUE;
	}

	// Problem 3
	public static int updateStudentsCity(List<Student> studentsList) {

		if (Objects.isNull(studentsList))
			return 0;

		int updatedRecords = 0;
		for (Student student : studentsList) {
			if (Objects.nonNull(student) && student.getCity().equals("Mumbai")) {
				student.setCity("Delhi");
				updatedRecords++;
			}
		}
		return updatedRecords;
	}

	// Problem 4
	public static boolean checkPermutabilityOfStrings(String a, String b) {

		char[] arrayA = a.toCharArray();
		char[] arrayB = b.toCharArray();

		Arrays.sort(arrayA);
		Arrays.sort(arrayB);

		return Arrays.equals(arrayA, arrayB);

	}

	// Problem 5
	public static List<Integer> removeDuplicateValues(List<Integer> listOfElements) {
		return listOfElements.stream().distinct().collect(Collectors.toList());
	}

	// Problem 6
	public static int findSecondHighestElement(int[] array) {
		if (array.length < 2)
			return -1;

		int i = 0;
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (i = 0; i < array.length; i++) {
			if (array[i] > first) {
				second = first;
				first = array[i];
			} else if (second < array[i] && array[i] != first) {
				second = array[i];
			}
		}
		return second;
	}

	// Problem 7
	public static void reverseArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int outer = array.length - i - 1;
			int temp = array[i];
			array[i] = array[outer];
			array[outer] = temp;
		}
	}

	// Problem 8
	public static Map<Integer, Integer> fetchOddFrequencyMap(List<Integer> integerList) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int i : integerList) {
			if (i % 2 == 1) {
				frequencyMap.put(i, frequencyMap.get(i) != null ? frequencyMap.get(i) + 1 : 0);
			}
		}
		return frequencyMap;
	}

}
