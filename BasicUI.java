import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BasicUI {
    public static void main (String[] args) {
        JFrame frame = new JFrame("My First Swing GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Enter your name:");
        JButton button = new JButton("Submit");
        JTextField textField = new JTextField(20);   // creates a text field w 20 columns

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Submitted!");
                textField.setText("");
            }
        });

        panel.add(label);
        panel.add(button);
        panel.add(textField);

        frame.add(panel);

        frame.setVisible(true);
    }
}