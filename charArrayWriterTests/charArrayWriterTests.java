import java.io.CharArrayWriter;

class charArrayWriterTests {

    public static void main(String[] args) {

        /* Create new character array */
        CharArrayWriter charArrayWriter = new CharArrayWriter();

        /* Checking CharArrayWriter type here, it is not
        String or CharArray but writes to an array, so the
        resulting CharArray is directly printable, but it's
        not indexable. To prints single values of the written
        char array, I'll use CharArrayWriter.toCharArray() later. */
        System.out.println("CharArrayWriterType: " + charArrayWriter.getClass() + "\n");  /* returns CharArrayWriter */

        /* Append characters to writers' array*/
        System.out.println("CharArrayWriter.append() an \'a\', and A \'b\'.\n");
        charArrayWriter.append('a');
        charArrayWriter.append('b');

        /* Make arrayWriter A usable String, and print only the first index as A test. */
        char[] arrayWritersArray = charArrayWriter.toCharArray();
        System.out.println("charArrayWriter.toCharArray, index 0: " + arrayWritersArray[0] + "\n");

        /* Get current size of charArray */
        int charArrayWriterSize = charArrayWriter.size();
        System.out.println("CharArrayBuffer current size: " + charArrayWriterSize + "\n");

        /* Print what CharArrayWriter writer has done. */
        System.out.println("Current CharArrayWriter value: " + charArrayWriter + "\n");
    }

}
