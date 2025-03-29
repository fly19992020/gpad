import javax.swing.*;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/// The editor class.
/// ### Creating:
/// ``` java
/// new GPADEditor()
/// ```
public class GPADEditor extends JFrame{
    private JPanel panel;
    private JTextPane textPane1;
    private JButton saveButton;
    private File file = new File("dummy.txt");

    /// A function used to init the saveButton.
    private void saveButton_init() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(file.exists())) {
                    System.out.println("The file does not exist.");
                }
            }
        });
    }

    public GPADEditor() {
        this.setContentPane(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        saveButton_init();
        this.pack();
        this.setVisible(true);
    }
}
