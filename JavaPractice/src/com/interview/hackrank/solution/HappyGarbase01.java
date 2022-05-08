package com.interview.hackrank.solution;

/**
 *
 */
public class HappyGarbase01 {

	public void finalize(){System.out.println("object is garbage collected");}

	public static void main(String[] args) {
		HappyGarbase01 garbase = new HappyGarbase01();
		garbase.methodA();
		
		//Runtime.getRuntime().freeMemory();
		System.gc();
	}
	
	Object methodA() {
		System.out.println("c1");
		Object obj1 = new Object();
		Object[] obj2=new Object[1];
		obj2[0] = obj1;
		obj1=null;
		return obj2[0];
				
	}
}
