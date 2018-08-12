class loopBreak {
  public static void main(String[] args) {
    int x = 0;
    while (x < 5) {
      System.out.println(x);
      x++;
      if (x == 3) {
        break;
      }
    }
  }
}
