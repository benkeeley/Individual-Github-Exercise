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
		
		System.out.println();
		
		assertEquals(expectedMinDigit, actualMinDigit);
	}
	
	@Test
	void testFindMinimumDigit2() {
		
		System.out.println("Test2" );
		
		int number = 899987;
		int expectedMinDigit = 7;
		
		int actualMinDigit =  MinFinder.findMinimumDigit(number);
		
		System.out.println("Expected: " + expectedMinDigit + " Actual: " + actualMinDigit);
		
		System.out.println();
		
		assertEquals(expectedMinDigit, actualMinDigit );
		
	}
	
	@Test
	void testFindMinimumCharacter1() {
		
		System.out.println("Test3");
		
		int stringLength = 5;
		
		String string = "";
		
		char expectedMinChar = 'z';
		
		for(int i = 0; i< stringLength; i++) {
			char c = (char) ((Math.random() * ('z' - 'a' + 1)) + 'a');
		
			if(expectedMinChar > c)
				expectedMinChar = c;
			
			string += c;
		}
		
		char actualMinChar = MinFinder.findMinimumChar(string);
		
		System.out.println("For string: " + string + " Expected: " + expectedMinChar + " Actual: " + actualMinChar);
		
		System.out.println();
		
		assertEquals(expectedMinChar, actualMinChar);
	}
	
	@Test
	void testFindMinimumCharacter2() {
		
		System.out.println("Test4");
		
		String s = "Dinosaurs";
		char expectedMinChar = 'a';
		
		char actualMinChar = MinFinder.findMinimumChar(s);
		
		System.out.println("Expected: " + expectedMinChar + " Actual: " + actualMinChar);
		
		System.out.println();
		
		assertEquals(expectedMinChar, actualMinChar);
	}

}
