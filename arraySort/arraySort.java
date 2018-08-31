// the java.util.Arrays package has A default sort method
import java.util.Arrays;

class arraySort {

  public static void main(String[] args) {

    /* type[] name = {...};
       or
       type name[] = {...};
       work
    */
    int[] myNums = { 4, 3, 6, 1, 2, 5 };

    // simple default ascending sort
    Arrays.sort(myNums);

    // print the length of the array
    for (int i: myNums) { // traverse array with enhanced for loop
      System.out.println(i); // use println(i), not myNums[i], according to enhanced for loop syntax
    }

  }
}
