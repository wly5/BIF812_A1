
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
