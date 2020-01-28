/* java.lang.StringBuilder can append text to one string.
   Useful when you need to traverse an array of strings into one.
*/

import java.lang.StringBuilder;

class stringBuilderUsage {
	public static void main(String[] args) {
	    String[] strings = {"one", "two", "three", "four"};
        System.out.println("We have A string array of {\"one\", \"two\"} ... up to four\n\n");
	    System.out.println("Printing string array directly only prints it's object:\n" + strings + "\n\n");

        System.out.println("We don't want this, so java.lang.StringBuilder can append stringarray\n"
            + "items to one string when you traverse the array in for loop:\n");

        StringBuilder stringBuilder = new StringBuilder();

        for (String current : strings) {
            stringBuilder.append(current);
        }
        System.out.println(stringBuilder.toString());

        System.exit(0);
	}
}
