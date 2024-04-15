import javax.swing.*;

public class GUI {
//    GUI(Graphical User Interface)

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showInputDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showInputDialog(null, "You are "+age+" year old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showInputDialog(null, "You are "+height+" cm tall");

    }
}
