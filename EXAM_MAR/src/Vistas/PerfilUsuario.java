package Vistas;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PerfilUsuario extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public PerfilUsuario() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(227, 11, 46, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(221, 36, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(231, 67, 46, 14);
		add(label);
		
		JLabel lblApelidos = new JLabel("Apelidos");
		lblApelidos.setBounds(216, 67, 46, 14);
		add(lblApelidos);
		
		textField_1 = new JTextField();
		textField_1.setBounds(221, 92, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(216, 139, 46, 14);
		add(lblEdad);
		
		textField_2 = new JTextField();
		textField_2.setBounds(221, 164, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(221, 211, 86, 14);
		add(lblNacionalidad);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(377, 11, 46, 14);
		add(lblId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(360, 36, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(221, 253, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(357, 285, 89, 23);
		add(btnSiguiente);
		
		JLabel lblAvatar = new JLabel("");
		lblAvatar.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/Avatar/usuario.jpg")));
		lblAvatar.setBounds(30, 36, 154, 191);
		add(lblAvatar);

	}
}
