// NB: This programe is not EDT compliant

// STEP 1: import necessities
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

// swing has components but not basic functionalities like color, font, layouts or events
// hence swing components still rely on awt

public class MySwingApp {
    public static void main(String[] args) {
        // STEP 2: Initialize top-level container; main application window
        JFrame frame = new JFrame("My First Swing Application");

        // STEP 3(a): frame configuration: size, default close operation
        frame.setSize(400, 300); // (w, h)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit application when window is closed

        // STEP 4: addition of components to the frame
        JPanel panel = new JPanel();    // container for easy  organization & layout of other components
        JLabel label = new JLabel("Click the button!");
        JButton button = new JButton("Click Me");

        // STEP 7: event handling - attach ActionListeners to interactive components
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // STEP 5: add components to the panel
        panel.add(label);
        panel.add(button);

        // STEP 6: add panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // STEP 3(b): frame configuration: visibility
        frame.setVisible(true);  // makes frame visible
    }
}