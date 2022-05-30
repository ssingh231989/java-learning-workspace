package com.interview.hackrank.solution.p2;

import com.interview.hackrank.solution.p1.ParentUtil;

public class ChildUtil extends ParentUtil {

	public static void main(String[] args) {

		new ChildUtil().dosf();
		
	}
	void calS() {
		System.out.println("Thid "+this.dosf());
		ParentUtil p = new ParentUtil();
		//System.out.println("P "+p.);
	}

}
