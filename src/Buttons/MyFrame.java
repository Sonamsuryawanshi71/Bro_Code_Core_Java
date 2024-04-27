package Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("images.png");
        ImageIcon icon2 = new ImageIcon("smiley.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(100 ,100 ,100,100);
        label.setVisible(true);

        button = new JButton();
        button.setBounds(200 ,100 ,250,250);
//        button.addActionListener(this);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("I am a Button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.blue);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
//            System.out.println("poo");
//            button.setEnabled(false);
            label.setVisible(true);
        }

    }
}


