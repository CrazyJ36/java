import java.util.Scanner;
public class ScannerMatchString {
    public static void main(String[] args) {
	    System.out.println("This tests to check whether or not your cli input " // No comma, concats in one '()'
	        + "from java.util.Scanner mathes what is expected.\n\n"
			+ "Try by typing \"hello\" or other:");
        Scanner inScan = new Scanner(System.in);
		String input = inScan.nextLine();
		if ( input.equals("hello") ) {
		    System.out.println("\nInput was \"hello\". Matched.");
		} else {
		    System.out.println("\nInput was not \"hello\". Did not match.");
	    }
		System.exit(0);
    }
}