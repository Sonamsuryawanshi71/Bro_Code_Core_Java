//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle{
    //defining a method
    static void run(){System.out.println("Vehicle is running");}
}
//Creating a child class  
class Bike2 extends Vehicle{
    //defining the same method as in the parent class


    public static void main(String args[]){

        Bike2.run();//calling method
    }
}  