package oop.MouseListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyMouseListener extends JFrame implements MouseListener {

    JPanel panel;
    JLabel label;

    public MyMouseListener() {
        // Frame setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(null); // Using absolute positioning

        // Panel setup
        panel = new JPanel();
        panel.setBounds(100, 100, 200, 200);
        panel.setBackground(Color.CYAN);
        panel.addMouseListener(this); // Adding MouseListener to the panel

        // Label setup
        label = new JLabel("Mouse Listener Example");
        label.setBounds(50, 50, 200, 50);

        // Adding components to the frame
        this.add(panel);
        this.add(label);
        this.setVisible(true);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        // When the mouse is clicked
        System.out.println("Mouse Clicked");
        panel.setBackground(Color.ORANGE); // Change the panel color on click
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // When the mouse button is pressed
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // When the mouse button is released
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // When the mouse enters the panel
        System.out.println("Mouse Entered the Panel");
        panel.setBackground(Color.GREEN); // Change panel color when mouse enters
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // When the mouse exits the panel
        System.out.println("Mouse Exited the Panel");
        panel.setBackground(Color.CYAN); // Change back to original color when exited
    }

    public static void main(String[] args) {
        new MyMouseListener(); // Ensure no errors here
    }
}
