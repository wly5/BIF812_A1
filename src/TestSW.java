
public class TestSW {
	public static void main (String[] args) {
		
		StringWriterMiniGenBankSeq testSW = new StringWriterMiniGenBankSeq();
		long nanoseconds = testSW.testConcatenate(100000);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("Concatenating 100,000 times using StringWriter using the 1k.txt took " + seconds + " seconds");
		
		StringWriterMiniGenBankSeq testSW2 = new StringWriterMiniGenBankSeq();
		long nanoseconds2 = testSW2.testConcatenate(10000);
		double seconds2 = nanoseconds2 / (double)1000000000;
		System.out.println("Concatenating 10,000 times using StringWriter using the 10k.txt took " + seconds2 + " seconds");
		
		StringWriterMiniGenBankSeq testSW3 = new StringWriterMiniGenBankSeq();
		long nanoseconds3 = testSW3.testConcatenate(1000);
		double seconds3 = nanoseconds3 / (double)1000000000;
		System.out.println("Concatenating 1000 times using StringWriter using the 100k.txt took " + seconds3 + " seconds");
		
		StringWriterMiniGenBankSeq testSW4 = new StringWriterMiniGenBankSeq();
		long nanoseconds4 = testSW4.testConcatenate(100);
		double seconds4 = nanoseconds4 / (double)1000000000;
		System.out.println("Concatenating 100 times using StringWriter using the 1M.txt took " + seconds4 + " seconds");
		
		StringWriterMiniGenBankSeq testSW5 = new StringWriterMiniGenBankSeq();
		long nanoseconds5 = testSW5.testConcatenate(10);
		double seconds5 = nanoseconds5 / (double)1000000000;
		System.out.println("Concatenating 100 times using StringWriter using the 10M.txt took " + seconds5 + " seconds");
		
	}

}
