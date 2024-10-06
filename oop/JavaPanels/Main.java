package oop.JavaPanels;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {

        ImageIcon icon = new  ImageIcon("Noto_Emoji_Oreo_1f44d.svg.png");
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        JPanel rpanel = new JPanel();
        rpanel.setBackground(Color.red);
        rpanel.setBounds(0,0, 250 , 250);

        JPanel bpanel = new JPanel();
        bpanel.setBackground(Color.blue);
        bpanel.setBounds(250,0, 250 , 250);

        JPanel ypanel = new JPanel();
        ypanel.setBackground(Color.yellow);
        ypanel.setBounds(0,250, 500 , 250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        rpanel.add(label);
        frame.add(rpanel);
        frame.add(bpanel);
        frame.add(ypanel);
    }
}