package com.designpattern;


// Fully initialized instance to be copied or clone
// eg : the ludo game has initial structure

interface Prototype {
    Prototype getClone();
}

class Employee implements Prototype {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Prototype getClone() {
        return new Employee(name,age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class PrototypeDesignPattern {

    public static void main(String args[]) {

        Employee e1= new Employee("a",1);
        System.out.println(e1.toString());

        Employee e2=(Employee) e1.getClone();
        System.out.println(e2.toString());
    }
}
