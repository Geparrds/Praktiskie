package lv.jak.volkovinskis.reg;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


@SuppressWarnings("unused")
public class Fromas extends JFrame implements ActionListener {
	private static final long serialVersionUID = -2237187731170232497L;

	///Definešana
	JPanel panel;
	JLabel vards,uzvards,elektriba,rekinaNR,emailL,telefonaNR;
	JTextField vardsField, uzvardsField, rekinaNRF, emailF,telefonaNRT;
	JList<String> availableList, selectedList;
	JButton allToSelectedBTN, toSelectedBTN, allToAvailableBTN, toAvailableBTN, addBTN, removeBTN, clearBTN, okBTN,cancelBTN;

	DefaultListModel<String> availableModel = new DefaultListModel<String>();
	DefaultListModel<String> selectedModel = new DefaultListModel<String>();

	///Formas Izveidošana, izsaukšana
	public Fromas() {
		setBounds(100, 150, 600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Elektrum.lv");
		setResizable(false);
		init();

		setContentPane(panel);
	}
	

	///Tas kas atrodas formā
	public void init() {
		panel = new JPanel(null);
		
		vards = new JLabel("Vārds:", SwingConstants.RIGHT);
		vards.setBounds(-120, 10, 230, 30);
		
		uzvards = new JLabel("Uzvārds:", SwingConstants.RIGHT);
		uzvards.setBounds(110, 10, 230, 30);
		
		rekinaNR = new JLabel("Rēķina Numurs:", SwingConstants.RIGHT);
		rekinaNR.setBounds(-120, 50, 230, 30);
		///Field
		rekinaNRF  = new JTextField();
		rekinaNRF.setBounds(112, 50, 170, 30);
		
		emailL = new JLabel("E-pasts:", SwingConstants.RIGHT);
		emailL.setBounds(110, 50, 230, 30);
		///Field
		emailF  = new JTextField();
		emailF.setBounds(345, 50, 170, 30);
		///Field
		uzvardsField = new JTextField();
		uzvardsField.setBounds(345, 10, 170, 30);
		///Field
		vardsField = new JTextField();
		vardsField.setBounds(112, 10, 170, 30);
		
		telefonaNR = new JLabel("Tālrunis:", SwingConstants.RIGHT);
		telefonaNR.setBounds(-120, 90, 230, 30);
		
		telefonaNRT = new JTextField();
		telefonaNRT.setBounds(112, 90, 170, 30);
		
		elektriba = new JLabel();
		elektriba.setBounds(x, y, width, height);
		
		panel.add(vards);panel.add(uzvards);panel.add(uzvardsField);panel.add(vardsField);
		panel.add(emailL);panel.add(rekinaNR);panel.add(rekinaNRF);panel.add(emailF);
		panel.add(telefonaNR);panel.add(telefonaNRT);panel.add(elektriba);
		
		
	}

	///Metode
	public void actionPerformed(ActionEvent e) {
	}
}