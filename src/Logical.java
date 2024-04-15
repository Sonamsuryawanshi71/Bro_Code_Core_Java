import java.util.Scanner;

public class Logical {
    public static void main(String[] args){

//          logical operators = used to connect two or more expressions
//                && = (AND) both condition must be true
//                || = (OR) either condition must be true
//                ! = (NOT) reverses boolean value of a condition

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        int temp = 15;
        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew* ");
        } else if (temp>=20 && temp<=30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }
    }

}

