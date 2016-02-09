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

	// getter methods
	public String getLocus() {
		if (locus.equals(null)) {
			return "Value not initialized.";
		}
		else {
			return locus;
		}
	}
	public String getAccessionNumber() {
		if (accessionNumber.equals(null)) {
			return "Value not initialized.";
		}
		else {
			return accessionNumber;
		}
	}
	public String getDefinition() {
		if (definition.equals(null)) {
			return "Value not initialized.";
		}
		else {
			return definition;
		}
	}
	public String getSource() {
		if (source.equals(null)) {
			return "Value not initialized.";
		}
		else {
			return source;
		}
	}
		
	// setter methods
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
	
	// No argument constructor
	public MiniGenBankSeq() {
		
	}
	
	// 2 argument constructor
	public MiniGenBankSeq(String locus, String accessionNumber) {
		this.locus = locus;
		this.accessionNumber = accessionNumber;
	}
	
	// 4 argument constructor
	// Data taken from this record: http://www.ncbi.nlm.nih.gov/nucleotide/AF165912
	public MiniGenBankSeq(String locus, String accessionNumber, String definition, String source) {
		this.locus = locus;
		this.accessionNumber = accessionNumber;
		this.definition = definition;
		this.source = source;
	}
	
	/**
	 * This method returns a string that contains this object's information in a 
	 * human readable string
	 */
	@Override
	public String toString(){
		return "Contents\n" + "Locus: " + locus + "\nAccession number: "+ accessionNumber + "\nDefinition: " + definition + "\nSource: " + source + "\n"; 
	}
	
}
