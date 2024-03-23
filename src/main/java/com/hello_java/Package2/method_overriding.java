package com.hello_java.Package2;
/*
Method Overriding - When child class implements the same method present in parent class again, it's called method overriding.
                  - Redefining method of superclass with same argument list in subclass.
                  - same return type and should be accessible.
 */
class one{
    public int a;
    public int method1(){
        return 1;
    }
    public void method2(){
        System.out.println("I am method 2 of class one");
    }
}
class two extends one{
    @Override
    public void method2(){
        System.out.println("I am method 2 of class two");
    }
    public void method3(){
        System.out.println("I am method 3 of class two");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        one obj = new one();
        two obj1 = new two();
        obj.method2();
        obj1.method2();
    }
}
