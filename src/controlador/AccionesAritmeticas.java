package controlador;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import vista.LaminaPantalla;

public class AccionesAritmeticas  extends AbstractAction{
    private static final long serialVersionUID = -8805666149379057276L;
    private static String tomar;
    private static double resultado;
	public AccionesAritmeticas(String nombre , int numero) {
		putValue(Action.NAME,nombre);
		putValue("aritmetica",numero);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	String accionAritmetica = e.getActionCommand();
//	var gracias= LaminaPantalla.getPantalla().getText();
	if(accionAritmetica=="CE") {
		LaminaPantalla.getPantalla().setText("");
		resultado=0;
	}
	if(accionAritmetica=="+") {
		ObtenerPrimero(); 
		tomar="+";
	}else if(accionAritmetica=="-") {
		ObtenerPrimero(); 
		tomar="-";
	}else if(accionAritmetica=="x") {
		ObtenerPrimero();
		tomar="*";
	}else if(accionAritmetica=="/") {
		ObtenerPrimero();
		tomar="/";
	}else if(accionAritmetica=="="){
		
		if(tomar.equals("+")) {

				resultado+=Double.parseDouble(LaminaPantalla.getPantalla().getText());
				LaminaPantalla.getPantalla().setText(""+resultado);
			
		}else if(tomar.equals("-")) {
				resultado-=Double.parseDouble(LaminaPantalla.getPantalla().getText());
				LaminaPantalla.getPantalla().setText(""+resultado);

		}
		else if(tomar.equals("*")) {
				resultado*=Double.parseDouble(LaminaPantalla.getPantalla().getText());
				LaminaPantalla.getPantalla().setText(""+resultado);

		}
		else if(tomar.equals("/")) {
				resultado/=Double.parseDouble(LaminaPantalla.getPantalla().getText());
				LaminaPantalla.getPantalla().setText(""+resultado);
			
		}
	}
		
	}

  public void ObtenerPrimero() {
			resultado=Double.parseDouble(LaminaPantalla.getPantalla().getText());
		LaminaPantalla.getPantalla().setText("");
		
  }
}
