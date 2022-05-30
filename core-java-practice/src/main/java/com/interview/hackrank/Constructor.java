package com.interview.hackrank;

public class Constructor {

    static String str;

    public void   Constructor(){
        System.out.println("In con");
        str="sss";
    }

    public  static  void main(String ar[]){
        Constructor c = new Constructor();
        System.out.println(str);
    }
}
