package com.hello_java.BasicPrograms;
//Programs to print different types of patterns using different approaches
// Solve problem 2 and 4 using recusrion
/*Problem 2
*
**
***
****
*****
 */
/* Problem 4
*****
****
***
**
*
 */

public class pattern {

    static void p1(int n) {
        if (n > 0) {
            p1(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        p1(5);
    }

}
