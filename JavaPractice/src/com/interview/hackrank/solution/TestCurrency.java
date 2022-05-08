package com.interview.hackrank.solution;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCurrency {
    private static Object A = new Object();
    private static Object B = new Object();

    public static void main(String[] args) {

        new Thread(() -> {
            acqlock(A);
            System.out.println("Ack A");
            acqlock(B);
            System.out.println("Ack B");
            releaselock(B);
            releaselock(A);
        }
        ).start();

        new Thread(() -> {
            acqlock(B);
            System.out.println("Ack B");
            acqlock(A);
            System.out.println("Ack A");
            releaselock(A);
            releaselock(B);
        }
        ).start();
    }

    private static void acqlock(Object o) {

    }

    private static void releaselock(Object o) {

    }
}
