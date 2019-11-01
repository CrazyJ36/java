class calc {
 public static void main(String args[]) {

  try {
    int num0 = Integer.parseInt(args[0]);
    int num1 = Integer.parseInt(args[2]);
    String s = args[1];
  } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
    System.out.println("Error, either of: not numbers, or wrong amount of paramters, unknown operator.\nType as:java calc number <+-x/> number");
    System.exit(0);
  }
// you can use multiple catch blocks under one try, then print the reason for error.

  int num0 = Integer.parseInt(args[0]);
  String s = args[1];
  int num1 = Integer.parseInt(args[2]);
  double a = 0;

  if (s.equals("+")) {
    a = num0 + num1;
  }
  else if (s.equals("-")) {
    a = num0 - num1;
  }
  else if (s.equals("x")) {
    a = num0 * num1;
  }
  else if (s.equals("/")) {
    a = ((double)num0) / num1;
  }
  else {
    System.out.println("Error: unknown mathmatical symbol: " + s);
    System.exit(0);
  }

  System.out.println("Answer is: " + a);
  
/*  double div = ((double)n0) / n1;
    System.out.println(div); */
  }
}
