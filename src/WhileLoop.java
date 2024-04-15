import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){

//        While loop = executes a block of code as long as a it's condition remains true
//        do while / while loop

        Scanner scanner = new Scanner(System.in);
        String name ="";

         do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isBlank());

        while(name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+name);

    }


}
