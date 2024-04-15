class Dog7{
     final void eat() {
        System.out.println("dog is eating...");
    }
    }
class Dog9 extends Dog7{

    public static void main(String args[]){
        Dog7 d1=new Dog7();
        Dog9 d2=null;

        d1.eat();
        System.out.println(d1 instanceof Dog9);


    }
}
