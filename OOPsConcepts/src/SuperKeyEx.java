class Animal7
{
    Animal7(){System.out.println("animal7 is created");}
}
class Dog6 extends Animal7{
    Dog6()
    {
        super();
        System.out.println("dog6 is created");
    }
}
class TestSuper3{
    public static void main(String args[]){
        Dog6 d=new Dog6();
    }
}
