package com.interview.hackrank.solution;

/**
 * O/P= 1
 * By the time line 8 has run, the only object without a reference is the one generated as a result of line 6.
 * Remember that "Java is pass by value," so the reference variable x is not affected by the m1() method.
 */
public class X {
    public static void main(String args[]) {

        X x = new X();
        X x2 = m1(x);
        X x4= new X();
        x2=x4;

    }

    static X m1(X mx) {
        mx = new X();
        return mx;
    }
}
