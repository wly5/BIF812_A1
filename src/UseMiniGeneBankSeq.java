
public class UseMiniGeneBankSeq {

	public static void main(String[] args) {
		// Instantiate (create a new instance of) the MiniGenBankSeq class
		// Using default constructor
		// Data taken from this record: http://www.ncbi.nlm.nih.gov/nucleotide/U49845
		MiniGenBankSeq entry = new MiniGenBankSeq();
		// Display the state of MiniGenBankSeq entry
		System.out.println("Output for the default constructor before initialization: \n" + entry.toString());
		entry.setLocus("SCU49845                5028 bp    DNA     linear   PLN 23-MAR-2010");
		entry.setAccessionNumber("U49845");
		entry.setDefinition("Saccharomyces cerevisiae TCP1-beta gene, partial cds, and Axl2p (AXL2) and Rev7p (REV7) genes, complete cds.");
		entry.setSource("Saccharomyces cerevisiae (baker's yeast)");
		System.out.println("Output for the default constructor after initialization: \n" + entry.toString());
		
		// Instantiate a second instance of MiniGenBankSeq  using the non default 2 argument constructor
		// Data taken from this record: http://www.ncbi.nlm.nih.gov/nucleotide/AF090832
		MiniGenBankSeq entry2 = new MiniGenBankSeq("AF090832                5086 bp    DNA     linear   INV 04-AUG-1999", "AF090832");
		// Display the state of MiniGenBankSeq entry2
		System.out.println("Output for the 2 argument constructor before initialization: \n" + entry2.toString());
		entry2.setDefinition("Drosophila melanogaster muscle LIM protein at 84B (Mlp84B) gene, complete cds.");
		entry2.setSource("Drosophila melanogaster (fruit fly)");
		System.out.println("Output for the 2 argument constructor after initialization: \n" + entry2.toString());
		
		// Instantiate a third instance of MiniGenBankSeq using the non default 4 argument constructor
		// Data taken from this record: http://www.ncbi.nlm.nih.gov/nucleotide/AF165912
		MiniGenBankSeq entry3 = new MiniGenBankSeq("AF165912                5485 bp    DNA     linear   PLN 29-JUL-1999", "AF165912", "Arabidopsis thaliana CTP:phosphocholine cytidylyltransferase (CCT) gene, complete cds.", "Arabidopsis thaliana (thale cress)");
		// Display the state of MiniGenBankSeq entry3
		System.out.println("Output for the 4 argument constructor: \n" + entry3.toString());
	}
	
}
