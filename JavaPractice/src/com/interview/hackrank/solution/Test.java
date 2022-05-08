package com.interview.hackrank.solution;

import com.interview.hackrank.solution.p2.ChildUtil;

/**
 * o/p 6 3
 */
public class Test {

	public static void main(String[] args) {
		ChildUtil childUtil;
		// TODO Auto-generated method stub
			int x=0;
			int y=0;
			for ( int z=0;z<5;z++) {
				if((++x>2) && (++y>2)){
					x++;
				}
				
			}
			System.out.println(x+" "+y);
	}

}
