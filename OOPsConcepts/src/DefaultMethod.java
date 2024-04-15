interface Drawable{
    void draw();
    default void msg(){System.out.println("default method");}
    default void msg1(){System.out.println("hello world");}
}

class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class TestInterfaceDefault{
    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        d.msg();
        d.msg1();
    }
}