package com.hello_java.Package3;

import java.util.List;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of array are");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(" " + arr[i]);
        }




      //  System.out.println("Will update code and package name later" );
    }
}
