package com.interview.hackrank.solution;

interface  Tower{
    boolean isTooHig(int h,int l);
}
public class Records {
    public static void main(String[] args) {
        //check((h,l)->h.append(l),);
    }

    private static void check(Tower t,int h){
        if(t.isTooHig(h,100)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
