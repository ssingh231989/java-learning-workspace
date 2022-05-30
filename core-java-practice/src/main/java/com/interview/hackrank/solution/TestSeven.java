package com.interview.hackrank.solution;

public class TestSeven extends Thread{
    private static int x;
    public synchronized void doThings(){
        int current=x;
        current++;
        x=current;
        System.out.println(x+" - "+current);
    }

    @Override
    public void run() {
    doThings();
    }

    public static void main(String args[]) {

        Thread t1= new Thread(new TestSeven());
        Thread t2= new Thread(new TestSeven());
        Thread t3= new Thread(new TestSeven());

        t1.start();
        t2.start();
        t3.start();
    }

}
