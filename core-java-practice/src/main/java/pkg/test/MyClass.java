package pkg.test;

import java.util.HashMap;

class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public int hardCode() {
		return 420;
	}
}
public class MyClass {
	public static void main(String args[]) {
		HashMap<Person, String> mp = new HashMap<Person, String>();
		
		mp.put(new Person("a"), "AA");
		mp.put(new Person("b"), "BB");
		mp.put(new Person("c"), "CC");
		
		mp.remove(new Person("a"));
		
		System.out.println(mp.toString());
		
	}
}
