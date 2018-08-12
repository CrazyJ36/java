class doWhileLoop {
  public static void main(String[] args) {

/* The difference between while-loop and do-while-loops is
   that do-while-loops are guarenteed to run at least once. */
    int x = 0;
    do {
      System.out.println(x);
      x++;
    } while (x < 5);

  }
}
