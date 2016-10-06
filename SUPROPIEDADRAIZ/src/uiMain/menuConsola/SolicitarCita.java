package uiMain.menuConsola;

import java.util.Scanner;

import suPropiedadRaiz.usuarios.ClienteAnonimo;

public class SolicitarCita extends OpcionDeMenu {
	public void ejecutar(){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese su Nombre: ");
	     String nombre = entrada.nextLine();
	     System.out.println("Ingrese N° de Cedula: ");
	     int cedula = entrada.nextInt();
		ClienteAnonimo nuevo = new ClienteAnonimo();
	     
	    nuevo.setNombre(nombre);
		nuevo.setCedula(cedula);
	}
	public String toString(){
		return "Solicitar cita";
	}

}
