import java.util.Scanner;

class inputScanner {
  public static void main(String[] args) {
    System.out.println("Enter Some Text:");
    Scanner inputMethod = new Scanner(System.in); // Init new Scanner
    String confirm = "You typed: ";
    String userText = inputMethod.nextLine(); // get nextLine to string
    System.out.println(confirm + userText); // print entered string
  }
}
