class G{
    private int data=40;
    private void msg(){System.out.println("Hello java");}

public static void main(String args[]){
        G obj=new G();
        System.out.println(obj.data);//Compile Time Error
        obj.msg();//Compile Time Error
    }
}  