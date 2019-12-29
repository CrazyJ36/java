class waitSleep {
  public static void main(String[] args) throws InterruptedException {
      System.out.println("Wait 2 Seconds...");
      // Cause CPU thread for this 'single' process to wait 2 seconds.
      // This appears safe for use on console as compared to android main threads or windows process
      // because there is only one thread visible, no gui main loop would be interrupted.
      Thread.sleep(2000);
      System.out.println("Done");
  }
}
