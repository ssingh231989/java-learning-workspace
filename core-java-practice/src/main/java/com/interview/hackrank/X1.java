package com.interview.hackrank;

public class X1 {

    public static void main(String arp[]){
        try{
            System.out.println("A");
            bad();
        }catch (Exception e){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void bad(){}
}
