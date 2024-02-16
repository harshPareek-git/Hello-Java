package com.hello_java.BasicPrograms;


public class MultidimensionalArray {
    public static void main(String[] args) {
        //Multidimensional Arrays

        // int [] marks // A 1-D Array
        // int [][] flats; // A 2-D Array
        // String [][][] arr = new String [1][2][3] // A 3-D Array

        int[][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[0][2] = 103;
        flats[1][2] = 203;

        System.out.println("Printing a 2-D Array");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {

                System.out.print("Index" + "[" +i + "]" + "[" + j + "]"  + " " + flats[i][j] + "," + " ");
            }
                System.out.println(" ");
        }

        /* Add problems for 2D Array */


    }
}
