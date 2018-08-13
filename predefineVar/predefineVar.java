class predefineVar {

  // preprocessing or defining static variables to reserve memory before main runs
  static int x;

  public static void main(String[] args) {
    // int x was already defined, so we assign it a value and use it.
    x = 3;
    System.out.println(x);
  }

}
