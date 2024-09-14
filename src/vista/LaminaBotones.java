package vista;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import controlador.AccionesBotones;
import controlador.AccionesAritmeticas;
public class LaminaBotones extends JPanel {

	private static final long serialVersionUID = -4573300572385296670L;
	private JButton botonesGenerador;
	public LaminaBotones() {
	
		setLayout(new BorderLayout());
//		 JButton botonesGenerador = new JButton("1");
//		 add(botonesGenerador,BorderLayout.WEST);
		add(getLaminaBotones(),BorderLayout.CENTER);
		add(getLaminaBotonesArimeticos(),BorderLayout.EAST);
	}
	private JPanel getLaminaBotones() {
		JPanel laminaBotones =new JPanel();
		laminaBotones.setLayout(new GridLayout(4,3));
		String[] numeros= {"7","8","9","6","5","4","3","2","1","0",".","="};
		for (int i = 0; i < 12; i++) {
			if(numeros[i]=="=") {
				 botonesGenerador = new JButton(new AccionesAritmeticas (numeros[i],i));
			}else {
			 botonesGenerador = new JButton(new AccionesBotones(numeros[i], i));
			}
//			 botonesGenerador.addActionListener(new AccionesBotones(""+i, i));
			 laminaBotones.add(botonesGenerador);
		}
		return laminaBotones;
	}
	private JPanel getLaminaBotonesArimeticos () {
		JPanel laminaArimetico =new JPanel();
		laminaArimetico.setPreferredSize(new Dimension(100,0));
		laminaArimetico.setLayout(new GridLayout(5,1));
		String[] caracteresAritmeticos= {"CE","+","-","x","/"};
		for (int i = 0; i < 5; i++) {
			 botonesGenerador =
					 new JButton(new AccionesAritmeticas (caracteresAritmeticos[i],i));
			 laminaArimetico.add(botonesGenerador);
		}
		return laminaArimetico;
	}
	
}
