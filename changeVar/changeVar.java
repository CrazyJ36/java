public class changeVar {

public static void main(String [] args) {

  int x = 1;
  System.out.println("Coded as:\nint x = " + x);
  System.out.println("when changing the same variable name, the type doesn't need to be");
  System.out.println("declared, int x = 2 now would throw an \"already defined\" exception error.");
  x = 2;
  System.out.println("but typing: x = 2; is allowed as were simple changing the value of an already defined int\nx = " + x);
  }

}
