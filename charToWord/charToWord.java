import java.util.Scanner;

public class charToWord {
    
	public static void main(String[] args) {
        
        System.out.println("Type A character a-z,\nI'll give A word that starts with what you entered.");
        Scanner input = new Scanner(System.in);
        char in = input.next().charAt(0);
        input.close();
		
		String word = null;
        switch(in) {
			case 'a':
			  word = "Apple"; break;
			case 'b':
			  word = "Banana"; break;
			case 'c':
			  word = "Car"; break;
			case 'd':
              word = "Dinosaur"; break;
			default:
			  word = "No word defined for " + in + ". My fault."; break;
		}
		
        System.out.println(" A Word for your given character is: " + word);
        System.exit(0);
		
    }
}
