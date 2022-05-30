package com.interview.hackrank.solution;

import java.util.HashMap;
import java.util.Objects;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 420;
    }

    public static void main(String args[]) {
        HashMap<Person, String> map = new HashMap<Person, String>();
        map.put(new Person("A"), "A");
        map.put(new Person("B"), "B");
        map.put(new Person("C"), "C");

        System.out.println(map.size());
        map.remove(new Person("A"));
        System.out.println(map.size());

        for (Person p : map.keySet()) {
            System.out.println(p.name);
        }

    }
}
