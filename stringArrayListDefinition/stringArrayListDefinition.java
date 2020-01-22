/* String array Syntax, either or:
   String[] name = new type[int num_of_elements];
   String[] name = {"items", "items"};
*/

import java.util.Arrays;

class stringArrayListDefinition {
    public static void main(String[] args) {

        // String array of 3 strings named stuff initialized with items.
        String[] stringArray1 = { "one", "two", "three"};
    	// Use 'Arrays.toString()' to put whole list into one String. Like a list.
        String stringArray1AsString = Arrays.toString(stringArray1);
        System.out.println("stringArray1 as String: " + stringArray1AsString);
        // Original string array still exists. Printing 2nd index item.
        System.out.println("stringArray[1]: " + stringArray1[1]);

        // Initialize with predefined array size to save memory.
        String[] stringArray2 = new String[3];
        // Set items for stringArray2.
        stringArray2[0] = "four";
        stringArray2[1] = "five";
        stringArray2[2] = "six";
        // Info.
        System.out.println("Made stringArray2[3] with \"four\", \"five\", \"six\"");
        // Print an index element of stringArray2.
        System.out.println("stringArray2[1]: " + stringArray2[1]);
    }
}
