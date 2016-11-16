package uiMain.gui.oyentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import suPropiedadRaiz.excepciones.ExcepcionUsuario1;
import suPropiedadRaiz.excepciones.ExcepcionUsuario2;
import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Administrador;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Persona;
import uiMain.gui.GUIAdministrador;
import uiMain.gui.GUIUsuario;

public class OyenteBoton implements ActionListener {
	
	JButton B1;
	JLabel L1, L2, L3;
	JTextField T1, T2;
	int count = 1;
	
	public OyenteBoton() {

	}

	public OyenteBoton(JButton B, JLabel L1, JLabel L2, JLabel L3, JTextField T1, JTextField T2) {
		this.B1 = B;
		this.L1 = L1;
		this.L2 = L2;
		this.L3 = L3;
		this.T1 = T1;
		this.T2 = T2;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		
		if(e.getSource() instanceof JButton){
			
			if("Salir".equals(actionCommand)){
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "¡Saliendo!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
				
				if(resp == 0){
					System.exit(0);
				}else if(resp == 1){
					
				}
			}else if("Ingresar".equals(actionCommand)){
				B1.setText("<html><p align='center'>Complete informacion y de nuevo clic</p></html>");
				B1.setActionCommand("Continuar");
				
				L1.setVisible(true);
				L2.setVisible(true);
				L3.setVisible(true);
				
				T1.setVisible(true);
				T2.setVisible(true);
				
			}else if("Continuar".equals(actionCommand)){
				String usuario = T1.getText();
				String clave = T2.getText();

				if(usuario.equals("") || clave.equals("") ){
					try {
						throw new ExcepcionUsuario1();
					} catch (ExcepcionUsuario1 e1) {
						// TODO Auto-generated catch block
						JOptionPane.showConfirmDialog(null, e1.getMessage(), "¡ERROR!", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
					}
				}else{
						long user = Long.parseLong(usuario);
						
						try {
							Persona p = GestorArchivos.buscar(user);

							if(p == null){
								throw new ExcepcionUsuario2();
							}else if(p instanceof Administrador){
								new GUIAdministrador();
								
							}else if(p instanceof Cliente){
								new GUIUsuario();
								
							}
						} catch (ClassNotFoundException | IOException | ExcepcionUsuario2 e1) {
							JOptionPane.showConfirmDialog(null, e1.getMessage(), "¡ERROR!", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
						}
						
				}
			}else if("Inmuebles".equals(actionCommand)){
				ArrayList<Persona> personasRegistradas;
				ArrayList<ImageIcon> imgInmuebles;
				
				try{
					personasRegistradas = GestorArchivos.crearListaPersonas();					
					imgInmuebles = new ArrayList<ImageIcon>();
					imgInmuebles.add(new ImageIcon("./imagenes/Img1.PNG"));
					imgInmuebles.add(new ImageIcon("./imagenes/Local.JPG"));
					
					for(int i = 1; i <= personasRegistradas.size(); i++){
						//Acá va la captura y añadida de las imagenes de cada casa
					}
					if(count < imgInmuebles.size()){
						JButton B2 = (JButton) e.getSource();
						B2.setIcon(imgInmuebles.get(count));
						count ++;
					}else{
						count = 0;
						JButton B2 = (JButton) e.getSource();
						B2.setIcon(imgInmuebles.get(count));
						count ++;
					}
				}catch(Exception e1){
					e1.printStackTrace();
				}
			}
		}
	}
}
