package com.interview.hackrank.solution;

class Exc0 extends Exception {
}

class Exc1 extends Exc0 {
}

/**
 * O/p Ex0 caught
 */
public class ExceptionTest2 extends Exc0 {
    public static void main(String args[]) {
        try {
            throw new Exc1();
        } catch (Exc0 e) {
            System.out.println("Ex0 caught");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
