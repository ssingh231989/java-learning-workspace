package com.interview.hackrank.solution;

public class CardBoard {

	Short short1=5;
	
	 CardBoard go(CardBoard cb) {
		 cb=null;
		 return cb;
				 
	}

	public void finalize() throws Throwable {
	System.out.println("Object is garbased ");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ass";
		System.out.println(s);
		s="prr";
		System.out.println(s);


		CardBoard c1= new CardBoard();
		CardBoard c2= new CardBoard();
		
		CardBoard c3= c1.go(c2);
		
		c1=null;
		System.gc();
	}

}
