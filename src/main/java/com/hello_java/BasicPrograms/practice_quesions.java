package com.hello_java.BasicPrograms;

//Problem 1: Print the nth term of fibonacci series using recursion - done
//Problem 2: Print fibonacci series using recursion -- pending
//Problem 3: A function to find average of a set of numbers passed as arguments 
//Problem 4: A function to convert Celsius temperature into Fahrenheit
public class practice_quesions {

    static float temperature(float tc){
        float tf = (tc * 9/5) + 32;
        return tf;
    }

    static float patternRec(int ...arr){
        float sum = 0;
        for(int a:arr){
            sum += a;
        }
        float result = sum/arr.length;
        return result;
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
        else {
            return fib(n - 1) + fib(n - 2);
        }
}

    public static void main(String[] args) {
//        int result = fib(5);
//        System.out.println(result);
//        float result = patternRec(2,2,4,5,2,1,1);
//        System.out.println(result);
          float temp = temperature(2);
        System.out.println(temp);
    }

}
