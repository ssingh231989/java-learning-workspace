package com.interview.hackrank.solution;

public abstract class AbstractTest {
    public int getNum(){
        return  45;
    }
    public abstract class Bar{
        public int getNum(){
            return  38;
        }
    }

    public static void main(String args[]) {

        AbstractTest t = new AbstractTest() {
            @Override
            public int getNum() {
                return 22;
            }
        };
        AbstractTest f = new AbstractTest() {
            @Override
            public int getNum() {
                return 57;
            }
        };

        System.out.println(f.getNum()+""+t.getNum());
    }

}
