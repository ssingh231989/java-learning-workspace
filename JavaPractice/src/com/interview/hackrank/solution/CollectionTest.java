package com.interview.hackrank.solution;

import java.util.*;

public class CollectionTest {
    public static void main(String args[]) {

        HashMap hashMap = new HashMap();
        hashMap.put("key45","some value");
        hashMap.put("key12","some other value");
        hashMap.put("key39","yet another value");
        Set s= hashMap.keySet();
        s= new TreeSet(s);
        //s= new SortedSet() ;
    }
}
