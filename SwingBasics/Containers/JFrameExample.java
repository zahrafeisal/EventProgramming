package SwingBasics.Containers;

import javax.swing.*;
import java.awt.*;

// JFrame is the main application window

public class JFrameExample extends JFrame{
    public JFrameExample() {
        // Pass window title to JFrame's constructor
        super("My JFrame Practice");  // or setTitle();

        // Set size of frame in pixels (w, h)
        // ALT: call pack() after adding components to auto-size
        setSize(800, 600);   

        // Define what happens when user clicks 'X'
        // Terminate the JVM when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center on screen, can only be called after setSize
        setLocationRelativeTo(null);

        // Add components to ContentPane
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(new JLabel("Hello, Swing!"), BorderLayout.CENTER);
        getContentPane().add(mainPanel);  // returns container where components are added
        // ☝️SAME AS: add(mainPanel);

        // LASTLY, make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // ALWAYS launch UI on EDT
        // invokeLater: schedules MainFrame construction to run on EDT
        SwingUtilities.invokeLater(JFrameExample::new);
    }
}