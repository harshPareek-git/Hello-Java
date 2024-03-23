package com.hello_java.Package2;
/*
super - used to refer to the immediate parent class of a subclass.
      - a reference variable used to refer immediate parent class object.
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

/*
Accessing superclass members: You can use super to access methods or variables from the superclass within the subclass,
especially if the subclass overrides those members. For example:below
 */
class Superclass {
    void display() {
        System.out.println("This is superclass method");
    }
}

class Subclass extends Superclass {
    void display() {
        super.display(); // Calls superclass method
        System.out.println("This is subclass method");
    }
}

/*
Invoking superclass constructors: When you create an instance of a subclass, the superclass's constructor is automatically called.
If the superclass has a parameterized constructor, you can use super() to explicitly call it from the subclass constructor. For example:
 */
class Superclass1 {
    Superclass1(int x) {
        System.out.println("Superclass constructor with parameter: " + x);
    }
}

class Subclass1 extends Superclass1 {
    Subclass1() {
        super(10); // Calls superclass constructor with parameter
        System.out.println("Subclass constructor");
    }
}

/*
Accessing superclass constructor with no arguments: If the superclass constructor does not take any arguments,
you can use super() to call it implicitly. This call is added automatically by the compiler if it's not explicitly provided. For example:
 */
class Superclass2 {
    Superclass2() {
        System.out.println("Superclass constructor");
    }
}

class Subclass2 extends Superclass2 {
    Subclass2() {
        super(); // Calls superclass constructor implicitly
        System.out.println("Subclass constructor");
    }
}
