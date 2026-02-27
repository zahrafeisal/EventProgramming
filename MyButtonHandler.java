import javax.swing.*;
import java.awt.event.*;

public class MyButtonHandler extends JFrame implements ActionListener {
    // private access: avoid other classes changing it n breaking the program
    private JButton myButton;   

    public MyButtonHandler() {  // constructor method
        setTitle("Button Click Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        myButton = new JButton("Click Me");
        panel.add(myButton);
        add(panel);

        // Register the ActionListener w the button
        myButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {    // identifies component generating event, useful for many comps sharing one listener
            System.out.println("Button clicked!");
        }
    }

    public static void main(String[] args) {
        new MyButtonHandler();
    }
}