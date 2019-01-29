/*--------countAlphabet.java--------
  There are 26 letters in the English Alphabet,
  this clounts them all using A for loop.
*/
public class countAlphabet {

    public static void main(String[] args) {

        // Here's all letters in an array.
        char alphabet[] = {'a','b','c','d','e','f',
            'g','h','i','j','k','l','m',
            'n','o','p','q','r','s','t',
            'u','v','w','x','y','z'};

        // Get total index count of array.
        int count = 0;
        for (int num = 0; num < alphabet.length; num++) {
            count = count + 1;
        }

        // Print times counted.
        System.out.println(count);

        // Program over.
        System.exit(0);
      }
}
