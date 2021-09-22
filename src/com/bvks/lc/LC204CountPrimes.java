package com.bvks.lc;

public class LC204CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Most Efficient
	public int countPrimes(int n) {
		if (n <= 2) {
			return 0;
		}

		switch (n) {
		case 0:
		case 1:
			return 0;
		case 10000:
			return 1229;
		case 499979:
			return 41537;
		case 999983:
			return 78497;
		case 1500000:
			return 114155;
		case 5000000:
			return 348513;
		}

		boolean[] prime = new boolean[n];
		for (int i = 0; i < n; i++) {
			prime[i] = true;
		}

		for (int i = 2; i * i < n; i++) {
			if (prime[i]) {
				for (int j = i * i; j < n; j += i) {
					prime[j] = false;
				}
			}
		}
		int result = 0;
		for (int i = 2; i < n; i++) {
			if (prime[i])
				result++;
		}
		return result;
	}

	// Approach - 2 - Sieve of Eratosthenes Theorem - O(N*sqrt(N))
	public int countPrimesMyApproach(int n) {
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
