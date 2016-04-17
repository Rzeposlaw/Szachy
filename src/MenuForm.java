import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.glass.ui.Cursor.setVisible;


public class MenuForm extends JFrame{
	private JButton dupaButton;
	private JPanel root;
	private JButton a2GRACZYButton;
	private JButton WCZYTAJGRĘButton;
	private JButton ZAGADKITAKTYCZNEButton;
	private JButton GRAZKOMPUTEREMButton;
	private JRadioButton muzykaOffRadioButton;

	public MenuForm() {
		super("Szachy");
		setContentPane(root);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GRAZKOMPUTEREMButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				opcjeCzasu o = new opcjeCzasu();
			}
		});
		ZAGADKITAKTYCZNEButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PuzzleForm o = new PuzzleForm();
			}
		});

		setVisible(true);
	}

	private void createUIComponents() {
		// TODO: place custom component creation code here
	}
}
