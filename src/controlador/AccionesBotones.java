package controlador;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import vista.LaminaPantalla;

public class AccionesBotones extends AbstractAction {
		private static final long serialVersionUID = 7246370505590759949L;
		public AccionesBotones(String nombre , int numero) {
			putValue(Action.NAME,nombre);
			putValue("numero",numero);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			Object getButton = e.getActionCommand();

				LaminaPantalla.getPantalla().setText(LaminaPantalla.getPantalla().getText()+getButton);
			
			
		}
		
}
