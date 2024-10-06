package oop.FlowLayout;

import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT)); // Set the layout to FlowLayout

        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));
        frame.add(new Button("6"));
        frame.add(new Button("8"));
        frame.add(new Button("9"));

        frame.setVisible(true);

    }
}
