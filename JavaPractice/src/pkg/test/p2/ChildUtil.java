package pkg.test.p2;

import pkg.test.p1.ParentUtil;

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
