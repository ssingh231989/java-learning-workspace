package com.interview.practise;

@FunctionalInterface
interface A {
    public void m1();
}

@FunctionalInterface
interface B extends A {
    //public void m2();
}


interface Fun {
    public void fun1();

    public static void fun2() {
        System.out.println("Static Fun2");
    }

    public default void fun3() {
        System.out.println("Default Fun3");
    }

}

public class FunctionalInterfaceDemo implements Fun {

    public static void main(String args[]) {

        FunctionalInterfaceDemo functionalInterfaceDemo = new FunctionalInterfaceDemo();
        functionalInterfaceDemo.fun1();
        functionalInterfaceDemo.fun3();

        Fun.fun2();

    }

    @Override
    public void fun3() {
        System.out.println("Overrider fun3");
    }

    @Override
    public void fun1() {
        System.out.println("abstract Fun1");
    }
}
