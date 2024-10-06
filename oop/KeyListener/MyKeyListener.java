package oop.KeyListener;  // Make sure the package matches your folder structure

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyKeyListener extends JFrame implements KeyListener {

    JLabel label;

    public MyKeyListener() {
        // Frame setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(null); // Using absolute positioning

        // Label setup
        label = new JLabel();
        label.setBounds(100, 100, 100, 100);
        label.setBackground(Color.CYAN);
        label.setOpaque(true);

        // Adding KeyListener to the frame
        this.addKeyListener(this);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // This method is invoked when a key is typed
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // This method is invoked when a key is pressed
        System.out.println("Key Pressed: " + e.getKeyChar());

        // Moving the label based on arrow keys
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case KeyEvent.VK_RIGHT:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case KeyEvent.VK_UP:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case KeyEvent.VK_DOWN:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // This method is invoked when a key is released
        System.out.println("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new MyKeyListener();
    }
}
