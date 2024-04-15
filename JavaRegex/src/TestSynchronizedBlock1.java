class Table5
{
    void printTable(int n){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }//end of the method
}

class MyThread3 extends Thread{
    Table5 t;
    {
        System.out.println("hello");
    }
    MyThread3(Table5 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread4 extends Thread{
    Table5 t;
    MyThread4(Table5 t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class TestSynchronizedBlock1{
    public static void main(String args[]){
        Table5 obj = new Table5();//only one object
        MyThread3 t1=new MyThread3(obj);
        MyThread4 t2=new MyThread4(obj);
        t1.start();
        t2.start();
    }
}    