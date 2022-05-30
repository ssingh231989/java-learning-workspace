package com.interview.hackrank.solution;

import java.util.HashSet;

/**
 * o/p : 3
 */
public class WrappedString {

	private String s;
	
	public WrappedString(String s) {
		this.s=s;
	}
	public static void main(String[] args) {

		HashSet<Object> hashSet = new HashSet<Object>();
		WrappedString strig = new WrappedString("aa");
		WrappedString strig2 = new WrappedString("aa");
		String s1=new String("aa");
		String s2=new String("aa");
				
		hashSet.add(strig2);
		hashSet.add(s2);
		hashSet.add(s1);
		hashSet.add(strig);
		
		System.out.println(hashSet.size());
				
	}

}
