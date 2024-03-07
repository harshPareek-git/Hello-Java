package com.hello_java.Package2;

//public class test1 {
//    public static void main(String[] args) {
//        System.out.println("Test code here, will rename package name and file name as per upcoming development");
//    }
//}


public class test1 {
    public static void main(String[] args) {
        test1 obj = new test1();
        System.out.println(obj.hello(3,5));
        System.out.println(obj.hello(12,6));
    }

    String hello(int x, int y) {
        String z;
        if (x < y) {
            z = "Hello";
        } else {
            z = "Bye bye";
        }
        return z;
    }
}
