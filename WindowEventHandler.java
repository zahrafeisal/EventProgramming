import javax.swing.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class WindowEventHandler extends JFrame implements WindowListener {
    public WindowEventHandler() {
        setTitle("Window Event Demo");
        // manual handling of close operation
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        setSize(400, 300);
        addWindowListener(this);
        setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened!");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing requested!");
        int result = JOptionPane.showConfirmDialog(
            e.getWindow(),  // component dialog window will be attached to
            "Are you sure you want to exit?",  // message displayed to user
            "Exit Confirmation",   // title shown at the top of dialog window
            JOptionPane.YES_NO_OPTION   // shows option buttons; Yes & No in this case
        );  // stored in int variable bc Yes=0, No=1, Cancel=2, Dialog Closed(X Button)=-1
        if (result == JOptionPane.YES_OPTION) {
            e.getWindow().dispose();  // closes window, releases resources, triggers windowClosed()
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed!");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window minimized!");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window de-minimized");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated!");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WindowEventHandler::new);
    }
}