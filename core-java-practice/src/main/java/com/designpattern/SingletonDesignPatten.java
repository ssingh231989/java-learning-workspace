package com.designpattern;

/**
 * Singleton pattern is a design pattern which restricts a class to instantiate its multiple objects
 */

class SingleInstance {

    private static SingleInstance instance = new SingleInstance();

    private SingleInstance() {

    }

    public static SingleInstance getInstance() {
        if (instance == null) {
            synchronized (SingleInstance.class) {
                if (instance == null) {
                    return new SingleInstance();
                }
            }
        }
        return instance;
    }

    public void getMessage() {
        System.out.println("Object Created");
    }

}

public class SingletonDesignPatten {
    public static void main(String args[]) {
        SingleInstance instance1 = SingleInstance.getInstance();
        instance1.getMessage();
        System.out.println("Object Created 1 " + instance1.hashCode());

        SingleInstance instance2 = SingleInstance.getInstance();
        instance2.getMessage();
        System.out.println("Object Created 2 " + instance2.hashCode());
    }
}
