package oop.JAVAgui;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("oop/JAVAgui/BTPtJxp93q4IUWh7ANCRC21weJFpsJYn--k7n4PHxOW5o7_HBpTZ9OSUFKcDRvFhAlA2SCp9gePdjjsqpUVVh0wT.jpg");
        JFrame jframe = new JFrame();
        jframe.setSize(420,420);
        jframe.setVisible(true);
        jframe.setTitle("JFRAME TITLE");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(true);
        jframe.setIconImage(image.getImage());
        jframe.getContentPane().setBackground(new Color(45,200,255));
        
    }
}
