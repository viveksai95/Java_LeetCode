package com.bvks.cci;

public class TimeComplexities {

	class Node {
		int value;
		Node left, right;
	}

	public static void main(String[] args) {

	}

	// O(N)
	public static int sum(int n) {
		if (n <= 0)
			return 0;
		return n * sum(n - 1);
	}

	// O(N)
	public static int pairSumSequence(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += pairSum(i, i + 1);
		}
		return sum;
	}

	public static int pairSum(int a, int b) {
		return a + b;
	}

	// O(2^N)
	public static int nthNumber(int n) {
		if (n <= 1)
			return 1;
		return nthNumber(n - 1) + nthNumber(n - 1);
	}

	// O(N)
	public static void foo(int[] array) {
		int sum = 0;
		int product = 1;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		for (int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		System.out.println(sum + " " + product);
	}

	// O(N^2)
	public static void printPairs(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i] + " " + array[j]);
			}
		}
	}

	// O(N^2)
	public static void printUnorderedPairs(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				System.out.println(array[i] + " " + array[j]);
			}
		}
	}

	// O(a*b)
	public static void printUnorderedPairs(int[] arrayA, int[] arrayB) {
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if (arrayA[i] < arrayB[j])
					System.out.println(arrayA[i] + " " + arrayB[j]);
			}
		}
	}

	// O(a*b)
	public static void printUnorderedPairsWithConstantIter(int[] arrayA, int[] arrayB) {
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				for (int k = 0; k < 100000; k++) {
					if (arrayA[i] < arrayB[j])
						System.out.println(arrayA[i] + " " + arrayB[j]);
				}
			}
		}
	}

	// O(N)
	public static void reverse(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int outer = array.length - i - 1;
			int temp = array[i];
			array[i] = array[outer];
			array[outer] = temp;
		}
	}

	// O(N) - N is the number of Nodes starting from the parent Node
	public static int sumOfNodes(Node n) {
		if (n == null)
			return 0;

		return sumOfNodes(n.left) + n.value + sumOfNodes(n.right);
	}

	// O(sqrt(N))
	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// O(N)
	public static int factorial(int n) {
		if (n < 0)
			return -1;
		else if (n == 0)
			return 1;
		else {
			return n * factorial(n - 1);
		}
	}
	
	// O(2^N)
	public static int nthFibonacci(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		return nthFibonacci(n - 1) + nthFibonacci(n - 2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
