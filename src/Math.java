import java.util.Scanner;

public class Math {

    public static void main(String[] args){

//        double x = 3.14;
//        double y = -10;
//        double z = Math.max(x,y);
//        double z = Math.min(x,y);
//        double z = Math.abs(y);
//        double z = Math.square(y);
//        double z = Math.round(x);
//        double z = Math.ceil(x);
//        double z = Math.floor(x);
//        System.out.println(z);

        //(New Program)
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : "+z);

        scanner.close();



    }

    private static double sqrt(double v) {
        return v;
    }


}
