public class timer {
  public static void main(String[] args) throws InterruptedException {
    for (int x = 0; x < 5; x++) {
      System.out.println(x);
      Thread.sleep(1000);
    }
  }
}
