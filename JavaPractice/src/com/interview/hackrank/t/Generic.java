package com.interview.hackrank.t;

class MyAdd<T>{
	void add(T t) {
		System.out.println("t"+t);
	}
}
public class Generic {

	public static void main(String[] args) {

		MyAdd<Number> add = new MyAdd();
		add.add(new Integer(1));
		add.add(new Double(1.0));
		
	}

}
