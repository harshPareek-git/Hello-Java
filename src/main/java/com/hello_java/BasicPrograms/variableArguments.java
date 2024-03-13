package com.hello_java.BasicPrograms;
//Varargs only used for array
public class variableArguments {

    static int sum(int ...arr){
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return  result;
    }
    static int sum1(int x,int ...arr){
        int result = x;
        for (int a:arr){
            result += a;
        }
        return  result;

    }

    public static void main(String[] args) {
        //Varargs can take any number of input as an array

        System.out.println("sum of 2,5,1,5 is " + sum(2,5,1,5));
        System.out.println("sum of 1,5 is " + sum(1,5));
        System.out.println("sum of 1,5,1 is " + sum(1,5,1));
        System.out.println("sum of 2,5,1,5,12 " + sum(2,5,1,5,12));
        System.out.println("sum of nothing is " + sum());
        System.out.println();
        System.out.println("sum of 2,5,1,5 is " + sum1(2,5,1,5));
        System.out.println("sum of 1,5 is " + sum1(1,5));
        System.out.println("sum of 1,5,1 is " + sum1(1,5,1));
        System.out.println("sum of nothing is " + sum1(1));

       // Cannot be declared System.out.println("sum of nothing is " + sum1());


    }

}
