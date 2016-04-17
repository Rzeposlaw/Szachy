import javax.swing.*;

import static com.sun.glass.ui.Cursor.setVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PuzzleForm extends JFrame{
    private JPanel root4;

    public PuzzleForm() {
        super("Zagadka");
        setContentPane(root4);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
