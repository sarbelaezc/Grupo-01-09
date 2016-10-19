package uiMain.menuConsola;

import java.io.IOException;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

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
