package Vistas;

import java.awt.EventQueue;
import java.awt.BorderLayout;

public class Main {

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