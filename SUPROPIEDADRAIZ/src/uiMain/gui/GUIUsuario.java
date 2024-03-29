package uiMain.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import suPropiedadRaiz.usuarios.*;
import suPropiedadRaiz.usuarios.Persona;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import uiMain.gui.oyentes.OyenteBoton;
import uiMain.gui.oyentes.OyenteMenu;

@SuppressWarnings("serial")
public class GUIUsuario extends JFrame{
	Persona p ;
	String user;
		String OpcionesClt[]={"Inmuebles consignados para venta","Inmuebles consignados para arrendar","Inmuebles que posee en arrendamiento"};
	String OpcionesF[]={"Registrar un nuevo cliente","Asignar un rol a un cliente","Registrar Inmueble","Asignar rol al inmueble","Registrar una compra-venta",
			"Registrar un arrendamiento","Buscar casas en arriendo","Buscar apartamentos en arriendo","",""};
	String OpcionesFJ[] = {"Registrar nuevo funcionario", "Consultar sueldo", "Listar todos los clientes", "Listas los funcionarios que tiene","Listar sueldos de funcionario"};
	JList<String> LT1 = new JList<String> ();
	JScrollPane SP1 = new JScrollPane(LT1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	@SuppressWarnings("rawtypes")
	JList LT2 = new JList();
	
	public GUIUsuario(Persona p){
		super("");
	
		if(p instanceof FuncionarioJefe){
			setTitle("Funcionario Jefe");
			LT1.setListData(OpcionesFJ);
		}else if(p instanceof Funcionario){
			setTitle("Funcionario");
			LT1.setListData(OpcionesF);
		}else{
			setTitle("Cliente");
			LT1.setListData(OpcionesClt);
		}
		this.p = p;
		
		Container P0 = this.getContentPane();
		JPanel P1 = new JPanel();
		JPanel P2 = new JPanel();
		JPanel P3 = new JPanel();
		JPanel P4 = new JPanel();
		
		JLabel L1 = new JLabel("PROCESOS Y CONSULTAS");
		JLabel L2 = new JLabel("Descripcion del detalle del proceso y/o producto");
		JLabel L3 = new JLabel("La opcion elegida es");
	
		JMenuBar M = new JMenuBar();
		JMenu Archivo = new JMenu("Archivo");
		JMenu PyC = new JMenu("Procesos y Consulta");
		JMenu Ayuda = new JMenu("Ayuda");
		JMenuItem info_usuario = new JMenuItem("Informacion de usuario");	
		JMenuItem Salir = new JMenuItem("Salir");
		//JMenuItem M6 = new JMenuItem(); Reservado para Procesos y consulta
		JMenuItem Acerca_de = new JMenuItem("Acerca de");
		JMenuItem PyC1 = new JMenuItem("Procesos y consulta");
			
		JButton B1 = new JButton("Aceptar");
		
		B1.setActionCommand("Registrar nuevo funcionario");
		B1.addActionListener(new OyenteBoton());
		
		LT1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		LT1.addListSelectionListener(new OyenteLista());
		
		L1.setHorizontalAlignment(JLabel.CENTER);
		L2.setHorizontalAlignment(JLabel.CENTER);
		L3.setHorizontalAlignment(JLabel.CENTER);
		
		P0.setLayout(new BorderLayout());
		P1.setLayout(new GridLayout(2,1));
		P2.setLayout(new BorderLayout());
		P3.setLayout(new GridLayout(1,2));
		P4.setLayout(new GridLayout(3,1));
		
		P0.add(M, BorderLayout.NORTH);
		P0.add(P1, BorderLayout.CENTER);
		
		P1.add(P2);
		P1.add(P3);
		
		P2.add(L1, BorderLayout.NORTH);
		P2.add(L2, BorderLayout.CENTER);
		
		P3.add(SP1);
		P3.add(P4);
		P4.add(L3);
		P4.add(LT2);
		P4.add(B1);
		
		M.add(Archivo);
		M.add(PyC);
		M.add(Ayuda);
		Archivo.add(info_usuario);
		Archivo.add(Salir);
		//M2.add(M6); Reservado para procesos y consulta
		Ayuda.add(Acerca_de);
		PyC.add(PyC1);
		
		P3.setVisible(false);
		PyC1.setActionCommand("PyC");
		PyC1.addActionListener(new OyenteMenu(P3, B1));
			
		info_usuario.setActionCommand("InfoA");
		info_usuario.addActionListener(new OyenteMenu(p));
		
		Acerca_de.setActionCommand("Ayuda");
		Acerca_de.addActionListener(new OyenteMenu());
		
		Salir.setActionCommand("Salir");
		Salir.addActionListener(new OyenteMenu(this));
		
		this.setSize(600,350);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class OyenteLista implements ListSelectionListener{

		@SuppressWarnings({ "deprecation", "unchecked" })
		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			LT2.setListData(LT1.getSelectedValues());
		}	
	}
}
