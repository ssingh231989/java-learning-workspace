package pkg.test;

import java.util.HashMap;
import java.util.HashSet;

public class WapStrig {

	private String s;
	
	public WapStrig(String s) {
		this.s=s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Object> hashSet = new HashSet<Object>();
		WapStrig strig = new WapStrig("aa");
		WapStrig strig2 = new WapStrig("aa");
		String s1=new String("aa");
		String s2=new String("aa");
				
		hashSet.add(strig2);
		hashSet.add(s2);
		hashSet.add(s1);
		hashSet.add(strig);
		
		System.out.println(hashSet.size());
				
	}

}
