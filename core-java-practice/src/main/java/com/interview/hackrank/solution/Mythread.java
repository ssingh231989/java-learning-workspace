package com.interview.hackrank.solution;

class Mthread extends Thread{

    Mthread(){

    }
    Mthread(Runnable runnable){
        super(runnable);
    }
    public void run(){
        System.out.println("inside thread");
    }

}
class Myrunnable implements Runnable{
    public void run(){
        System.out.println("inside runnable");
    }
}
public class Mythread {

    public static void main(String ar[]){
        new Mthread().start();
        new Mthread(new Myrunnable()).start();
    }

}
