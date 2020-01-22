package com.crazyj36.backgroundTaskTest;

import java.lang.Thread;

public class mainThread {
    public static void main(String[] args) {
        System.out.println("main");

        // start backgroundTask from this main thread.
        Thread thread = new Thread(new backgroundTask());
        thread.start();
    }
}
