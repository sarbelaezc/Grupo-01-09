package uiMain.menuConsola;

import java.util.Scanner;

public class OpcionEliminarDeUsuario extends OpcionDeMenu {

	@Override
	public void ejecutar() {
		
		System.out.print("Digite la cedula del usuario: ");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		long cedula = entrada.nextLong();
		
	}

	@Override
	public String toString() {
		return "Eliminar una opci�n de un usuario";
	}

}
