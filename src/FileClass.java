import java.io.File;

public class FileClass {

    public static void main(String[] args) {

//        File class = An abstract representation of file and directory pathname

        File file = new File("secrey_message.txt");

        if (file.exists()){
            System.out.println("That file exists! :o!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else {
            System.out.println("That file doesn't exist :(");
        }
    }
}
