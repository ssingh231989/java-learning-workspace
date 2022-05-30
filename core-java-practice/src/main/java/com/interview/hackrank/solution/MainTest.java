package com.interview.hackrank.solution;

class A {

}

class B extends A {

}

class C extends B {

}

public class MainTest {
    public static void main(String args[]) {

        B b = new B();
        System.out.println("b instanceof B" + (b instanceof B));
        System.out.println("b instanceof B" + ((b instanceof B) && (!(b instanceof A))));
        System.out.println("b instanceof B" + ((b instanceof B) && (!(b instanceof C))));
    }
}
