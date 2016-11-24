package uiMain.gui.oyentes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import suPropiedadRaiz.excepciones.ExcepcionUsuario1;
import suPropiedadRaiz.excepciones.ExcepcionUsuario2;
import suPropiedadRaiz.excepciones.ExcepcionUsuario3;
import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.inmuebles.Inmuebles;
import suPropiedadRaiz.usuarios.Administrador;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Persona;
import uiMain.gui.FieldPanel;
import uiMain.gui.GUIAdministrador;
import uiMain.gui.GUIAnonimo;
import uiMain.gui.GUIUsuario;

/**
 * Esta clase representa todos los oyentes de los botones del programa
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OyenteBoton implements ActionListener {
	
	JFrame V1;
	Container P0;
	JPanel P1,P2,P3,P4,P5,P6;
	JButton B1, B2, B3, B4, B5;
	JLabel L1, L2, L3, L4, L5, L6;
	JTextField T1, T2;
	int count = 1;
	
	/**
	 * Constructor default
	 */
	public OyenteBoton() {

	}	
	/**
	 * Constructor que permite cambiar interactuar con los parametros que se le estan pasando
	 * @param B
	 * @param L1
	 * @param L2
	 * @param L3
	 * @param T1
	 * @param T2
	 * @param V1
	 */
	public OyenteBoton(JButton B, JLabel L1, JLabel L2, JLabel L3, JTextField T1, JTextField T2, GUIAnonimo V1) {
		this.V1 = V1;
		this.B1 = B;
		this.L1 = L1;
		this.L2 = L2;
		this.L3 = L3;
		this.T1 = T1;
		this.T2 = T2;
	}
	
	/**
	 * Constructor todero
	 * @param V1
	 * @param p0
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 * @param p5
	 * @param p6
	 * @param b1
	 * @param b2
	 * @param b3
	 * @param b4
	 * @param b5
	 * @param l1
	 * @param l2
	 * @param l3
	 * @param l4
	 * @param l5
	 * @param l6
	 */
	public OyenteBoton(JFrame V1, Container p0, JPanel p1, JPanel p2, JPanel p3, JPanel p4, JPanel p5, JPanel p6, JButton b1, JButton b2, JButton b3, JButton b4, JButton b5, JLabel l1, JLabel l2, JLabel l3,JLabel l4, JLabel l5, JLabel l6) {
		this.V1 = V1;
		this.P0 = p0;
		this.P1 = p1;
		this.P2 = p2;
		this.P3 = p3;
		this.P4 = p4;
		this.P5 = p5;
		this.P6 = p6;
		this.B1 = b1;
		this.B2 = b2;
		this.B3 = b3;
		this.B4 = b4;
		this.B5 = b5;
		this.L1 = l1;
		this.L2 = l2;
		this.L3 = l3;
		this.L4 = l4;
		this.L5 = l5;
		this.L6 = l6;
	}
	
	/**
	 * Constructor para poder pasar por referencia ventanas
	 * @param V1
	 */
	public OyenteBoton(JFrame V1) {
		this.V1 = V1;
	}
	/* 
	 * Metodo por medio del cual se ejecutan los clics a los botones
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		
		if(e.getSource() instanceof JButton){
			
			if("Salir".equals(actionCommand)){
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "¡Saliendo!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
				
				if(resp == 0){	
					try {
						GestorArchivos.crearListaPersonas();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					System.exit(0);
					
				}else if(resp == 1){
					
				}
			}else if("Ingresar".equals(actionCommand)){
				B1.setText("<html><p align='center'>Complete la informacion y click otra vez</p></html>");
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
						JOptionPane.showConfirmDialog(null, e1.getMessage(), "¡ERROR!", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
					}
				}else{										
					try {
						long user = Long.parseLong(usuario);
							
						Persona p = GestorArchivos.buscar(user);

						if(p == null){
							throw new ExcepcionUsuario2();
						}else if(p instanceof Administrador){
							new GUIAdministrador(p);
							V1.setVisible(false);
							
						}else if(p instanceof Cliente){
							new GUIUsuario(p);
							V1.setVisible(false);
							
						}
					} catch (ClassNotFoundException | IOException | ExcepcionUsuario2 e1) {
						JOptionPane.showConfirmDialog(null, e1.getMessage(), "¡ERROR!", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
					}catch (NumberFormatException e1){
						JOptionPane.showConfirmDialog(null, "El nombre de usuario debe ser su cedula", "¡ERROR!", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
					}
				}
			}else if("Inmuebles".equals(actionCommand)){
				ArrayList<Inmuebles> inmueblesRegistrados;
				ArrayList<ImageIcon> imgInmuebles;
				
				try{
					inmueblesRegistrados = GestorArchivos.ListaInmuebles();					
					imgInmuebles = new ArrayList<ImageIcon>();
					imgInmuebles.add(new ImageIcon("./imagenes/Img1.PNG"));
					imgInmuebles.add(new ImageIcon("./imagenes/Local.JPG"));
					
					for(int i = 1; i <= inmueblesRegistrados.size(); i++){
						Inmuebles inmuebles = inmueblesRegistrados.get(i);
						imgInmuebles.add(inmuebles.getImagen());
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
			}else if("Pedir".equals(actionCommand)){
				String[] datos = new String[] {"Nombre","Cedula", "Motivo"};
				FieldPanel fp = new FieldPanel("Datos",datos,null,null,null);
				int resp = fp.mostrar(fp);
				if(resp == 0){
					String nombre = fp.getValue("Nombre");
					Long cedula = Long.parseLong(fp.getValue("Cedula"));
					String motivo = fp.getValue("Motivo");
					GestorArchivos.personas.add(new Cliente(cedula,nombre,motivo));
				}else if(resp == 1){
					JTextField[] campos = fp.getCampos();
					for(int i=0; i<campos.length; i++){
						campos[i].setText("");
					}
					fp.mostrar(fp);
				}
			}else if("Consulta1".equals(actionCommand)){
				String[] datos = new String[]{"Cedula del usuario: "};
				FieldPanel fp = new FieldPanel(null,datos,null,null,null);
				int resp = fp.mostrar(fp);
				if(resp == 0){
					Long cedula = Long.parseLong(fp.getValue("Cedula del usuario: "));
					try {
						Persona p = GestorArchivos.buscar(cedula);
						
						if(p == null){
							throw new ExcepcionUsuario3();
						}else{
							JTextArea opcionesListadas = new JTextArea();
							JButton B6 = new JButton("Atras");
							ArrayList<String> opciones = p.getOpciones();
							
							opcionesListadas.setEditable(false);
							
							B6.setActionCommand("Salir");
							B6.addActionListener(new OyenteMenu(V1));
							
							P0.remove(P1);
							P0.remove(P2);
							P0.remove(P3);
							P0.remove(P4);
							P0.remove(P5);
							P0.remove(P6);
							P1.remove(L1);
							P2.remove(B1);
							P2.remove(L2);
							P3.remove(B2);
							P3.remove(L3);
							P4.remove(B3);
							P4.remove(L4);					
							P5.remove(B4);
							P5.remove(L5);
							P6.remove(B5);
							P6.remove(L6);
							
							for(int i=0; i<opciones.size();i++){
								opcionesListadas.setText(opcionesListadas.getText()  + opciones.get(i) + "\n");
							}
							
							P0.setLayout(new BorderLayout());
							
							P0.add(P3, BorderLayout.CENTER);
							P0.add(P2, BorderLayout.SOUTH);
							P3.add(opcionesListadas);
							P2.add(B6);

							P0.validate();
						}
					} catch (ClassNotFoundException | IOException | ExcepcionUsuario3 e1) {
						JOptionPane.showConfirmDialog(null, e1.getMessage(), "¡ERROR!", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
					}
				}else if(resp == 1){
					
				}
			}else if("Consulta2".equals(actionCommand)){
				String AllOpc[] = {"Eliminar Opcion de Usuario","Agregar Opcion al Usuario","Registrar Usuario","Ver Usuario","Registrar Funcionario Jefe","Registrar Cliente","Asignar Rol a un Cliente",
						"Registrar un Inmueble","Asignar Rol a un inmueble" ,"Registrar un contrato de Compraventa","Registrar un  Contrato de Arrendamiento","Buscar Casas en Arriendo","Buscar Apartamentos en Arriendo"
						,"Buscar Casa especifico","Buscar Apartamento Especifico","Ver Comision por Arriendos","Ver Comision por Ventas","Ver Salario Neto","Ver Lista de Clientes","Ver Funcionario a Cargo",
						" Ver Cliente de un Funcionario", "Buscar Inmuebles Arrendados"};
				JTextArea opcionesListadas = new JTextArea();
				JScrollPane sp = new JScrollPane(opcionesListadas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				JButton B6 = new JButton("Atras");
				
				opcionesListadas.setEditable(false);
				
				B6.setActionCommand("Salir");
				B6.addActionListener(new OyenteMenu(V1));
				
				P0.remove(P1);
				P0.remove(P2);
				P0.remove(P3);
				P0.remove(P4);
				P0.remove(P5);
				P0.remove(P6);
				P1.remove(L1);
				P2.remove(B1);
				P2.remove(L2);
				P3.remove(B2);
				P3.remove(L3);
				P4.remove(B3);
				P4.remove(L4);					
				P5.remove(B4);
				P5.remove(L5);
				P6.remove(B5);
				P6.remove(L6);
				
				for(int i=0; i<AllOpc.length;i++){
					opcionesListadas.setText(opcionesListadas.getText()  + AllOpc[i] + "\n");
				}
				
				P0.setLayout(new BorderLayout());
				
				P0.add(P3, BorderLayout.CENTER);
				P0.add(P2, BorderLayout.SOUTH);
				P3.add(sp);
				P2.add(B6);

				P0.validate();
				
			}else if("Consulta3".equals(actionCommand)){
				String[] datos = new String[]{"Cedula del usuario a modificar: "};
				FieldPanel fp = new FieldPanel(null,datos,null,null,null);
				int resp = fp.mostrar(fp);
				
				if(resp == 0){
					Long cedula = Long.parseLong(fp.getValue("Cedula del usuario a modificar: "));
					try {
						Persona p = GestorArchivos.buscar(cedula);
						
						if(p == null){
							throw new ExcepcionUsuario3();
						}else{
							P0.remove(P1);
							P0.remove(P2);
							P0.remove(P3);
							P0.remove(P4);
							P0.remove(P5);
							P0.remove(P6);
							P1.remove(L1);
							P2.remove(B1);
							P2.remove(L2);
							P3.remove(B2);
							P3.remove(L3);
							P4.remove(B3);
							P4.remove(L4);					
							P5.remove(B4);
							P5.remove(L5);
							P6.remove(B5);
							P6.remove(L6);
							
							L1.setText("Modificar Menu Usuario " + p.getClass().getName());
							
							B1.setText("Atras");
							
							P0.setLayout(new BorderLayout());
							P2.setLayout(new GridLayout(1,2));
							
							//Realizar toda la distribucion de la ventana
							
							P0.add(P1, BorderLayout.NORTH);
							P0.add(P2, BorderLayout.CENTER);
							P0.add(P3, BorderLayout.SOUTH);
							P1.add(L1);
							P3.add(B1);							
							
							P0.validate();
						}
					} catch (ClassNotFoundException | IOException | ExcepcionUsuario3 e1) {
						JOptionPane.showConfirmDialog(null, e1.getMessage(), "¡ERROR!", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
					}
				}
			}else if("Consulta4".equals(actionCommand)){
				System.out.println("4");
			}else if("Consulta5".equals(actionCommand)){
				System.out.println("5");
			}
		}
	}
}
