public class Overloaded {

    public static void main(String[] args) {

        // overloaded methods = methods that share the same name but have different parameters'
        //                      method name + parameters = method signature

//        int x = add ((int) 1, (int) 2, (int) 3, (int) 4);
        double x = add(1.0, 2.0 , 3.0, 4.0 );

        System.out.println(x);
    }

    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }

    static int add(double a, double b){
        System.out.println("This is overloaded method #4");
        return (int) (a + b);
    }
    static int add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return (int) (a + b + c);
    }
    static int add(double a, double b, double c, double d){
        System.out.println("This is overloaded method #6");
        return (int) (a + b + c + d);
    }

}
