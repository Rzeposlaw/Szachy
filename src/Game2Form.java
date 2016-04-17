import javax.swing.*;

import static com.sun.glass.ui.Cursor.setVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game2Form extends JFrame{
    private JPanel root3;

    public Game2Form() {
        super("Gra");
        setContentPane(root3);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
