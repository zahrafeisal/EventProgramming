import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample() {
        setTitle("GridLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set GridLayout with 3 rows, 2 columns
        setLayout(new GridLayout(3, 2));  // (row, col)

        add(new JButton("Cell 1"));
        add(new JButton("Cell 2"));
        add(new JButton("Cell 3"));
        add(new JButton("Cell 4"));
        add(new JButton("Cell 5"));
        add(new JButton("Cell 6"));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GridLayoutExample().setVisible(true));
    }
}