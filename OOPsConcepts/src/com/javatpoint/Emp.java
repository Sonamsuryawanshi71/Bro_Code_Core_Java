//A Java class which is a fully encapsulated class.
//It has a private data member and getter and setter methods.
package com.javatpoint;
public class Emp{
    //private data member
    private String name;
    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name=name;
    }
}

class Test{
    public static void main(String[] args){
//creating instance of the encapsulated class
        Emp s=new Emp();
//setting value in the name member
        s.setName("vijay");
//getting value of the name member
        System.out.println(s.getName());
    }
}