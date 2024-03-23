package com.hello_java.Package2;
/*
Problem1: Create a class Cylinder and use getters and setters to set its radius and height.
Problem2: Use 1 to calculate surface area and volume of cylinder.
Problem3: Use a constructor and repeat 1.
Problem4: Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.
Problem5: Repeat 1 for sphere.
 */

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return  (2*3.142 *radius * height) + 2 * 3.142 * (radius *radius);
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    };

}

class Rectangle{
    private final int length;
    private final int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class practice_set {

    public static void main(String[] args) {
//        Cylinder myCylinder = new Cylinder();
//        Cylinder myCylinder = new Cylinder(9,12);
//
//        myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
//
//        myCylinder.setRadius(9);
//        System.out.println(myCylinder.getRadius());
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println((myCylinder.volume()));

            Rectangle rectangle = new Rectangle();
            System.out.println(rectangle.getLength());
            System.out.println(rectangle.getBreadth());




    }


}
