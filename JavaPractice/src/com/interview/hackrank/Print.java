package com.interview.hackrank;

class Base {
	public void Print() {
		System.out.println("Base");
	}
}

class Drived extends Base {
	public void Print() {
		System.out.println("Drived");
	}
}

public class Print {

	public static void Doprint(Base o) {
		o.Print();
	}

	public static void main(String[] args) {

		Base x = new Base();
		Base y = new Drived();
		Drived z = new Drived();

		Doprint(x);
		Doprint(y);
		Doprint(z);

	}

}
