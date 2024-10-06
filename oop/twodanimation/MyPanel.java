package oop.twodanimation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    final int IMAGE_WIDTH = 10;
    final int IMAGE_HEIGHT = 10;
    Image plane;
    Image sky;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int y = 0;
    int x = 0;


    MyPanel() {

        this.setPreferredSize(new Dimension(PANEL_HEIGHT, PANEL_WIDTH));
        plane = originalIcon.getImage().getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT, Image.SCALE_SMOOTH);
    
        this.setBackground(Color.black);
        plane = new ImageIcon(getClass().getResource("plane.png")).getImage();
        timer = new Timer(1000, null);

    }

    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(plane, x,y, null);
    }

    @Override 
    public void actionPerformed(ActionEvent e){
        
    }
}
