package com.hello_java.BasicPrograms;

public class method_overloading {

    static void foo(){
        System.out.println("Good morning ");
    }
    static void foo(String x){
        System.out.println("Good morning " + x);
    }

    static  void changeArray(int [] arr){
        arr[0] = 1;
    }
    static  void change(int x){
        x = 92;
    }
    static void tellJoke(){
        System.out.println("Sab bdhiya h");
    }

    public static void main(String[] args) {
        tellJoke();
        // Case1: Changing the integer --> need clarity
         int x = 25;
        change(x);
        System.out.println("The value of x after running change is:" + x);


        //* In case of arrays, the reference is passed. Same is the case for object passing to methods
        // Case2: Changing the array --> need clarity
        int [] marks = {25,12,2,3,1,5};
        changeArray(marks);
        System.out.println("The value of x after running changeArray is:" + marks[0]);

       /*Method Overloading:
        Two or more methods can have same name but different parameter. Such methods are called Overloaded methods
       */
        // MO overloading cannot be done by changing the return type of the method

        // Arguments are actual!
        foo();
        foo("Harsh");



    }






}
