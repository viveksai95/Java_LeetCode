package com.bvks.lc;

public class LC204CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Approach - 2 - Sieve of Eratosthenes Theorem - O(N*sqrt(N))
	public int countPrimes(int n) {
		boolean[] primeBoard = new boolean[n];

		for (int i = 2; i < n; i++) {
			primeBoard[i] = true;
		}

		for (int i = 2; i * i < n; i++) {
			if (!primeBoard[i])
				continue;
			for (int j = i * i; j < n; j += i) {
				primeBoard[j] = false;
			}
		}

		int count = 0;
		for (int i = 2; i < n; i++) {
			if (primeBoard[i])
				count++;
		}
		return count;
	}

	// Approach - 1 - Time Limit Exceeded O(N*sqrt(N))
	public int countPrimesV2(int n) {
		int primesCount = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i))
				primesCount++;
		}
		return primesCount;
	}

	public boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
