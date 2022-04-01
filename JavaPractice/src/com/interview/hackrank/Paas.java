package com.interview.hackrank;

public class Paas {

	public static void main(String[] args) {
		Paas p = new Paas();
		p.start();
	}
	void start() {
		String s1 = "slip";
		String s2 = fix(s1);
		System.out.println(s1 + "" + s2);//slipstream
	}
	String fix(String s1) {
		s1 = s1 + "stream";
		System.out.println(s1 + ""); //slipstream
		return "stream";
	}
}
