package Label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

//        JLabel =  aGUI display area for a string of text , an image, or both

        ImageIcon image = new ImageIcon("tropical-flower.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); //Create a label
        label.setText("Bro,do you even code?"); // set txt of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT.CENTER,RIGHT of image-icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER,BOTTOM of image-icon
        label.setForeground(new Color(0x00FF00)); // set front color of text
        label.setFont(new Font("MV Boli" , Font.PLAIN,50)); // set font of text
        label.setIconTextGap(-25); // set gap of text to image
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set border of label (not image+text)
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setBounds(100,100,250,250); // set x,y position within frame as well as dimension


        JFrame frame = new JFrame(); //creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//        frame.setSize(500,500); // sets the x-dimension, and y-dimension of frame
//        frame.setLayout(null);
        frame.setVisible(true); // make frame visible
        frame.add(label);
        frame.pack();


    }

}
