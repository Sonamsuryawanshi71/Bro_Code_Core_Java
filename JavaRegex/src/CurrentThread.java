class TestMultiNaming2 extends Thread{
    public TestMultiNaming2(String first_) {
        super(first_);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        TestMultiNaming2 t1=new TestMultiNaming2("first ");
        TestMultiNaming2 t2=new TestMultiNaming2("first 1 ");

        t1.start();
        t2.start();
    }
}  