//Connected class Animal / Dog / MethodOverriding

public class MethodOverriding {

    public static void main(String[] args){

//  Method Overriding  = Declaring a method in subclass, which is already present in parent class
//                       done so that a child class can give its own implementation.

        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
        animal.speak();

    }
}
