import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	System.out.println("Type in an integer or a string");
		
	    Scanner scanner = new Scanner(System.in);  // Create a Scanner object

	    String s = scanner.nextLine();
	    
	    while(!s.equals("bye")) {
	    
	    try { 
	    int i = Integer.parseInt(s);
	    System.out.println("The smallest digit is: " + MinFinder.findMinimumDigit(i));
	   
	    }
	    catch(NumberFormatException e){
	    	System.out.println("The smallest char of " + s + " is " + MinFinder.findMinimumChar(s)) ;
	    }
	    
	    s = scanner.nextLine();
	    
	    }
	}

}
