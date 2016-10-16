package uiMain.menuConsola;

import java.io.IOException;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

public class OpcionNuevaUsuario extends OpcionDeMenu {

	private static final long serialVersionUID = -5057806560207948430L;
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
		
		System.out.print("Ingrese la opcion que se agregará: ");
		
		MenuDeConsola.limpiarLista();
		
		MenuDeConsola.lanzarMenu(persona.opciones);
	}

	@Override
	public String toString() {
		return "Adicionar una nueva opción a un usuario";
	}

}
