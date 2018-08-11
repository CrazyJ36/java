public class incrementDecrement {

  public static void main(String[] args) {

    /* x++
       Postfix: The variable's value is first use
       d in the expression and is then increased.
       explain:, then ++ it*/

    int x = 3;
    System.out.println("x = 3: " + x);
    int y = x++; //y = x(printed as was/is) then x is incremented for later use as y.
    System.out.println("y = x++, y is x, x is incremented, y: " + y + "\nx is now: " + x);

    /* ++x
       Prefix: Increments the variable's value and
       uses the new value in the expression.
       explain: the ++ of x*/
    int a = 1;
    System.out.println("\n\na is: " + a);
    int b = ++a;
    System.out.println("b = ++a, both a and b incremented, b: " + b + "\na: " + a);

  }
}
