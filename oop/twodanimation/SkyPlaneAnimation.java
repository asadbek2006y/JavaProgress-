package oop.twodanimation;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SkyPlaneAnimation extends JPanel implements ActionListener {
    private Image sky; // Background image
    private Image plane; // Plane image
    private int planeX; // Current x position of the plane
    private final int PLANE_SPEED = 5; // Speed of the plane
    private final int PLANE_WIDTH = 100; // Desired width of the plane
    private final int PLANE_HEIGHT = 50; // Desired height of the plane

    public SkyPlaneAnimation() {
        // Load images
        sky = new ImageIcon(getClass().getResource("sky.png")).getImage();
        Image originalPlane = new ImageIcon(getClass().getResource("plane.png")).getImage();
        
        // Resize the plane image
        plane = originalPlane.getScaledInstance(PLANE_WIDTH, PLANE_HEIGHT, Image.SCALE_SMOOTH);

        // Initialize the plane's starting position
        planeX = 0;

        // Set up a timer to control the animation
        Timer timer = new Timer(100, this); // Update every 100 ms
        timer.start(); // Start the timer

        // Set the preferred size of the panel
        this.setPreferredSize(new Dimension(800, 600)); // Adjust as needed
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(sky, 0, 0, this); // Draw the sky background
        g.drawImage(plane, planeX, 200, this); // Draw the plane at its current position
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the plane's position
        planeX += PLANE_SPEED;

        // If the plane moves off the screen, reset its position
        if (planeX > getWidth()) {
            planeX = -plane.getWidth(this); // Reset to start from the left side
        }

        repaint(); // Request a repaint to update the animation
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 2D Animation");
        SkyPlaneAnimation animationPanel = new SkyPlaneAnimation();
        frame.add(animationPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
