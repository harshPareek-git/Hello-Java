package com.hello_java.Package2;
// This class is all about object-oriented programming
/*
Modeling a problem in OOPS
Noun --> Class --> Employee
Adjective --> Attributes --> Name,Age,Salary
Verb --> Methods --> getSalary(),increment()
 */

//1. Abstraction - Hiding internal details.
//2. Encapsulation - The act of putting various components together(in a capsule)
//3. Inheritance - The act of deriving new things from existing things
//4. Polymorphism - One entity many forms

//Any real world oject = Properties + Behavior
//Object in oops = Attributes + Methods
public class oops {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harsh = new Employee(); //Instantiating a new employee object
        Employee henry = new Employee();
        //Setting attributes for harsh
        harsh.id = 22;
        harsh.name = "Harsh";
        harsh.salary = 60;
        //Setting attributes for henry
        henry.id = 11;
        henry.name = "Henry";
//        System.out.println(harsh.id);
//        System.out.println(harsh.name);
        harsh.printDetails();
        henry.printDetails();
        int salary = harsh.getSalary();
        System.out.println("Harsh's salary is: "+salary);
    }
}

class Employee {
    //Attributes
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My id is:"+id);
        System.out.println("My name is:"+name);
    }

    public int getSalary(){
        return salary;
    }


}