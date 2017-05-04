package com.java.test;

/**
 * @author fcaa17922
 * 
 * Used to find the no of ways in which a volleyball game can be won
 * Classical case of use of pascal triangle
 *
 */
public class VolleyballSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(nCr(6, 2, 1000000007));
		System.out.println(nCr(6, 2));
	}

	private final static int MOD = 1000000007;

	private static int getNumPossibleGames(int A, int B) {
		if (A < B) {
			int temp = A;
			A = B;
			B = temp;
		}
		// 25 points condition to win
		if (A < 25) {
			return 0;
		}

		// If exactly 25 points
		if (A == 25) {
			return (A - B < 2) ? 0 : nCr(A - 1, B, MOD);
		}

		// Otherwise, score 26+ and gap more than or less than two
		if (A - B != 2) {
			return 0;
		}

		int numGames = nCr(24, 24, MOD);
		numGames = (int) ((((long) numGames) * pow(2, B - 24, MOD)) % MOD);
		return numGames;
	}

	private static int nCr(int n, int r, int mod) {
		if (n < r) {
			int temp = n;
			n = r;
			r = temp;
		}

		if (n < 1 || r < 1) {
			return 1;
		}

		// Using Pascal's triangle
		int[] row = new int[r];
		for (int i = 0; i < r; row[i++] = 1) {
		} // initialize
		for (int i = 2; i < r; ++i) {
			for (int j = i - 1; j > 0; --j) {
				row[j] = (row[j] + row[j - 1]) % mod;
			}
		}

		--r;
		int sum = row[r];
		for (int i = 0; i < n; ++i) {
			for (int j = r; j > 0; --j) {
				row[j] = (row[j] + row[j - 1]) % mod;
			}
			sum = (sum + row[r]) % mod;
		}

		return sum;
	}

	static double nCr(int n, int r) {
		int rfact = 1, nfact = 1, nrfact = 1, temp1 = n - r, temp2 = r;
		if (r > n - r) {
			temp1 = r;
			temp2 = n - r;
		}
		for (int i = 1; i <= n; i++) {
			if (i <= temp2) {
				rfact *= i;
				nrfact *= i;
			} else if (i <= temp1) {
				nrfact *= i;
			}
			nfact *= i;
		}
		return nfact / (double) (rfact * nrfact);
	}

	private static int pow(int base, int exponent, int mod) {
		if (exponent < 2) {
			return (exponent < 1) ? 1 : base;
		}
		long product = pow(base, exponent >> 1, mod);
		product = (product * product) % mod;
		return ((exponent & 1) == 1) ? (int) ((product * base) % mod) : (int) (product);
	}
}
