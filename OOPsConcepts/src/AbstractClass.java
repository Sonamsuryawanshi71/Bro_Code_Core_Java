interface E{
    void f();
    void e();
    void c();
    void d();
}

abstract class F implements E{
    public void c(){System.out.println("I am c");}
}

class M extends F{
    public void e(){System.out.println("I am a");}
    public void f(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}

class Test5{
    public static void main(String args[]){
        E a=new M();
        a.e();
        a.f();
        a.c();
        a.d();
    }}