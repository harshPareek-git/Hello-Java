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
        //base condition
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

    static int fib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
        if(n == 1 || n == 2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }

    }

    public static void main(String[] args) {
        int x = 5;
//        System.out.println("Factorial of 5 is " + factorial(x));
//        System.out.println("Factorial of 5 is " + factorial_iterative(x));
        int result = fib(5);
        System.out.println(result);


    }
}
//**Problem 1: Print fibonacci series using recursion
//**Problem 1: Print the nth term of fibonacci series using recursion

