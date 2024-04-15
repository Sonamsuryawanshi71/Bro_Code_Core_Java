class Animal6 { }

class Dogs extends Animal6 {
    static void method(Animal6 a) {
        if(a instanceof Dogs){
            Dogs d=(Dogs)a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }

    public static void main (String [] args) {
        Animal6 a=new Animal6();
        Dogs.method(a);
    }

}