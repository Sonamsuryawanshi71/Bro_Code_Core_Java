 abstract class Bike4{
    Bike4(){System.out.println("bike running");}
     void run(){};
     abstract void run1 ();
}
class Honda4 extends Bike4{
    void run(){System.out.println("running safely");}
    void run1(){};
    public static void main(String args[]){
        Bike4 obj = new Bike4() {
            @Override
            void run1() {

            }
        };
        obj.run();
    }
} 