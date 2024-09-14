package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LaminaPantalla extends JPanel {
   private static final long serialVersionUID = -2518974425780261630L;
private static  JTextField pantalla = new JTextField();
	public LaminaPantalla() {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(0,120));
		pantalla.setEnabled(false);
		pantalla.setDisabledTextColor(Color.BLACK); 
		pantalla.setFont(new Font("Serif",Font.BOLD,32));
		pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		add(pantalla);
  }
	public static JTextField getPantalla() {
		return pantalla;
	}
}
