/* Every java thread is prioritized by the
   System to determine the order in which to
   schedule threads. Priorities 1 to 10, default 5.
   You can set this with setPriority() */

public class threadRunStart extends Thread {

    /* Method to run. This runs outside of the main thread. */
    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {
        System.out.println("main");

        // Start running thread. new threadRunStart gets the run method.
        threadRunStart method = new threadRunStart();
        method.start(); /* start() can only be called once */
    }
}
