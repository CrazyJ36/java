class returnParam {
  // This demonstrates how to return A end-value from A succesfully-run method.

  public static void main(String[] args) {
    // by printing 2, means that println(aMethod()) printed the returned it's object successfully
    System.out.println(aMethod());
  }
  /* The aMethod method itself simply 'is' 2, then all we need to do is
     Print aMethod() in main().
  */
  static int aMethod() {  // Since we are trying to return an int value to main,
    return 2;             //  aMethod itself returns 'int' not 'void'.
  }

}
