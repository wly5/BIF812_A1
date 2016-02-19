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
public class StringBuilderMiniGenBankSeq extends MiniGenBankSeq {
	
	@Override
	public void concatenate(String s, int times) {
		StringBuilder sb = new StringBuilder(sequence);
		for(int i=0; i < times; i++){
			System.out.println("Concatenating using StringBuilder. Concatenating time " + i + " of " + times);
			sb.append(s);
		}
		sequence = sb.toString();
		
	}
	@Override
	public String toString() {
		return super.toString() + " Sequence: " + sequence;
	}
}
