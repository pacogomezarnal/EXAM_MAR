package Vistas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Perfil extends JFrame {

	private JPanel contentPane; // Declara variable
	private PerfilUsuario PerfU; // Declara variable
	
	/**
	 * @wbp.nonvisual location=181,19
	 */
	private final JLabel TheLaby = new JLabel("THE LABY");

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil frame = new Perfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Perfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PerfU= new PerfilUsuario(); //Inicias la variable
		
		contentPane.setLayout(new CardLayout(0,0)); //Se crea el Cardlayout
		getContentPane().add(PerfU,"Perfil Usuarios"); //muestra la ventana Perfil Usuarios
	}
}
