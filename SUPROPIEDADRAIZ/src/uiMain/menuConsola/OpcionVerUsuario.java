package uiMain.menuConsola;

import java.io.IOException;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

public class OpcionVerUsuario extends OpcionDeMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2075469877557187418L;
	Persona persona;
	
	@Override
	public void ejecutar() {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite la cedula del usuario: ");
		long cedula = entrada.nextLong();
		
		try {
			persona = GestorArchivos.buscar(cedula);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MenuDeConsola.lanzarMenu(persona.opciones);
	}

	@Override
	public String toString() {
		return "Ver las opciones como un usuario";
	}

}
