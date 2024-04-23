package Polymorphism;

public class Main {

    public static void main(String[] args){

//        Polymorphism = Greek word for poly - "many" , morph - "form"
//                       The ability of an object to identify more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers ={car,bicycle,boat};

        for(Vehicle X : racers){
//            x.go();
            car.go();
            bicycle.go();
            boat.go();
        }
    }
}
