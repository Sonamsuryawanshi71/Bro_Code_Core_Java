import java.util.Random;

public class Random1 {

    public static void main(String[] args){

        Random random = new Random();

        int x = random.nextInt(6)+1;
//        double y = random.nextdouble();
//        boolean z = random.nextBoolean();

        System.out.println(x);

    }



}
