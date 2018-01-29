/** This app demonstrates how to get user input during
* execution of A program in the main() block.*/

/* It's needed to import Java Scanner for this input */
import java.util.Scanner;
class userInput {
    public static void main(String[] args) {
/* First, the app is instructing the user to type some text
* using "println", as that's the point of this example*/
        System.out.println("Type Text: ");
/* Then we need to call A new "System in" Scanner from the
* imported class at the first line to start reading console input.
* The syntax of the next line is, from left to right:
*
* Scanner: using javas' 'Scanner' class which can get input.
* userText: Giving 'Scanner' A custom variable name 'userText'.
* =: The Java Scanner and userText 'equals' what we do next.
* new: A new instance of the following.
* Scanner(System.in): Start 'System in Scanner' to read input.

* The user will type something, then we have that data.
*/
        Scanner userText = new Scanner(System.in);
/* Now that we have some input from after the typing user
* pressed 'Enter', we can do something with that data.
* We'll simply show what they typed. A variable character
* 'String' given the value of 'message' will equal "You typed".
* We will use this message later
*/
        String message = "You typed: ";
/* Printing the last line of app output will show the 'message'
* variable, and userText. Specificly the 'nextLine' from when 
* we started the Scanner. Which would have been the line of input.
*/
        System.out.println(message + userText.nextLine());
   }
}
