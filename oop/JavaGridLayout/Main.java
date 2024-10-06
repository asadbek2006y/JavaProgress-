package oop.JavaGridLayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        JFrame fram = new JFrame();
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setSize(500, 500);
        fram.setTitle("JAVA GRID LAYOUT");

        JButton button = new JButton();
        fram.setLayout(new GridLayout(3,3, 5 , 5));


        fram.add(new JButton("1"));
        fram.add(new JButton("2"));
        fram.add(new JButton("3"));
        fram.add(new JButton("4"));
        fram.add(new JButton("5"));
        fram.add(new JButton("6"));
        fram.add(new JButton("8"));
        fram.add(new JButton("9"));
        fram.add(new JButton("0"));

        fram.setVisible(true);

    }
}
