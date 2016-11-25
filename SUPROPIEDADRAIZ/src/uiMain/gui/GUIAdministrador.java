package uiMain.gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import suPropiedadRaiz.usuarios.Persona;
import uiMain.gui.oyentes.OyenteMenu;

/**
 * Esta clase representa la ventana de usuario administrador
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class GUIAdministrador extends JFrame {

	Persona p;
	JFrame V = this;
	Container P0 = this.getContentPane();
	JPanel P1 = new JPanel();
	JPanel P2 = new JPanel();
	JPanel P3 = new JPanel();
	JPanel P4 = new JPanel();
	JPanel P5 = new JPanel();
	JPanel P6 = new JPanel();
	
	JButton B1 = new JButton("Consulta 1");
	JButton B2 = new JButton("Consulta 2");
	JButton B3 = new JButton("Consulta 3");
	JButton B4 = new JButton("Consulta 4");
	JButton B5 = new JButton("Consulta 5");
	
	JLabel L1 = new JLabel("<HTML><FONT SIZE=15><p align='center'>Bienvenido Administrador</p></FONT></HTML>");
	JLabel L2 = new JLabel("Listar opciones de menu de un usuario");
	JLabel L3 = new JLabel("Listar opciones de menu existentes en el sistema");
	JLabel L4 = new JLabel("Adicionar una nueva opcion de menu");
	JLabel L5 = new JLabel("Eliminar una opcion de menu");
	JLabel L6 = new JLabel("Registrar nuevo funcionario jefe");
	
	/**
	 * Constructor que pasa como parametro una persona administrador
	 * @param p
	 */
	public GUIAdministrador(Persona p){
		
		super("Administrador");
		
		this.p = p;
		
		/*
		 * Implementacion de la barra de menu de la ventana del administrador
		 */
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu archivo = new JMenu("Archivo");
		JMenu ver = new JMenu("Ver");
		JMenu editar = new JMenu("Editar");
		JMenu suPropiedadRaiz = new JMenu("SuPropiedadRaiz");
		JMenu ayuda = new JMenu("Ayuda");
		
		JMenuItem info_usuario = new JMenuItem("Informacion usuario");
		JMenuItem salir = new JMenuItem("Salir");
		JMenuItem opciones = new JMenuItem("Opciones Administrador");
		JMenuItem noAplica = new JMenuItem("No aplica");
		JMenuItem info_empresa = new JMenuItem("Acerca de nosotros...");
		JMenuItem desarrolladores = new JMenuItem("Desarrolladores");
		
		info_usuario.setActionCommand("InfoA");
		info_usuario.addActionListener(new OyenteMenu(p));
		
		salir.setActionCommand("Salir");
		salir.addActionListener(new OyenteMenu(this));
		
		opciones.setActionCommand("Opciones");
		opciones.addActionListener(new OyenteMenu(V,P0,P1,P2,P3,P4,P5,P6,L1,L2,L3,L4,L5,L6,B1,B2,B3,B4,B5));
		
		info_empresa.setActionCommand("Acerca");
		info_empresa.addActionListener(new OyenteMenu());
		
		desarrolladores.setActionCommand("Ayuda");
		desarrolladores.addActionListener(new OyenteMenu());
		
		menuBar.add(archivo);
		menuBar.add(ver);
		menuBar.add(editar);
		menuBar.add(suPropiedadRaiz);
		menuBar.add(ayuda);
		
		archivo.add(info_usuario);
		archivo.add(salir);
		
		ver.add(opciones);
		
		editar.add(noAplica);
		
		suPropiedadRaiz.add(info_empresa);
		
		ayuda.add(desarrolladores);
		
		/*
		 * Aca comienza la implementacion de la ventana de adminsitrador
		 */
		P0.setLayout(new GridLayout(6,1));
		
		P0.add(P1);
		P0.add(P2);
		P0.add(P3);
		P0.add(P4);
		P0.add(P5);
		P0.add(P6);
		
		P3.add(L1);
		
		this.setSize(600,350);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
