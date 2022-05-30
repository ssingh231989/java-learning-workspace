package pkg;

import pkg.test.MyClass;

class Parent1
{ 
 public Parent1() {}
}

class Parent2
{ 
	public Parent2() {
		
	}
 public Parent2(int i) {}
}

class Child1 extends Parent1 {}

class Child2 extends Parent2 {}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyClass class1 = new MyClass();
	}

}
