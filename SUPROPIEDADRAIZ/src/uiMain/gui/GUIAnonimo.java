package uiMain.gui;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import uiMain.gui.oyentes.OyenteBoton;
import uiMain.gui.oyentes.OyenteRaton;

/**
 * Esta clase representa la ventana inicial con la que inicia el programa
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class GUIAnonimo extends JFrame {

	public GUIAnonimo(){
		
		super("Su Propiedad Raiz");
		
		Container P0 = this.getContentPane();
		JPanel P1 = new JPanel();
		JPanel P2 = new JPanel();
		JPanel P3 = new JPanel();
		JPanel P4 = new JPanel();
		JPanel P5 = new JPanel();
		JPanel P6 = new JPanel();
		JPanel P6_1 = new JPanel();
		JPanel P6_2 = new JPanel();
		JPanel P6_3 = new JPanel();
		
		JLabel L1 = new JLabel("<HTML><FONT SIZE=5><p align='center'>Bienvenido a<br/>SuPropiedadRaiz</p></FONT></HTML>");
		JLabel L2 = new JLabel("Ingrese su nombre de usuario y clave");
		JLabel L3 = new JLabel("Nombre de usuario");
		JLabel L4 = new JLabel("Clave");
		
		JTextArea T1 = new JTextArea(3,23);
		JTextField T2 = new JTextField(7);
		JTextField T3 = new JTextField(7);
		
		JScrollPane SP = new JScrollPane(T1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton B1 = new JButton(new ImageIcon("./imagenes/Img1.PNG"));
		JButton B2 = new JButton("<html><p align='center'>Ingresar al sistema</p></html>");
		JButton B3 = new JButton("Pedir una cita");
		JButton B4 = new JButton("Salir");
		
		L2.setHorizontalAlignment(JLabel.CENTER);
		L3.setHorizontalAlignment(JLabel.CENTER);
		L4.setHorizontalAlignment(JLabel.CENTER);
		
		L1.addMouseListener(new OyenteRaton());
		
		T1.setEditable(false);
		T1.setText("Desarrollado por:\n	Santiago Arbelaez\n	Sebastian Chavarria\n	Santiago Montoya \nPara la asignatura: \n       Programacion Orientada a Objetos \nProfesor: Jaime Alberto Guzman Luna \n \nEste sistema se encarga de manejar el\nsistema de citas y de gestionar a los\nempleados, jefes, clientes e inmuebles\nque estan registrados por la empresa\nSu Propiedad Raiz");
		
		B4.setActionCommand("Salir");
		B4.addActionListener(new OyenteBoton());
		B4.setToolTipText("Al dar clic a este botón se iniciara la confirmacion para la salida del programa");
		
		P0.setLayout(new GridLayout(1,2));
		P1.setLayout(new BorderLayout());
		P2.setLayout(new BorderLayout());
		P4.setLayout(new BorderLayout());
		P6.setLayout(new GridLayout(5,1));
		P6_1.setLayout(new GridLayout(1,2));
		P6_2.setLayout(new GridLayout(1,2));
		P6_3.setLayout(new GridLayout(1,2));
		
		P1.setBorder(new EmptyBorder(5,2,5,10));
		P2.setBorder(new EmptyBorder(5,10,5,2));
		P3.setBorder(new EmptyBorder(1,1,1,1));
		P6_2.setBorder(new EmptyBorder(10,5,10,5));
		P6_3.setBorder(new EmptyBorder(10,5,10,5));
		
		P0.add(P2);
		P0.add(P1);
		P1.add(P3, BorderLayout.NORTH);
		P1.add(P4, BorderLayout.CENTER);
		P2.add(P5, BorderLayout.NORTH);
		P2.add(P6, BorderLayout.CENTER);
		P3.add(L1);
		P4.add(B1, BorderLayout.CENTER);
		P5.add(SP);
		P6.add(P6_1);
		P6.add(L2);
		P6.add(P6_2);
		P6.add(P6_3);
		P6.add(B4);
		P6_1.add(B2);
		P6_1.add(B3);
		P6_2.add(L3);
		P6_2.add(T2);
		P6_3.add(L4);
		P6_3.add(T3);
		
		this.setSize(600,350);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
