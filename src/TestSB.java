/*
 * Author: Winfield Ly
 * Course: BIF812
 * Purpose: BIF812 - Assignment 1. The first part of this program prints the current
 * state of the object for each of the three constructors (no argument, 2 argument, 
 * 4 arguments), and set the variables with appropriate data and prints the state of the 
 * object after inputting data. The second part of this program will accept file input 
 * from 5 files as specify in the assignment specifications. The sequences from within
 * the file will be concatenated by 3 different methods, and output the total time
 * it took to do the operation.
 */

/*
 * I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Name: Winfield Ly 
Student ID: 014587158
*/
public class TestSB {
	public static void main (String[] args) {
		
		StringBuilderMiniGenBankSeq testSB = new StringBuilderMiniGenBankSeq();
		long nanoseconds = testSB.testConcatenate(100000);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("Concatenating using StringBuilder using the 1k.txt 100,000 times took " + seconds + " seconds");
		
		StringBuilderMiniGenBankSeq testSB2 = new StringBuilderMiniGenBankSeq();
		long nanoseconds2 = testSB2.testConcatenate(10000);
		double seconds2 = nanoseconds2 / (double)1000000000; 
		System.out.println("Concatenating 10,000 times using StringBuilder using the 10k.txt took " + seconds2 + " seconds");
		
		StringBuilderMiniGenBankSeq testSB3 = new StringBuilderMiniGenBankSeq();
		long nanoseconds3 = testSB3.testConcatenate(1000);
		double seconds3 = nanoseconds3 / (double)1000000000; 
		System.out.println("Concatenating 1000 times using StringBuilder using the 100k.txt took " + seconds3 + " seconds");
		
		StringBuilderMiniGenBankSeq testSB4 = new StringBuilderMiniGenBankSeq();
		long nanoseconds4 = testSB4.testConcatenate(100);
		double seconds4 = nanoseconds4 / (double)1000000000; 
		System.out.println("Concatenating 100 times using StringBuilder 1M.txt took " + seconds4 + " seconds");
		
		StringBuilderMiniGenBankSeq testSB5 = new StringBuilderMiniGenBankSeq();
		long nanoseconds5 = testSB5.testConcatenate(10);
		double seconds5 = nanoseconds5 / (double)1000000000; 
		System.out.println("Concatenating 10 times using StringBuilder 10M.txt took " + seconds5 + " seconds");
	
	}
}
