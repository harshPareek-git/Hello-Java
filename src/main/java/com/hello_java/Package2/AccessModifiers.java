package com.hello_java.Package2;
/*
AM - specifies where a property/method is accessible.
Four Types of AM
1.Private - Can be accessed by using methods(getter/setter)
2.Default
3.Protected
4.Public
 */

class MyEmployee{
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}

public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee harsh = new MyEmployee();
        harsh.setName("harsh");
        System.out.println(harsh.getName());
        harsh.setId(46);
        System.out.println(harsh.getId());
    }

}
