package pkg.test;

public class ExceptionDemo {
	public static void main(String args[]) {

		ExceptionDemo demo = new ExceptionDemo();
		System.out.print(demo.absorbeTheValue());
	}
	
	int absorbeTheValue() {
	    try {
	        int a = 10/0;
	        if (a > 0) return 4;
	    } catch(Exception e) {
	        return 45;
	    } finally {
	        return 34;
	    }
	}
}

  
