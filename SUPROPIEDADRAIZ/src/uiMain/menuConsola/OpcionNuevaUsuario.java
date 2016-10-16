package uiMain.menuConsola;

import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;

public class OpcionNuevaUsuario extends OpcionDeMenu {

	@Override
	public void ejecutar() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite la cedula del usuario: ");
		long cedula = entrada.nextLong();
		
		GestorArchivos.buscar(cedula);
		
		System.out.print("Ingrese la opcion que se agregará: ");
		
		MenuDeConsola.limpiarLista();
		
		MenuDeConsola.lanzarMenu();
	}

	@Override
	public String toString() {
		return "Adicionar una nueva opción a un usuario";
	}

}
