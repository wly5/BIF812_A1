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

/**
 * This class has private variables that represents 4 pieces of information 
 * associated with a Genbank entry
 * @author Winfield
 *
 */
public class MiniGenBankSeq extends SequenceLoader {
	// Fields to identify a Genbank entry
	private String locus;
	private String accessionNumber;
	private String definition;
	private String source;

	/**
	 * getter methods for MiniGenBankSeq (locus, accession number, definition, source)
	 * It will return the value of 'locus' if it is already set, but if no value 
	 * is stored then it will return "Value not initialized"
	 */
	public String getLocus() {
		
		if (locus == null) {
			return "Value not initialized.";
		}
		else {
			return locus;
		}
	}
	/**
	 * It will return the value of 'accessionNumber' if it is already set, but if no value 
	 * is stored then it will return "Value not initialized"
	 */
	public String getAccessionNumber() {
		
		if (accessionNumber == null) {
			return "Value not initialized.";
		}
		else {
			return accessionNumber;
		}
	}
	/**
	 * It will return the value of 'definition' if it is already set, but if no value 
	 * is stored then it will return "Value not initialized"
	 */
	public String getDefinition() {
		
		if (definition == null) {
			return "Value not initialized.";
		}
		else {
			return definition;
		}
	}
	/**
	 * It will return the value of 'source' if it is already set, but if no value 
	 * is stored then it will return "Value not initialized"
	 */
	public String getSource() {
		
		if (source == null) {
			return "Value not initialized.";
		}
		else {
			return source;
		}
	}
		
	/**
	 * setter methods for MiniGenBankSeq (locus, accession number, definition, source)
	 * @param locus
	 * @param accessionNumber
	 * @param definition
	 * @param source
	 */
	public void setLocus(String locus){
		this.locus = locus;
	}
	public void setAccessionNumber(String accessionNumber) {
		this.accessionNumber = accessionNumber;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * No argument constructor. The default value of the variables (locus, 
	 * accession number, definition, source) for this constructor is null.
	 */
	public MiniGenBankSeq() {

	}
	
	/**
	 * 2 argument constructor. The first two variables (locus, accession number) 
	 * are assigned to the 2 arguments for this constructor.
	 * The other two variables (definition, source) are set to null on default.
	 * @param locus
	 * @param accessionNumber
	 */
	public MiniGenBankSeq(String locus, String accessionNumber) {
		this.locus = locus;
		this.accessionNumber = accessionNumber;

	}
	
	/**
	 * 4 argument constructor. All four variables are assigned as arguments for this 
	 * constructor. 
	 * @param locus
	 * @param accessionNumber
	 * @param definition
	 * @param source
	 */
	public MiniGenBankSeq(String locus, String accessionNumber, String definition, String source) {
		this (locus, accessionNumber);
		this.definition = definition;
		this.source = source;
	}
	
	/**
	 * This method returns a string that contains this object's information in a 
	 * human readable string
	 */
	@Override
	public String toString(){
		return "Contents\n" + "Locus: " + getLocus() + "\nAccession number: "+ getAccessionNumber() + "\nDefinition: " + getDefinition() + "\nSource: " + getSource() + "\n"; 
	}
	
}
