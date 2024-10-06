package oop.JavaLebels;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {

        Border border = BorderFactory.createLineBorder(Color.green, 3);
        ImageIcon image = new ImageIcon(
                "oop/JAVAgui/BTPtJxp93q4IUWh7ANCRC21weJFpsJYn--k7n4PHxOW5o7_HBpTZ9OSUFKcDRvFhAlA2SCp9gePdjjsqpUVVh0wT.jpg");

        JLabel label = new JLabel();
        label.setText("BRO, DO YOU EVEN CODE? ");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Bolli",  Font.PLAIN, 20)) ;
        label.setIconTextGap(-100);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 250, 250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

    }
}
