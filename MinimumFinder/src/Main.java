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
	    	System.out.println("Error " + e.toString() );
	    	e.printStackTrace();
	    }
	    
	    s = scanner.nextLine();
	    
	    }
	}

}
