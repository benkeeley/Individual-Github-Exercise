
public class MinFinder {

	public static int findMinimumDigit(int i) {
	
		int digit = i % 10;
		int leastDigit = digit;
		
		int j = (int) (i * 0.1);
		
		while(j > 0) {
			digit = j % 10;
			
			if(digit < leastDigit)
				leastDigit = digit;
			j =  (int) (j * 0.1);
		}
		
		return leastDigit;
	}
	
	public static char findMinimumChar(String s) {
		
		char minChar = s.charAt(0);
		
		for(int i = 0; i < s.length(); i++) {
			
			char currChar = s.charAt(i);
			
			if(minChar > currChar)
				minChar = currChar;
		}
		
		return minChar;
	}
}
