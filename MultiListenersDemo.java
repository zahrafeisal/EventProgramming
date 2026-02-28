import javax.swing.*;
import java.awt.event.*;

public class MultiListenersDemo extends JFrame {
    public MultiListenersDemo() {
        setTitle("Multiple Listeners Demo");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JButton button = new JButton("Click/Hover");

        button.addActionListener(new ActionListener() {  // for clicking
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The button was clicked!");
            }
        });

        button.addMouseListener(new MouseAdapter() {  // for hovering
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered the button area!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited the button area!");
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing requested!");
                int result = JOptionPane.showConfirmDialog(
                    e.getWindow(),
                    "Are you sure you want to exit?",
                    "Exit Confirmation",
                    JOptionPane.YES_NO_OPTION
                );

                if (result == JOptionPane.YES_OPTION) {
                    System.out.println("Window closing confirmed!");
                    e.getWindow().dispose();
                } else {
                    System.out.println("Window closing rejected!");
                }
            }
        });

        add(button);
        pack();  // automatic window resize to fit components, instead of manual setSize()
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MultiListenersDemo::new);
    }
}