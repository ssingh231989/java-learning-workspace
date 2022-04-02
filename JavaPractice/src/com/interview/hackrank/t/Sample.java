package com.interview.hackrank.t;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.interview.*;

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
