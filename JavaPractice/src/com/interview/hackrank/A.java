package com.interview.hackrank;

class X {
}

class Y extends X {
}

class Z extends Y {
}

public class A {
	public static void main(String args[]) {
		Y y = new Y();
		/*
		 * System.out.println(y instanceof X); System.out.println(!(y instanceof X));
		 * System.out.println(y instanceof Z); System.out.println(!(y instanceof Z));
		 */
		System.out.println(y instanceof Y);
		System.out.println((y instanceof Y) && (!(y instanceof X)));
		System.out.println((y instanceof Y) && (!(y instanceof Z)));
	}
}
