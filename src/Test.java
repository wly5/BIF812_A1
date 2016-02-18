
public class Test {
	public static void main(String[] args) {
		
		MiniGenBankSeq test = new MiniGenBankSeq();
		long nanoseconds = test.testConcatenate(100000);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("Concatenating 100,000 times using concatenate method from SequenceLoader using the 1k.txt took " + seconds + " seconds");
		
		MiniGenBankSeq test2 = new MiniGenBankSeq();
		long nanoseconds2 = test2.testConcatenate(10000);
		double seconds2 = nanoseconds2 / (double)1000000000;
		System.out.println("Concatenating 10,000 times using concatenate method from SequenceLoader using the 10k.txt took " + seconds2 + " seconds");
		
		MiniGenBankSeq test3 = new MiniGenBankSeq();
		long nanoseconds3 = test3.testConcatenate(1000);
		double seconds3 = nanoseconds3 / (double)1000000000;
		System.out.println("Concatenating 1000 times using concatenate method from SequenceLoader using the 100k.txt took " + seconds3 + " seconds");
		
		MiniGenBankSeq test4 = new MiniGenBankSeq();
		long nanoseconds4 = test4.testConcatenate(100);
		double seconds4 = nanoseconds4 / (double)1000000000;
		System.out.println("Concatenating 100 times using concatenate method from SequenceLoader using the 1M.txt took " + seconds4 + " seconds");
		
		MiniGenBankSeq test5 = new MiniGenBankSeq();
		long nanoseconds5 = test5.testConcatenate(10);
		double seconds5 = nanoseconds5 / (double)1000000000;
		System.out.println("Concatenating 10 times using concatenate method from SequenceLoader using the 10M.txt took " + seconds5 + " seconds");
		
	}
	
	
}
