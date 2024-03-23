package com.hello_java.Package2;
/*
this - a way for us to reference an object of the class which is being created/reference.
 */

//Referencing instance variables:
class MyClass {
    private int x;

    public void setX(int x) {
        this.x = x; // Refers to the instance variable x
    }
}

//Invoking another constructor in the same class (used for constructor chaining)
class MyClass1 {
    private int x;
    private int y;

    public MyClass1(int x) {
        this.x = x;
    }

    public MyClass1(int x, int y) {
        this(x); // Calls the constructor MyClass(int x)
        this.y = y;
    }
}

//Passing the current object as a parameter
class MyClass2 {
    private int x;

    public MyClass2() {
        anotherMethod(this);
    }

    public void anotherMethod(MyClass2 obj) {
        // Do something with obj
    }
}

//Returning the current object(to allow method chaining)
class MyClass3 {
    private int x;

    public MyClass3 setX(int x) {
        this.x = x;
        return this;
    }
}




public class this_keyword {
    public static void main(String[] args) {

    }
}
