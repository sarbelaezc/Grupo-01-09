package uiMain.menuConsola;

import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta clase representa al usuario anonimo o invitado, pregunta lso datos, lo crea y lo almacena para el gestor de archivos
 * @author Santiago Arbelaez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OpcionUsuarioInvitado extends OpcionDeMenu {

	private static final long serialVersionUID = -176536618825282299L;

	@Override
	public void ejecutar() {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Ingrese su cedula: ");
		long cedula = entrada.nextLong();
		
		System.out.print("Ingrese su motivo: ");
		String motivo = entrada.next();
		
		Persona p = new Cliente(cedula, nombre, motivo);
		
		GestorArchivos.personas.add(p);
	}

	@Override
	public String toString() {
		return "Cliente Invitado";
	}

}
