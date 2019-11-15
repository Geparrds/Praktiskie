package lv.jak.volkovinskis.reg;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

@SuppressWarnings("unused")
public class Fromas extends JFrame implements ActionListener {
	private static final long serialVersionUID = -2237187731170232497L;

	/// Definešana
	JPanel panel;
	JLabel vards, uzvards, elektriba, rekinaNR, emailL, telefonaNR;
	JTextField vardsField, uzvardsField, rekinaNRF, emailF, telefonaNRT, elektribaF;
	JList<String> availableList, selectedList;
	JButton allToSelectedBTN, toSelectedBTN, allToAvailableBTN, toAvailableBTN, addBTN, cancelBTN;

	DefaultListModel<String> availableModel = new DefaultListModel<String>();
	DefaultListModel<String> selectedModel = new DefaultListModel<String>();

	/// Formas Izveidošana, izsaukšana
	public Fromas() {
		setBounds(100, 150, 640, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("TET");
		setResizable(false);
		init();

		setContentPane(panel);
	}

	/// Tas kas atrodas formā
	public void init() {
		panel = new JPanel(null);
		panel.setBackground(Color.WHITE);

		vards = new JLabel("Vārds:", SwingConstants.RIGHT);
		vards.setBounds(-120, 10, 230, 30);

		uzvards = new JLabel("Uzvārds:", SwingConstants.RIGHT);
		uzvards.setBounds(150, 10, 230, 30);

		rekinaNR = new JLabel("Rēķina Numurs:", SwingConstants.RIGHT);
		rekinaNR.setBounds(-120, 50, 230, 30);
		/// Field
		rekinaNRF = new JTextField();
		rekinaNRF.setBounds(112, 50, 170, 30);

		emailL = new JLabel("E-pasts:", SwingConstants.RIGHT);
		emailL.setBounds(150, 50, 230, 30);
		/// Field
		emailF = new JTextField();
		emailF.setBounds(385, 50, 170, 30);
		/// Field
		uzvardsField = new JTextField();
		uzvardsField.setBounds(385, 10, 170, 30);
		/// Field
		vardsField = new JTextField();
		vardsField.setBounds(112, 10, 170, 30);

		telefonaNR = new JLabel("Tālrunis:", SwingConstants.RIGHT);
		telefonaNR.setBounds(-120, 90, 230, 30);
		/// Field
		telefonaNRT = new JTextField();
		telefonaNRT.setBounds(112, 90, 170, 30);

		elektriba = new JLabel("Patēriņš(kWh):", SwingConstants.RIGHT);
		elektriba.setBounds(150, 90, 230, 30);
		/// Field
		elektribaF = new JTextField();
		elektribaF.setBounds(385, 90, 170, 30);

		addBTN = new JButton("Aprēķināt");
		addBTN.setBounds(130, 165, 100, 30);
		addBTN.addActionListener(this);
		addBTN.setBackground(Color.cyan);

		cancelBTN = new JButton("Cancel");
		cancelBTN.setBounds(20, 165, 100, 30);
		cancelBTN.addActionListener(this);
		cancelBTN.setBackground(Color.cyan);

		panel.add(vards);panel.add(uzvards);panel.add(uzvardsField);panel.add(vardsField);
		panel.add(emailL);panel.add(rekinaNR);panel.add(rekinaNRF);panel.add(emailF);
		panel.add(telefonaNR);panel.add(telefonaNRT);panel.add(elektriba);panel.add(elektribaF);
		panel.add(addBTN);panel.add(cancelBTN);

	}

	/// Metode
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == cancelBTN) {

			System.exit(0); /// program closed
		}

		if (e.getSource() == addBTN) {

			if (!vardsField.getText().isEmpty() && !uzvardsField.getText().isEmpty() && !rekinaNRF.getText().isEmpty()
					&& !emailF.getText().isEmpty() && !telefonaNRT.getText().isEmpty()
					&& !elektribaF.getText().isEmpty()) {

				elektribaF.getText();
				int aprekinatspaterins = Integer.parseInt(elektribaF.getText());
				double ew = (double) (aprekinatspaterins * 0.05097);
				DecimalFormat newrandom = new DecimalFormat("#.##");

				Component frame = panel;
				JOptionPane.showMessageDialog(frame, "Summa par patēriņu ir: " + newrandom.format(ew) + ("€"));
				Component frame2 = panel;
				JOptionPane.showMessageDialog(frame2,
						"Ievaditie dati: \n" + "Vārds: " + vardsField.getText() + "\n" + "Uzvārds: "
								+ uzvardsField.getText() + "\n" + "Reķina Numurs: " + rekinaNRF.getText() + "\n"
								+ "E-pasts: " + emailF.getText() + "\n" + "Talrunis: " + telefonaNRT.getText() + "\n"
								+ "Patēriņš: " + elektribaF.getText() + "\n" + "Summa par patēriņu: "
								+ newrandom.format(ew) + ("€"));

			} else {
				Component frame3 = panel;
				JOptionPane.showMessageDialog(frame3, "Programmu nevar palaist tālāk, jo visi lauki nav aizpildīti");

			}
		}
	}
}