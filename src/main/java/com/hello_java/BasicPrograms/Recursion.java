package com.hello_java.BasicPrograms;
// A function in java can call itself. Such calling of a function by itself is called recursion
// factorial(n) =  n * factorial(n-1) where n>=1
public class Recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for(int i = 1; i <= n;i++){
            product *= i;
        }
            return product;
     }
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Factorial of 5 is " + factorial(x));
        System.out.println("Factorial of 5 is " + factorial_iterative(x));

    }
}
//Problem 1: Print fibonacci series using recursion