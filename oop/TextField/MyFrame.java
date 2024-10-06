package oop.TextField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    MyFrame() {
        button = new JButton("Submit");
        textField = new JTextField();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        textField.setPreferredSize(new Dimension(250, 40));

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Welcome " + textField.getText());
        }

    }
}
