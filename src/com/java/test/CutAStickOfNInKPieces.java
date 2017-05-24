package com.java.test;



// Java program to find the number of ways in which
// a stick of length n can be divided into K pieces
public class CutAStickOfNInKPieces {
	    // function to generate nCk or nChoosek
	    public static int nCr(int n,  int r)
	    {
	        if (n < r)
	            return 0;
	 
	        // Reduces to the form n! / n!
	        if (r == 0)
	            return 1;
	 
	        // nCr has been simplified to this form by
	        // expanding numerator and denominator to the form
	        //       n(n - 1)(n - 2)...(n - r + 1)
	        //       -----------------------------
	        //                 (r!)
	        // in the above equation, (n-r)! is cancelled out
	        // in the numerator and denominator
	 
	        int numerator = 1;
	        for (int i = n ; i > n - r ; i--)
	            numerator = (numerator * i);
	 
	        int denominator = 1;
	        for (int i = 1 ; i < r + 1 ; i++)
	            denominator = (denominator * i);
	 
	        return (numerator / denominator);
	    }
	 
	    // Returns number of ways to cut a rod of length
	    // N into K peices.
	    public static int countWays(int N, int K)
	    {
	        return nCr(N - 1, K - 1);
	    }
	 
	    public static void main(String[] args)
	    {
	        int N = 5;
	        int K = 2;
	        System.out.println(countWays(N, K));
	    }
	
}
