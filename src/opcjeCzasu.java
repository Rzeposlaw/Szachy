import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.glass.ui.Cursor.setVisible;
/**
 * Created by Iza on 2016-04-13.
 */
public class opcjeCzasu extends JFrame{

    private JPanel root2;
    private JButton OKButton;
    private JFormattedTextField NICKFormattedTextField;
    private JRadioButton BULLETRadioButton;
    private JRadioButton BLITZRadioButton;
    private JRadioButton RAPIDRadioButton;
    private JRadioButton STANDARDRadioButton;

    public opcjeCzasu() {
        super("Opcje czasu");
        setContentPane(root2);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game1Form o = new Game1Form();
            }
        });
        setVisible(true);
    }


}
