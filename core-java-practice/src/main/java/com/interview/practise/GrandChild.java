package com.interview.practise;

class parent {

    void method1() {
        System.out.println("parent-1");
    }
}

class child extends parent {

    void method1() {
        System.out.println("child-1");
    }

    void method2() {
        System.out.println("child-2");
    }
}

class GrantChild extends child {

    void method2() {
        System.out.println("grantchild-2");
    }

}

/*class child2 extends GrantChild,child{

}**/

class driver {


}

public class GrandChild {
    public static void main(String ar[]) {
        parent p = new GrantChild(); // compile

        p.method1(); // child-1
        p.method1(); // grantchild-2

    }
}
