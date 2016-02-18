import java.io.StringWriter;

public class StringWriterMiniGenBankSeq extends MiniGenBankSeq {
	
	@Override
	public void concatenate(String s, int times) {
		StringWriter sw = new StringWriter();
		for(int i=0; i < times; i++){
			System.out.println("Concatenating using StringWriter. Concatenating time " + i + " of " + times);
			sw.append(s);
		}
		sequence = sw.toString();
		
	}
	@Override
	public String toString() {
		return super.toString() + " Sequence: " + sequence;
	}


}
