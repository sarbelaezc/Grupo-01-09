package uiMain.menuConsola;

import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Funcionario;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta clase represental a capacidad de un funcionario de registrar un cliente nuevo
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OpcionRegistrarCliente extends OpcionDeMenu {

	private static final long serialVersionUID = 1L;
	
	Funcionario f;

	public OpcionRegistrarCliente(Funcionario funcionario) {
		// TODO Auto-generated constructor stub
	}

	public OpcionRegistrarCliente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Ingrese la cedula: ");
		long cedula = entrada.nextLong();
		
		System.out.print("Ingrese el motivo: ");
		String motivo = entrada.next();
		
		System.out.print("Ingrese el telefono: ");
		long telefono = entrada.nextLong();
		
		System.out.print("Infrese la direccion: ");
		String direccion = entrada.nextLine();
		
		System.out.print("Ingrese el celular: ");
		String celular = entrada.next();
		
		f.registrarCliente(cedula, nombre, motivo, telefono, direccion, celular);
		
		Persona p = new Cliente(cedula, nombre, motivo, telefono, direccion, celular);
		
		GestorArchivos.personas.add(p);
	}

	@Override
	public String toString() {
		return "Registrar cliente";
	}

}
