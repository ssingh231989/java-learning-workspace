package com.interview.hackrank;

public class Test {
        public static void main(String args[]){
            PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

            priorityQueue.add("c");
            priorityQueue.add("a");
            priorityQueue.add("b");

            System.out.println(priorityQueue.poll+" "+priorityQueue.peek());
        }
}
