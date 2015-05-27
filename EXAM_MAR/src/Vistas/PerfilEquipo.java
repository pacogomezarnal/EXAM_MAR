package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PerfilEquipo extends JPanel {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	// Se crea el JPanel
	
	public PerfilEquipo() {
		setLayout(null);
		
		JLabel Equip = new JLabel("Equipo");
		Equip.setBounds(22, 37, 46, 14);
		add(Equip);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(22, 62, 99, 20);
		add(comboBox);
		
		JLabel Nom = new JLabel("Nombre:");
		Nom.setBounds(172, 11, 80, 14);
		add(Nom);
		
		textField = new JTextField();
		textField.setBounds(172, 34, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel Apelli = new JLabel("1er Apellido");
		Apelli.setBounds(172, 80, 80, 14);
		add(Apelli);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 105, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Apelli2 = new JLabel("2\u00BA Apellido");
		Apelli2.setBounds(172, 154, 78, 14);
		add(Apelli2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 186, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel Nacionali = new JLabel("Nacionalidad");
		Nacionali.setBounds(168, 232, 84, 14);
		add(Nacionali);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 269, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(313, 11, 46, 14);
		add(lblId);
		
		textField_4 = new JTextField();
		textField_4.setBounds(313, 34, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton Atrs = new JButton("Atr\u00E1s");
		Atrs.setBounds(10, 266, 89, 23);
		add(Atrs);
		
		JButton Siguiente = new JButton("Siguiente");
		Siguiente.setBounds(338, 268, 89, 23);
		add(Siguiente);
		
		

	}
}
