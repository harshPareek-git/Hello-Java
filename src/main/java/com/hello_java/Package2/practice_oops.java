package com.hello_java.Package2;

class Employee_new{
    int Salary;
    String name;
   public int getSalary(){
        return Salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class Cellphone{
    public void ring(){
        System.out.println("Ringing ...");
    }
    public void vibrate(){
        System.out.println("Vibrating ...");
    }

    public void callFriend(){
        System.out.println("Calling friend ...");
    }
}

class Square{

    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

class TommyVercity{
    public void hit(){
        System.out.println("hitting the enemy");
    }

    public void run(){
        System.out.println("Run, enemies ahead");
    }

    public void fire(){
        System.out.println("Fire in the hole");
    }


}


public class practice_oops {
    public static void main(String[] args) {
//        Employee_new harsh = new Employee_new();
//
//        harsh.setName("Harsh Pareek");
//        harsh.Salary = 255;
//        System.out.println(harsh.getSalary());
//        System.out.println(harsh.getName());
//
//
//
//        Cellphone apple = new Cellphone();
//        apple.ring();
//        apple.vibrate();
//        apple.callFriend();

//        Square square = new Square();
//        square.side = 5;
//        System.out.println(square.area());
//        System.out.println(square.perimeter());


          TommyVercity tommy = new TommyVercity();
          tommy.fire();
          tommy.hit();
          tommy.run();
    }
}



