package com.java.test.algo;

import com.java.test.heap.Heap;

/**
 * This class implements the famous KMP algo which uses the information of
 * proper prefix and proper suffix. So once you have matched the text string
 * with the pattern string and then after j no of matches from pattern string we
 * find that j+1 is a mismatch, so we check for the lps array and see how many
 * characters we can skip checking. The lps array knows for a given length of
 * sub pattern what is the max length of the sub proper prefix which is equal to
 * sub proper suffix.
 * 
 * @author abhishekanand
 *
 */
public class KMP {

	public static int strStr(String txt, String pat) {

        int M = pat.length();
        int N = txt.length();
 
        // create lps[] that will hold the longest
        // prefix suffix values for pattern
        int lps[] = new int[M];
        int j = 0;  // index for pat[]
 
        // Preprocess the pattern (calculate lps[]
        // array)
		computeLPSArray(lps, pat);
		int i = 0;  // index for txt[]
        while (i < N)
        {
            if (pat.charAt(j) == txt.charAt(i))
            {
                j++;
                i++;
            }
            if (j == M)
            {
                System.out.println("Found pattern "+
                              "at index " + (i-j));
                j = lps[j-1];
                return i - j;
            }
 
            // mismatch after j matches
            else if (i < N && pat.charAt(j) != txt.charAt(i))
            {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j-1];
                else
                    i = i+1;
            }
        }
        return 0;
	}

	public static int[] computeLPSArray(int[] lps, String pat) {
		// length of the previous longest prefix suffix
		int len = 0;
		int i = 1;
		lps[0] = 0; // lps[0] is always 0
		int M = pat.length();
		// the loop calculates lps[i] for i = 1 to M-1
		while (i < M) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else // (pat[i] != pat[len])
			{
				// This is tricky. Consider the example.
				// AAACAAAA and i = 7. The idea is similar
				// to search step.
				if (len != 0) {
					len = lps[len - 1];;
					

					// Also, note that we do not increment
					// i here
				} else // if (len == 0)
				{
					lps[i] = len;
					i++;
				}
			}
		}
		return lps;
	}

	public static void main(String... arg) {
		int i = KMP.strStr("abababc", "aba");
		System.out.println("The Min val is " + i);
	}

}
