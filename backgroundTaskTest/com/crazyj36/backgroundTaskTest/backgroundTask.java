package com.crazyj36.backgroundTaskTest;

public class backgroundTask implements Runnable {
    // background task to run.
    public void run() {
        System.out.println("background task.");
        System.exit(0);
    }
}

