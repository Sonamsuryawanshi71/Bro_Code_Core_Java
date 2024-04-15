class Y{
    void msg(){System.out.println("Hello java");}
}

public class MethodOverrid extends Y{
    void msg(){System.out.println("Hello java");}//C.T.Error
    public static void main(String args[]){
        MethodOverrid obj=new MethodOverrid();
        obj.msg();
    }
}