package com.interview.hackrank.test1;

import java.util.Arrays;
import java.util.HashMap;

public class Person {

    private String fname;
    private String lname;

    public Person(String fname,String lname) {

        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 13;
    }

    public static void main(String args[]) {

        Person p1= new Person("A","A1");
        Person p2= new Person("B","B1");


        p1.ope();
        HashMap<Person, String> map = new HashMap<Person, String>();
        map.put(p1, "A");
        map.put(p2, "B");
        map.put(new Person("C","c1"), "C");

        System.out.println(map.size());
        System.out.println(map.get(new Person("C","c1")));


    }


    public void ope(){
        try{
            int [] d={1,2,3,4,5};
            System.out.println(d[1]/0);
            try{

            }catch (ArithmeticException e){
                System.out.println("ArithmeticException");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
