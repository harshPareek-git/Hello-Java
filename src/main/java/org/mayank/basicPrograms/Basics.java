package org.mayank.basicPrograms;

import java.util.Scanner;

/**
 * @author Mayank Jain
 * Hello everyone this class is used for basic programs of java for practice.
 */
public class Basics {
    /**
     * Program No. 1
     * Java Program to Find the Perimeter of a Rectangle!
     * Explanation:
     * Perimeter of rectangle ABCD = 2A + 2B = 2(A+B)
     * The perimeter of a rectangle is the total length of all its four sides.
     * It can be simply calculated by all its four sides.
     */

    static void perimeter(int length, int breadth) {
        // calculate the perimeter using formula
         int perimeter = 2 * (length + breadth);

        System.out.println("The perimeter of the given rectangle of length" + length +
        "and breadth" + breadth + " = " + perimeter);
    }

    // Main method
    public static void main(String[] args) {

        // Take the length and breadth of the rectangle from the user.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the triangle: ");
        int length = scan.nextInt();

        System.out.println("Enter the breadth of the triangle: ");
        int breadth = scan.nextInt();

        perimeter(length, breadth);
    }



}
