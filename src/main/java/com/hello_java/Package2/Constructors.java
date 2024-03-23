package com.hello_java.Package2;
/*
Constructors - A member function used to initialize an object while creating it.
Constructor name is same as class name and has no return value(including void).
A constructor is a special type of method that is automatically invoked when an object of a class is created.
The purpose of a constructor is to initialize the newly created object.
The default constructor provided by the compiler initializes the object, ensuring that all instance variables are properly
initialized to their default values (e.g., null for reference types, 0 for numeric types, false for boolean types).
 */
class MyNewEmployee{
    //Constructor(auto invoke)
    public MyNewEmployee(){
    id = 45;
    name = "your-name-here";
    }

    //Constructor overloading
    public MyNewEmployee(int myId){
        id = myId;
    }

    public MyNewEmployee(String myName){
        name = myName;
    }

    public MyNewEmployee(int myId,String myName){
        id = myId;
        name = myName;
    }

    //instance variable
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}


public class Constructors {
    public static void main(String[] args) {
    MyNewEmployee harsh = new MyNewEmployee(46,"harshPareek-git");
        System.out.println(harsh.getId());
        System.out.println(harsh.getName());
    }
}


