//Connect class object
// connected class Abstraction / Vehicle / Car

public class Car {

//     Encapsulation Start code

    private String make;
    private String model;
    private int year;

    Car(String make, String model , int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car x){
        this.copy(x);
    }



    public String getMake(){
        return make;
    }

    public String getModel(){
        return make;
    }

    public String getYear(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());

    }




    //     Encapsulation End code

//    public class Car extends Vehicle{

//    @Override
//    void go() {
//        System.out.println("The driver is driving the car");
//    }
//    {
//    }



//    String make ="Chevrolet;" ;
//    String model = "Corvette";
//    int year = 2020;
//    String color = "blue";
//    double price = 50000.00;
//
//    void drive(){
//        System.out.println("You drive the car");
//    }
//    void brake(){
//        System.out.println("You step on the brakes");
//    }



//   connect toString method
//    String make = "Ford";
//    String model = "mustang";
//    String color = "red";
//    int year = 2021;

//    public Car() {
//    }

//    public String toString(){
//
//        return make +"\n" +"\n" +model+"\n"+color+"\n"+year;

//        String myString = make +"\n" +"\n" +model+"\n"+color+"\n"+year;
//        return myString;
    }



