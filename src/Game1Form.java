import javax.swing.*;

import static com.sun.glass.ui.Cursor.setVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game1Form extends JFrame{
    private JPanel panel1;

    public Game1Form() {
        super("Gra");
        setContentPane(panel1);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
