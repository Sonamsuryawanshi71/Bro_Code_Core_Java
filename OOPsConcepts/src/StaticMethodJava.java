interface Drawables{
    void draw();
    //int cube(int x){return x*x*x;}
    int cube(int x);
}
class Rectangles implements Drawables{
    public void draw(){System.out.println("drawing rectangle");}
    public int cube(int x){return x*x*x;}
}

class TestInterfaceStatic{
    public static void main(String args[]){
        Drawables d=new Rectangles();
        d.draw();
        System.out.println(d.cube(3));
    }
}
