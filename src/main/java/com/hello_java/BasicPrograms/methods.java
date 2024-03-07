package com.hello_java.BasicPrograms;

// A method is  a function written inside a class
// Static method can only be called in same class
// By creating object of the class we can access methods of that class within the same class as well as
// in other classes also
// When written nothing in (int logic method) --> access modifier is default

public class methods {

    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    static void pattern1(int n){
        for (int i = 0;i<n;i++){
            for(int j = 0;j<i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 0;i<n;i++){
            for(int j = i;j < n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print a table
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d \n" ,n,i,n*i);
        }
    }

    static int logic(int x,int y){
        int z;
        if (x < y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    String hello(int x, int y){
        String z;
        if (x<y){
         z =  "Hello";
        }else{
            z ="Bye bye";
        }
        return z;
    }

    public static void main(String[] args) {

    int a = 5;
    int b = 2;
    int c ;
//    c = logic(a,b);
//    System.out.println(c);
//
//    methods obj = new methods();
//   System.out.println(obj.hello(2,4));
//   System.out.println(obj.hello(12,5));
//   table(17);
//   pattern1(8);
//      int d =  sumRec(4);
//        System.out.println(d);
        pattern2(5);


}
}


