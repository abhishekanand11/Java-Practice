package com.java.walmart;

import java.util.Scanner;

/**
 * 
 * @author fcaa17922
 * A car is about to enter a highway, with checkpoints marked with continuous integers from 1 to N. Before entering the highway, a ticket booth grants the driver a ticket with the number X and says if along the way at least one group of consecutive checkpoints add up to X, then the driver may stop at only those checkpoints. How many such groups does the driver have as options?

Input - 
The 1st line of the input contains 'T' (number of test cases), followed by T lines which are the ticket numbers.

Output - 
The output will have 'T' lines which are the number of options for the car to take stops at checkpoints along the highway in each test case. Output 0 for invalid input.

Constraint - 
1<= X <= 1000000

Example -
Input - 
1
15
Output -
3
 * 
 *
 */

public class CarStopProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        //Scanner
        Scanner s = new Scanner(System.in);
        int noOfTestCases = s.nextInt();

        for (int i = 0; i < noOfTestCases; i++) {
        	int ticketNo = s.nextInt();
        	int stopCount= 0;
            for(int j=1; j < ticketNo; j++){
            	int tempSum = j;
            	if(tempSum == ticketNo){
        			stopCount++;
        			continue;
        		}
            	for(int k = j+1; k < ticketNo; k++){
            		tempSum = tempSum + k;
            		if(tempSum == ticketNo){
            			stopCount++;
            			break;
            		}
            	}
            	
            }
            System.out.println(stopCount);
        }

	}

}
