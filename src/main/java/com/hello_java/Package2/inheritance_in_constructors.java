package com.hello_java.Package2;

class base{
    base(){
        System.out.println("I am a base class constructor");
    }
    base(int x){
        System.out.println("I am an overloaded base class constructor with value of x:" + x);
    }

}

class derived extends base{
    derived(){
//        super(0);
        System.out.println("I am a derived class constructor");
    }

    derived(int x,int y){
        super(x);
        System.out.println("I am an overloaded derived class constructor with value of y:" + y);
    }
}
class childOfDerived extends derived{
    childOfDerived(){
        System.out.println("I am a constructor of child of Derived class ");
    }
    childOfDerived(int x,int y,int z){
//        super(x,y);
        System.out.println("I am an overloaded constructor of child of derived class constructor with value of z:" + z);
    }
}


public class inheritance_in_constructors {
    public static void main(String[] args) {
//        base b = new base();
//        derived d = new derived(10,11);
          childOfDerived cd = new childOfDerived(1,2,3);
    }

}
