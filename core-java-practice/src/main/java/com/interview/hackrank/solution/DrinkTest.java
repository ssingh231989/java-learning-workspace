package com.interview.hackrank.solution;

import java.util.Iterator;
import java.util.TreeSet;

class Drink implements Comparable{
    public String name;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class DrinkTest {
    public static void main(String args[]) {
        Drink one = new Drink();
        Drink two = new Drink();
        one.name="Coffee";
        two.name="Tea";

        TreeSet<Drink> treeSet = new TreeSet();
        treeSet.add(one);
        treeSet.add(two);
        treeSet.stream().forEach(c->System.out.println(c.name));

    }
}
