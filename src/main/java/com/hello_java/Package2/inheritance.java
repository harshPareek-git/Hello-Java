package com.hello_java.Package2;
/*
Inheritance - Used to borrow properties and methods from an existing class using 'extends' keyword.
superClass
    |
    |
subClass
--> subClass extends superClass
Note - Constructors of superClass will be called first(if present) in subClass(even if a subClass has its own constructors).
 */

class animal{
     animal() {
         System.out.println("I am a base class constructor");
    }

    animal(int a) {
        System.out.println("I am an overloaded base class constructor with value of a:" + a);
    }

    int noOfLegs;

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}

class dog extends animal{

    public dog() {
        System.out.println("I am a derived class constructor");
    }

    public void sound(){
        System.out.println("Bow Bow ...");
    }
}

public class inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.setNoOfLegs(4);
        System.out.println(d.getNoOfLegs());
        d.sound();


    }




}
