package oop.ColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import oop.modifiers.package1.B;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    JPanel panel;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());

        label = new JLabel("Click the button to choose Color!!");
        label.setOpaque(true);
        label.setBackground(Color.WHITE);

        button = new JButton();
        button.addActionListener(this);

        panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setSize(100, 100);
        panel.setOpaque(true);
        panel.setPreferredSize(new java.awt.Dimension(100, 100));

        this.add(label);
        this.add(button);
        this.add(panel);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            Color selectedColor = JColorChooser.showDialog(null, "Pick a Color", Color.WHITE);

            if (selectedColor != null) {
                label.setText("Selected Color: " + selectedColor);
                panel.setBackground(selectedColor);
            }
        }
    }

}
