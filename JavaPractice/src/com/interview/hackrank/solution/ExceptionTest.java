package com.interview.hackrank.solution;

public class ExceptionTest {

    public static void main(String args[]){
        ExceptionTest exceptionTest = new ExceptionTest();

        System.out.println(exceptionTest.returnFromFinally());
    }

    /**
     *  o/p - Finally
     *
     * @return
     */
    public String returnFromFinally(){

        try{
            return "try";
        }catch (Exception e){
            return "Catch";
        }
        finally {
            return "Fiinally";
        }
    }

}
