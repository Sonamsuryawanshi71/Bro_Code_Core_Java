interface Interfaceclass{
    void print();
}
class A6 implements Interfaceclass{
    public void print(){System.out.println("Hello");}

    public static void main(String args[]){
        Interfaceclass obj = new Interfaceclass() {
            @Override
            public void print() {

            }
        };
        obj.print();
    }
} 