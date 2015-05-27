package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Comprobacion extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Comprobacion() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(36, 45, 46, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(25, 70, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel Apelli = new JLabel("1er Apellido");
		Apelli.setBounds(203, 45, 114, 14);
		add(Apelli);
		
		textField_1 = new JTextField();
		textField_1.setBounds(203, 70, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton Comporbar = new JButton("COMPROBAR");
		Comporbar.setBounds(36, 129, 347, 23);
		add(Comporbar);
		
		textField_2 = new JTextField();
		textField_2.setBounds(36, 178, 347, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBounds(22, 255, 89, 23);
		add(btnAtrs);

	}

}
