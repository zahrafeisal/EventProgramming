import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MyKeyListenerExample extends JFrame implements KeyListener {
    public MyKeyListenerExample() {
        setTitle("Key Listener Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addKeyListener(this);
        setFocusable(true);   // allows the component to receive key events
        setFocusTraversalKeysEnabled(false);

        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left arrow pressed!");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key typed: " + e.getKeyChar());
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyKeyListenerExample::new);
    }
}
