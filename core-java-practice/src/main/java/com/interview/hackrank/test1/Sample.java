package com.interview.hackrank.test1;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Sample {

	public static void main(String[] args) {
		HashMap props = new HashMap();

		props.put("key45","some value");

		props.put("key12","some other value");

		props.put("key39","yet another value");

		Set s = props.keySet();
		
		
		s= new TreeSet(s);
		System.out.println(s);
	}

}
