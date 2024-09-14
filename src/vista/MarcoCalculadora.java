package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MarcoCalculadora  extends JFrame{
	private static final long serialVersionUID = -129200488499068457L;
	private int x=pantallaPorDfecto().width; ;
	private int y=pantallaPorDfecto().height;
   public MarcoCalculadora() {
	setLayout(new BorderLayout());
	setBounds(x/4,y/4,x/3,y/2);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setIconImage(new ImageIcon("bin/images/icons/calculadora.png").getImage());
	add(new LaminaPantalla(),BorderLayout.NORTH);
	add(new LaminaBotones(),BorderLayout.CENTER);
	
}
	private Dimension pantallaPorDfecto() {
	   Toolkit getDefaultTool = Toolkit.getDefaultToolkit();
	   Dimension getDefaultScreen = getDefaultTool.getScreenSize();
	   return getDefaultScreen;
   }
   
}
