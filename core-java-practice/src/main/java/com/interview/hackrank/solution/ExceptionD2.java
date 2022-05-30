package com.interview.hackrank.solution;

/**
 * o/p
 *  C
 * Exception in thread "main" java.lang.Error
 * 	at com.interview.hackrank.solution.ExceptionD2.badMethod(ExceptionD2.java:19)
 * 	at com.interview.hackrank.solution.ExceptionD2.main(ExceptionD2.java:8)
 */
public class ExceptionD2 {

	public static void main(String[] args) {

		try {
			badMethod();
			System.out.println("A");
		}catch (Exception e) {
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
		System.out.println("D");
	}

	private static void badMethod() {
		throw new Error();
	}
}
