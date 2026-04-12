package SwingBasics.Containers;  // why do i need to make a package declaration?

import javax.swing.*;
import java.awt.*;

public class JDialogExample extends JDialog {
    private final JTextField nameField = new JTextField(20);

    // stores user input
    private String result;

    public JDialogExample(JFrame owner) {
        // owner = parent frame; true = modal
        // A modal dialog blocks all input to the parent frame until it's closed
        super(owner, "Enter Your Name", true);

        JButton okBtn = new JButton("OK");
        JButton cancelBtn = new JButton("Cancel");

        // OK: capture text field, close dialog
        okBtn.addActionListener(e -> {
            // store input so caller can read it via getResult()
            result = nameField.getText();
            // close dialog & release resources
            dispose();
        });

        // Cancel: skip storing anything, close dialog
        cancelBtn.addActionListener(e -> dispose());

        // Input row: label & text field placed left-to-right
        JPanel content = new JPanel(new FlowLayout());
        content.add(new JLabel("Name:"));
        content.add(nameField);

        // Button row: right-aligned so they sit at bottom-right corner
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttons.add(okBtn);
        buttons.add(cancelBtn);

        // JDialog has a default BorderLayout; place input in the centre
        // and the buttons along bottom edge
        add(content, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

        // Shrink dialog window to the min size that fits all components
        // then centre it over the parent frame
        pack();
        setLocationRelativeTo(owner);
    }

    // Returns entered name, or null if user cancelled.
    public String getResult() {
        return result;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JDialogExample dialog = new JDialogExample(frame);

        // Bc the dialog is modal, setVisible(true) blocks here
        // until the user clicks OK or Cancel & dispose() is called
        dialog.setVisible(true);

        // Execution continues here after the dialog closes.
        if (dialog.getResult() != null) {
            System.out.println("Hello, " + dialog.getResult());
        }
    }
}