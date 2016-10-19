package uiMain.menuConsola;

import java.io.IOException;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta clase representa el login de un usuario registrado
 * @author Santiago Arbel�ez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
public class OpcionUsuarioRegistrado extends OpcionDeMenu {
	
	private static final long serialVersionUID = -6317444120487933639L;

	@Override
	public void ejecutar() {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su cedula: ");
		long cedula = entrada.nextLong();
		
		try {
			Persona p = GestorArchivos.buscar(cedula);
			
			p.menu.lanzarMenu();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Usuario Registrado";
	}

}
