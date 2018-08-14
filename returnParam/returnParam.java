class returnParam {
  // This demonstrates how to return A end-value from A succesfully-run method.

  public static void main(String[] args) {
    System.out.println(aMethod());

  }
  /* The aMethod method itself simply 'is' x which is 2. So then all we need to do is
     Print aMethod() in main().
  */
  static int aMethod() {  // Since we are trying to return an int value to main,
    int x = 2;            //  aMethod itself returns 'int' not 'void'.
    return x;
  }

}
