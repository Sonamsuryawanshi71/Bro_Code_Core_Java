interface Printable1{
    void print();
}
interface Showable1{
    void show();
}
class P7 implements Printable1,Showable1{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        P7 obj = new P7();
        obj.print();
        obj.show();
    }
}  