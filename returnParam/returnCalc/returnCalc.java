class returnCalc {
  /* as sum() returns a value, it can be assigned to a variable. Though it's easier to run sum
     as an arg to println(). */
  public static void main(String[] args) {
    System.out.println(sum(2,4));
  }
  static int sum(int x, int y) {
  // As oposed to simply doing println(x, y) here, x + y will be the result of the method(returned),
  // and therefore can be printed when the method is run.
    return x + y;
  }
}
