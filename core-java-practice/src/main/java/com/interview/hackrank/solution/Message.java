package com.interview.hackrank.solution;

/**
 * below 4 value will print in all combition
 * Gromit-1
 * Gromit-2
 * Wallace-1
 * Wallace-2
 */
public class Message implements Runnable {
    public static void main(String args[]) {

        new Thread(new Message("Wallace")).start();
        new Thread(new Message("Gromit")).start();
    }

    private String name;

    public Message(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        message(1);
        message(2);
    }

    private synchronized void message(int n) {
        System.out.println(name + "-" + n + " ");
    }

}
