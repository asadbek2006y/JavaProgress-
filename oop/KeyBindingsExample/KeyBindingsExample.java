package oop.KeyBindingsExample;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class KeyBindingsExample extends JFrame {

    private JPanel panel;

    public KeyBindingsExample() {
        // Frame setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());

        // Panel setup
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        this.add(panel, BorderLayout.CENTER);

        // Key Bindings
        setUpKeyBindings();

        this.setVisible(true);
    }

    private void setUpKeyBindings() {
        // Get the input map for the panel
        InputMap inputMap = panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        // Define the keys and their corresponding actions
        inputMap.put(KeyStroke.getKeyStroke("R"), "changeRed");
        inputMap.put(KeyStroke.getKeyStroke("G"), "changeGreen");
        inputMap.put(KeyStroke.getKeyStroke("B"), "changeBlue");

        // Get the action map for the panel
        ActionMap actionMap = panel.getActionMap();

        // Define actions for the keys
        actionMap.put("changeRed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });

        actionMap.put("changeGreen", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });

        actionMap.put("changeBlue", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KeyBindingsExample());
    }
}
