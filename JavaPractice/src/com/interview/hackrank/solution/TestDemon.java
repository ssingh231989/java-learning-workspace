package com.interview.hackrank.solution;

public class TestDemon extends Thread {
    @Override
    public void run() {
        System.out.println("Running thread");
    }

    public static void main(String arp[]) {
        TestDemon testDemon = new TestDemon();
            testDemon.setDaemon(false);
            testDemon.start();
            testDemon.setDaemon(true);
    }
}
