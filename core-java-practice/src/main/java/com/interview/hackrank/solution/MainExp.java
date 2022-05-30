package com.interview.hackrank.solution;

class Base {
    public void print() {
        System.out.print("Base");
    }
}

class Drive extends Base {
    public void print() {
        System.out.print("Drive");
    }
}

/**
 * o/p Base Drive Drive
 */
public class MainExp {

    public static void DoPrint(Base o) {
        o.print();
    }

    public static void main(String[] args) {

        Base x = new Base();
        Base y = new Drive();
        Drive z = new Drive();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }


}
