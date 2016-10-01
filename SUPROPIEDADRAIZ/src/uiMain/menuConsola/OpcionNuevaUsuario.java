package uiMain.menuConsola;

import java.util.Scanner;

public class OpcionNuevaUsuario extends OpcionDeMenu {

	@Override
	public void ejecutar() {
		
		System.out.print("Digite la cedula del usuario: ");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		long cedula = entrada.nextLong();
		
		System.out.print("Ingrese la opcion que se agregará: ");
		
		MenuDeConsola.limpiarLista();
		/**
		Codigo para leer usuario
		*/
		MenuDeConsola.lanzarMenu();
	}

	@Override
	public String toString() {
		return "Adicionar una nueva opción a un usuario";
	}

}
