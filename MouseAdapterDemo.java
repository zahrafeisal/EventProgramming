import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterDemo extends JFrame {
    private JLabel statusLabel;

    public MouseAdapterDemo() {
        setTitle("Mouse Adapter Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        statusLabel = new JLabel("No mouse event detected.");
        statusLabel.setBounds(50, 50, 300, 20);
        add(statusLabel);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Mouse clicked using Adapter at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                statusLabel.setText("Mouse entered the frame.");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseAdapterDemo::new);
    }
}