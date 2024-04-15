//Connect class Garage
//Connect class Bike

public class ObjectPassing {

    public static void main(String[] args){

        Garage garage = new Garage("BMW");

        Bike bike1 = new Bike("Apache");
        Bike bike2 = new Bike("Tvs");

        garage.park(bike1);
        garage.park(bike2);
    }
}
