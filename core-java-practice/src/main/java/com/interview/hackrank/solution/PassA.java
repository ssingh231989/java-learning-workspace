package com.interview.hackrank.solution;

/**
 * o/p 15 15
 */
public class PassA {

	public static void main(String[] args) {

		PassA passA = new PassA();
		passA.start();
	}
	
	void start() {
		long[] a1= {3,4,5};
		long[] a2= fix(a1);
		System.out.println(a1[0]+a1[1]+a1[2]+" ");
		System.out.println(a2[0]+a2[1]+a2[2]+" ");
	}
	
	long [] fix(long [] a3) {
		a3[1]=7;
		return a3;
	}
	

}
