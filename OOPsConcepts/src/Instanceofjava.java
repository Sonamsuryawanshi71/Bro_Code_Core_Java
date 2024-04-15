interface Printable{}
class AAA implements Printable{
    public void a(){System.out.println("a method");}
}
class BBB implements Printable{
    public void b(){System.out.println("b method");}
}

class Call{
    void invoke(Printable p){//upcasting
        if(p instanceof AAA){
            AAA a=(AAA)p;//Downcasting
            a.a();
        }
        if(p instanceof BBB){
            BBB b=(BBB)p;//Downcasting
            b.b();
        }

    }
}//end of Call class

class Test4{
    public static void main(String args[]){
        Printable p=new BBB();
        Printable p1=new AAA();
        Call c=new Call();
        c.invoke(p);
        c.invoke(p1);
    }
}
