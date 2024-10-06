package oop.JOption;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);
        // while (true) {
        //     JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);
        // }

        JOptionPane.showConfirmDialog(null,"Bro, do you even code", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        
    }
}
