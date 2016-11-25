package uiMain.gui.oyentes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import suPropiedadRaiz.usuarios.Persona;
import uiMain.gui.GUIAdministrador;
import uiMain.gui.GUIAnonimo;
import uiMain.gui.GUIUsuario;

/**
 * Esta clase representa los oyentes de la barra de menu
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OyenteMenu implements ActionListener {

	Persona p;
	JFrame V1;
	Container P0;
	JPanel P1,P2,P3,P4,P5,P6;
	JLabel L1,L2,L3,L4,L5,L6;
	JButton B1,B2,B3,B4,B5;

	/**
	 * Constructor default
	 */
	public OyenteMenu(){
		
	}
	
	/**
	 * constructor que recibe como parametro una persona
	 * @param p
	 */
	public OyenteMenu(Persona p){
		this.p = p;
	}
	
	/**
	 * Constructor que recibe una ventana de administrador
	 * @param V1
	 */
	public OyenteMenu(GUIAdministrador V1) {
		this.V1 = V1;
	}

	/**
	 * Constructor que recibe muchos componenetes para cambiar la vision de la ventana
	 * @param p0
	 * @param  
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 * @param p5
	 * @param p6 
	 * @param l1
	 * @param l2
	 * @param l3
	 * @param l4
	 * @param l5
	 * @param l6 
	 * @param b1
	 * @param b2
	 * @param b3
	 * @param b4
	 * @param b5 
	 */
	public OyenteMenu(JFrame V1, Container p0, JPanel p1, JPanel p2, JPanel p3, JPanel p4, JPanel p5, JPanel p6, JLabel l1, JLabel l2, JLabel l3, JLabel l4, JLabel l5, JLabel l6, JButton b1, JButton b2, JButton b3, JButton b4, JButton b5) {
		this.V1 = V1;
		this.P0 = p0;
		this.P1 = p1;
		this.P2 = p2;
		this.P3 = p3;
		this.P4 = p4;
		this.P5 = p5;
		this.P6 = p6;
		this.L1 = l1;
		this.L2 = l2;
		this.L3 = l3;
		this.L4 = l4;
		this.L5 = l5;
		this.L6 = l6;
		this.B1 = b1;
		this.B2 = b2;
		this.B3 = b3;
		this.B4 = b4;
		this.B5 = b5;
	}

	/**
	 * Recibe una ventana de usuario para poder cambair su visibilidad
	 * @param V2
	 */
	public OyenteMenu(GUIUsuario V2) {
		this.V1 = V2;
	}

	/**
	 * Recibe una ventana para poder cambair su visibilidad
	 * @param V1
	 */
	public OyenteMenu(JFrame V1) {
		this.V1 = V1;
	}
	
	public OyenteMenu(JPanel P3, JButton B1) {
		this.P3 = P3;
		this.B1 = B1;
	}
	
	/* 
	 * Metodo para reaccionar a las acciones en la barra de menu
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String actionCommand = e.getActionCommand();
		
		if ("Salir".equals(actionCommand)){
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir y volver a la ventana inicial?", "¡Saliendo!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			
			if(resp == 0){	
				V1.setVisible(false);
				try {
					new GUIAnonimo();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else if(resp == 1){
				
			}
		}else if("InfoA".equals(actionCommand)){
			String informacion = "Nombre: " + p.getNombre() + "\n" + "Cedula: " + p.getCedula();
			JOptionPane.showConfirmDialog(null, informacion, "Informacion", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
		}else if("Acerca".equals(actionCommand)){
			String informacion = "Nuestro nombre es Su Propiedad Raiz \n" + "Ubicados en: Cl. 80 #65223, Medellín, Antioquia, Colombia \n" + "Universidad Nacional de Colombia - Facultad de Minas";
			JOptionPane.showConfirmDialog(null, informacion, "Su Propiedad Raiz", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
		}else if("Ayuda".equals(actionCommand)){
			String informacion = "Desarrollado por: Grupo-01-09\n" + "Integrantes: \n" + "         Santiago Arbelaaez Cataño \n" + 
																						 "         Sebastian Chavarria Gomez \n" +
																						 "         Santiago Montoya Palacio \n";
			JOptionPane.showConfirmDialog(null, informacion, "Desarrolladores", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
		}else if("Opciones".equals(actionCommand)){
			P3.remove(L1);
			
			L1.setText("<HTML><FONT SIZE=5><p align='center'>Consultas Basicas</p></FONT></HTML>");
			
			B1.setActionCommand("Consulta1");
			B2.setActionCommand("Consulta2");
			B3.setActionCommand("Consulta3");
			B4.setActionCommand("Consulta4");
			B5.setActionCommand("Consulta5");
			
			B1.addActionListener(new OyenteBoton(V1,P0,P1,P2,P3,P4,P5,P6,B1,B2,B3,B4,B5,L1,L2,L3,L4,L5,L6));
			B2.addActionListener(new OyenteBoton(V1,P0,P1,P2,P3,P4,P5,P6,B1,B2,B3,B4,B5,L1,L2,L3,L4,L5,L6));
			B3.addActionListener(new OyenteBoton(V1,P0,P1,P2,P3,P4,P5,P6,B1,B2,B3,B4,B5,L1,L2,L3,L4,L5,L6));
			B4.addActionListener(new OyenteBoton());
			B5.addActionListener(new OyenteBoton());
			
			P0.setLayout(new GridLayout(7,1));
			P2.setLayout(new BorderLayout());
			P3.setLayout(new BorderLayout());
			P4.setLayout(new BorderLayout());
			P5.setLayout(new BorderLayout());
			P6.setLayout(new BorderLayout());
			
			P1.setBorder(new EmptyBorder(10,15,10,10));
			P2.setBorder(new EmptyBorder(10,15,10,10));
			P3.setBorder(new EmptyBorder(10,15,10,10));
			P4.setBorder(new EmptyBorder(10,15,10,10));
			P5.setBorder(new EmptyBorder(10,15,10,10));
			P6.setBorder(new EmptyBorder(10,15,10,10));
			
			L1.setBorder(new EmptyBorder(5,15,5,5));
			L2.setBorder(new EmptyBorder(5,15,5,5));
			L3.setBorder(new EmptyBorder(5,15,5,5));
			L4.setBorder(new EmptyBorder(5,15,5,5));
			L5.setBorder(new EmptyBorder(5,15,5,5));
			L6.setBorder(new EmptyBorder(5,15,5,5));
			
			P1.add(L1);
			
			P2.add(B1, BorderLayout.WEST);
			P2.add(L2, BorderLayout.CENTER);
			
			P3.add(B2, BorderLayout.WEST);
			P3.add(L3, BorderLayout.CENTER);
			
			P4.add(B3, BorderLayout.WEST);
			P4.add(L4, BorderLayout.CENTER);
			
			P5.add(B4, BorderLayout.WEST);
			P5.add(L5, BorderLayout.CENTER);
			
			P6.add(B5, BorderLayout.WEST);
			P6.add(L6, BorderLayout.CENTER);
			
			P0.validate();
		}else if("PyC".equals(actionCommand)){
		P3.setVisible(true);
		P3.setBorder(new EmptyBorder(10,10,10,10));}
		
		
	}
}
