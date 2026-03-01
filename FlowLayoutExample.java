import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    public FlowLayoutExample() {
        setTitle("FlowLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // Set FlowLayout for the frame

        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Longer Button 4"));
        add(new JButton("Button 5"));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FlowLayoutExample().setVisible(true));
    }
}