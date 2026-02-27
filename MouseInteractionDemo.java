import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInteractionDemo extends JFrame implements MouseListener {
    private JLabel statusLabel;

    public MouseInteractionDemo() {
        setTitle("Mouse Listener Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);   // disable layout manager; components not auto-arranged

        statusLabel = new JLabel("No mouse event detected.");
        statusLabel.setBounds(50, 50, 300, 20);  // (x, y, w, h) manual positioning
        add(statusLabel);

        addMouseListener(this); // MouseListener added to frame itself

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse pressed at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse released at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse entered the frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse exited the frame");
    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(MouseInteractionDemo::new);
    }
}