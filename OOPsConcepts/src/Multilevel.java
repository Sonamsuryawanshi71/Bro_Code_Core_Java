class Animal9{
    void eat(){System.out.println("eating");}
}
class Dog8 extends Animal9{
    void eat(){System.out.println("eating fruits");}
}
class BabyDog5 extends Dog8{
    void eat(){System.out.println("drinking milk");}
    public static void main(String args[]){
        Animal9 a;
        a=new Animal9();
        a.eat();
        a=new Dog8();
        a.eat();
        a=new BabyDog5();
        a.eat();

    }
}
