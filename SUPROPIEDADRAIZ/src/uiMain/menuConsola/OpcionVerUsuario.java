package uiMain.menuConsola;

import java.io.IOException;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta clase representa la opcion del administrador de ver las opciones como si fuera un usuario dado
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OpcionVerUsuario extends OpcionDeMenu {

	private static final long serialVersionUID = 2075469877557187418L;
	Persona persona;
	
	/**
	 * Este metodo ejecuta el menu de un usuario dado
	 * @see uiMain.menuConsola.OpcionDeMenu#ejecutar()
	 */
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
		persona.menu.lanzarMenu();
	}

	@Override
	public String toString() {
		return "Ver las opciones como un usuario";
	}

}
