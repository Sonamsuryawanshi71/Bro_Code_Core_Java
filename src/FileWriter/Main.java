package FileWriter;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \n Violets aer blue \n Booty booty booty \n Rockin everywhere");
            writer.append("\n (A poem by bro)");
            writer.close();
        }

        catch (IIOException e){
            e.printStackTrace();
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
