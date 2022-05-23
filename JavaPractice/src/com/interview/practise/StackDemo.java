package com.interview.practise;

import java.util.Stack;

public class StackDemo {

    public StackDemo(){
        super();
    }
    public static void main(String ar[]){

        Stack<String> s = new Stack<>();

        s.push("a");
        s.push("b");
        s.push("c");

        System.out.println(s.pop());

        String expr = "([{)}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
    static boolean areBracketsBalanced(String expr){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<expr.length();i++){
            char ch=expr.charAt(i);
            if (ch == '(' || ch == '{' || ch =='[') {
                s.push(ch);
                continue;
            }

            if(s.isEmpty()){
                return false;
            }
            char chk;
            switch (ch){
                case ')':
                        chk= s.pop();
                        break;
                case '}':
                    chk=s.pop();
                    break;
                case ']':
                    chk=s.pop();
                    break;
            }
        }

        if(s.isEmpty()){
            return true;
        }
        return false;
    }

}
