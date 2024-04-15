class H{
    H(){}//private constructor
    void msg(){System.out.println("Hello java");}
}
public class PrivateEx2{
    public static void main(String args[]){
        H obj=new H();//Compile Time Error
    }
}
