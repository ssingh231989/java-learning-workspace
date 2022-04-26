package pkg.test;

public class HappYGarbase {

	public static void main(String[] args) {
		HappYGarbase garbase = new HappYGarbase();
		garbase.meth();
		
		Runtime.getRuntime().freeMemory();
		System.gc();
	}
	
	Object meth() {
		System.out.println("c1");
		Object obj1 = new Object();
		Object[] obj2=new Object[1];
		obj2[0] = obj1;
		obj1=null;
		return obj2[0];
				
	}
}
