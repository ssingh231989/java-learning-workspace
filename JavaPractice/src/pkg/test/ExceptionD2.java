package pkg.test;

import java.util.List;

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
	
	 public static int maxMin(List<Integer> arrl, int k) {
		    // Write your code here
		        String[] arr = new String[arrl.size()];
		        
	 }

}
