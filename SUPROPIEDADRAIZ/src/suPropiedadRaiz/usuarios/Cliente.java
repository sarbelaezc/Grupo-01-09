package suPropiedadRaiz.usuarios;

import java.util.Scanner;

public class Cliente {
	long cedula;
	String nombre, motivo;
	
	Cliente(){
		this.cedula = ingresarCedula();
		this.nombre = ingresarNombre();
		this.motivo = ingresarMotivo();
	}
	
	public Cliente(long cedula){
		this.cedula = cedula;
	}
	
	public String ingresarMotivo() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el motivo de la cita: ");
		motivo = entrada.nextLine();	
		return motivo;
	}

	public long ingresarCedula (){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese su número de cedula: ");
		cedula = entrada.nextLong();
		return cedula;
	}
	
	public String ingresarNombre(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		nombre = entrada.nextLine();
		return nombre;
	}
}
