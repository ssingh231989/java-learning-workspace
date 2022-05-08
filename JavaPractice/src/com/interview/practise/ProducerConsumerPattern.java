package com.interview.practise;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Collectors;

class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
class Emp{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ProducerConsumerPattern {
    public static void main(String arg[]) throws InterruptedException {
       /* BlockingDeque<Message> b = new LinkedBlockingDeque<>();
        Thread t1=new Thread(new Producer(b));
        Thread t2=new Thread(new Consumer(b));
        t1.start();
        t2.start();*/

        List<Emp> list = new ArrayList<>();
        list.stream().map(Emp::getName).collect(Collectors.toList());
        HashMap<String,String> h = new HashMap<>();
        h.put(null,"as");
        h.put(null,"as1");
        h.put(null,"as2");

        System.out.println(h.values());

        Set<String> s1 = new HashSet<>();

        String s="12";
        s.concat("34");
        System.out.println(s.concat("34"));
    }
}

class Producer implements Runnable {
    private BlockingDeque<Message> prd;

    Producer(BlockingDeque<Message> prd) {
        this.prd = prd;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            Message m = new Message("" + i);
            try {
                Thread.sleep(10000);
                prd.put(m);
                System.out.println("Produce " + m.getMessage());
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer implements Runnable {

    private BlockingDeque<Message> con;

    public Consumer(BlockingDeque<Message> con) {
        this.con = con;
    }

    @Override
    public void run() {
        try {
            System.out.println("consumer " + con.take().getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

