import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Audio {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);
        
        File file = new File("perfect-beauty-191271.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();

        String response = "";

        while(!response.equals("Q")){
            System.out.println("P = play , S = Stop,  R = Reset, Q = Quit");
            System.out.println("Enter your choice");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response){
                case ("P"): clip.start();;
                    break;
                case ("S"): clip.stop();;
                    break;
                case ("R"): clip.setMicrosecondPosition(0);
                    break;
                case ("Q"): clip.close();
                    break;
                default: System.out.println("Not a valid response");
            }
        }
        System.out.println("Byeeeee! ");
    }
}
