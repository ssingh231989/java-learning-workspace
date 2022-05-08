package com.interview.hackrank.solution;

class Base1 {
    Base1() {
        this("1");
    }

    Base1(String s) {
        System.out.println("super-" + s);
    }
}

public class Child extends Base1 {
    Child(String s) {
        System.out.println("sub-" + s);
    }

    public static void main(String[] args) {
        Child child
                = new Child("2");
    }
}
