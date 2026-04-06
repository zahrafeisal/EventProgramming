package SwingBasics.Containers;

import javax.swing.*;
import java.awt.*;

// JFrame is the main application window

public class JFrameExample extends JFrame{
    public JFrameExample() {
        // Set title
        super("My JFrame Practice");

        // Set size of frame
        setSize(800, 600);   

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
        SwingUtilities.invokeLater(JFrameExample::new);
    }
}