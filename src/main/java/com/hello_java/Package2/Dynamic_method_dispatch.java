package com.hello_java.Package2;

class Phone{
    public void on(){
        System.out.println("Turning on Phone...");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}
class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
    public void music(){
        System.out.println("Music playing...");
    }
}


public class Dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj1 = new Phone();               //Allowed
//        SmartPhone obj2 = new SmartPhone();    //Allowed

        Phone obj3 = new SmartPhone();           //Allowed --> Runtime polymorphism
//        SmartPhone obj4 = new Phone();         //Not Allowed
        obj3.on();
        /*
        So, Phone obj3 = new Smartphone(); creates a new instance of the Smartphone class
        (Smartphone is a subclass of Phone), and assigns a reference to this newly created
        object to the variable "obj3", which is declared to be of type Phone. This means that although
        the object is of type Smartphone, it can be treated as a Phone, allowing for polymorphic
        behavior where methods and properties defined in the Phone class can be accessed through the
        obj3 variable. This provides flexibility and allows for code reuse and abstraction.
         */

//        obj3.music();  //Not Allowed
    }

}
