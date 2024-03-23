package com.hello_java.Package2;
/*
super - a reference variable used to refer immediate parent class object.
      - can be used to refer immediate parent class instance variable.
      - can be used to invoke parent class methods.
      - can be used to invoke parent class constructors.
 */
class A{
    A(){
        System.out.println("Class A constructor");
    }
    A(int a) {
        System.out.println("Class A constructor with a:" + a);
    }
}

class B extends A{
    B(){
        System.out.println("Class B constructor");
    }
    B(int a,int b){
        super(a);
        System.out.println("Class B constructor with b:" + b);
    }
}

public class super_keyword {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(1,2);
    }
}
