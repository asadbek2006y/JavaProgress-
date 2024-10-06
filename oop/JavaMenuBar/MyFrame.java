package oop.JavaMenuBar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenuItem copyItem;
    JMenuItem pasteItem;
    JMenuItem aboutItem;

    public MyFrame() {

        // Frame setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        // Creating the MenuBar
        menuBar = new JMenuBar();

        // Creating Menus
        fileMenu = new JMenu("🗄️ File"); // Added folder emoji
        editMenu = new JMenu("✏️ Edit"); // Added pencil emoji
        helpMenu = new JMenu("❓ Help"); // Added question emoji

        // Adding Menus to MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Creating MenuItems for File Menu
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        // Adding MenuItems to File Menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Creating MenuItems for Edit Menu
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");

        // Adding MenuItems to Edit Menu
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Creating MenuItem for Help Menu
        aboutItem = new JMenuItem("About");

        // Adding MenuItem to Help Menu
        helpMenu.add(aboutItem);

        // Adding ActionListeners for MenuItems
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        aboutItem.addActionListener(this);

        // Adding the MenuBar to the Frame
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openItem) {
            System.out.println("Open selected");
        } else if (e.getSource() == saveItem) {
            System.out.println("Save selected");
        } else if (e.getSource() == exitItem) {
            System.out.println("Exit selected");
            System.exit(0);
        } else if (e.getSource() == copyItem) {
            System.out.println("Copy selected");
        } else if (e.getSource() == pasteItem) {
            System.out.println("Paste selected");
        } else if (e.getSource() == aboutItem) {
            System.out.println("About selected");
        }
    }


}
