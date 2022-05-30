package com.interview.hackrank.solution;

import java.util.PriorityQueue;

public class PQ {
    public static void main(String args[]) {

        PriorityQueue<String> pq = new  PriorityQueue<String>();
        pq.add("carrot");
        pq.add("apple");
        pq.add("banana");
        System.out.println(pq.poll()+""+pq.peek());

    }
}
