package uiMain.menuConsola;

import java.io.IOException;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

public class OpcionEliminarDeUsuario extends OpcionDeMenu {

	private static final long serialVersionUID = 9011229442548444687L;
	Persona persona;
	
	@Override
	public void ejecutar() {
		
		System.out.print("Digite la cedula del usuario: ");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		long cedula = entrada.nextLong();
		try {
			persona = GestorArchivos.buscar(cedula);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i = 1; i<=MenuDeConsola.opciones.size(); i++){
			System.out.println(i+" "+MenuDeConsola.opciones.get(i-1).toString());
		}
		@SuppressWarnings("resource")
		Scanner eo = new Scanner(System.in);
		
		System.out.print("Elija la opcion a eliminar: ");
		
		int selec = eo.nextInt();
		
		MenuDeConsola.opciones.remove(selec-1);
		System.out.println("Se ha eliminado la opcion " + selec + " de " + persona.getNombre());
	}

	@Override
	public String toString() {
		return "Eliminar una opcion de un usuario";
	}

}
