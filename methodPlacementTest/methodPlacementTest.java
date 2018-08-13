class methodPlacementTest {
  /** Proving that java can see methods above main()... **/
  static void method1() {
    System.out.println("Method 1");
  }

  public static void main(String[] args) {
    method1();
    method2();
  }
  // or below main().
  static void method2() {
    System.out.println("Method 2");
  }

}
