import java.util.*;
public class charVsStr {
  public static void main(String[] args) {

    String text = "text ";
    /* A 'char' must use single quotes(char letter = 'a';),
       unlike the double quotes of a string(String text = "hi";).
       or the error 'cannot convert a char to string' occurs.
    */
    char letter = 'a';
    System.out.println(text + letter);
  }
}
