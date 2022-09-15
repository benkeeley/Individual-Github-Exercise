import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MinFinderTest {

	@Test
	void testFindMinimumDigit1() {
		
		System.out.println("Test 1");
		
		int numDigits = (int)(Math.random() * 4 + 3);
		
		int expectedMinDigit = 9;
		int numberToTest = 0;
				
		for(int i = 0; i < numDigits; i ++) {
			int digit = (int)(Math.random() * 10);
			
			while(i == numDigits -1 && digit == 0) {
				digit = (int)(Math.random() * 10);
			}
			
			System.out.println("Digit: " + digit);
			
			if(expectedMinDigit > digit) {
					expectedMinDigit = digit;
			}
			
			numberToTest += digit * Math.pow(10, i);
		}
		
		System.out.println("Random Number to test: " + numberToTest + " Expected min digit: " +  expectedMinDigit);
		
		int actualMinDigit = MinFinder.findMinimumDigit(numberToTest);
		
		System.out.println("Actual MinDigit: " + actualMinDigit);
		
		assertEquals(expectedMinDigit, actualMinDigit);
		
		System.out.println();
	}
	
	
	void testFindMinimumDigit2() {
		
		int number = 899987;
		int expectedMinDigit = 7;
		
		assertEquals(expectedMinDigit, MinFinder.findMinimumDigit(number));
		
	}

}
