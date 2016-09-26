package suPropiedadRaiz.usuarios;

import java.util.Scanner;

public class ClienteAnonimo extends Cliente {
	
	String motivo;
	
	public ClienteAnonimo(){
		this.cedula = ingresarCedula();
		this.nombre = ingresarNombre();
		this.motivo = ingresarMotivo();
		System.out.println("Usted ha sido registrado con exito.");
		System.out.print("Su cita ha sido asignada para: ");
	}
	
	private String ingresarMotivo() {
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
