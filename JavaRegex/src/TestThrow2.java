import java.io.*;

public class TestThrow2 {

    //function to check if person is eligible to vote or not   
    public static void method() throws FileNotFoundException {

        FileReader file = new FileReader("C:\\Users\\sonam\\Documents\\Text.txt");
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println("File Input"+ fileInput.toString());

        throw new FileNotFoundException();

    }
    //main method  
    public static void main(String args[]){
        try
        {
            method();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("rest of the code...");
    }
}    