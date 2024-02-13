package com.hello_java.BasicPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    This class has all the information about Arrays from Beginner to Advance
 */
public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        Beginner
         */

        /*
        Ways to create Arrays in Java
         */

        // Array Declaration
        int [] marks;

        // Memory allocation
        marks = new int[5];

        /*
         Declaration and Memory Allocation
         int [] marks = new int [5]
        */

        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        marks[3] = 54;
        marks[4] = 42;
//        System.out.println(marks[3]);

        //Declaration and Initialization
        int [] grade = {1,2,3,4,5};


        /* Problem 1. Sum of elements of an array which are in decimal/float */
//        float[] arr = {23.44f, 78.23f, 78.84f, 16.04f};
//        float sum = 0;
//        for (float elements : arr) {
//            sum = sum + elements;
//        }
//        System.out.println(sum);

        /* Problem 2. Finding whether a given number is present in an array or not*/

//        int [] arr = {1,2,4,4,5,3,5,6,7,8,832,32,23,5,5};
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        boolean flag = false;
//        int index = 0;
//        for (int i = 0 ; i<arr.length; i++){
//
//            if (arr[i] == number){
//                flag = true;
//                index = i;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println("Number is present in array at index " +  index);
//        }else {
//            System.out.println("The value is not present in array");
//        }

        /* Problem 3: Calculate the average marks from an array containing marks of all students in Physics using for Loop */

        float [] physicsMarks ;
        float totalMarks = 0;
        physicsMarks = new float[]{9,5.5f,8.2f,5.2f,4,9,9.9f};
        for(float i = 0; i < physicsMarks.length; i++){
            totalMarks = totalMarks + i;
        }
        System.out.println("Average marks in physics subject is: " + totalMarks/physicsMarks.length);





        /*
            Intermediate
         */














          /*
            Advance
         */

    }

}
