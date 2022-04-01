package com.interview.hackrank;

class Super {
    String s;
 
	/*
	 * public Super(){ System.out.println("Super"); }
	 */
}
 
public class Sub extends Super {
 
    public Sub(){
    	System.out.println("Sub");
    }
 
    public static void main(String[] args){
    	Sub s = new Sub();
    }
}
