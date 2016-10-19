package uiMain.menuConsola;

import java.io.IOException;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta es al clase en la que se define la opcion del administrador de eliminar una opcion de un usuario seleccionado
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OpcionEliminarDeUsuario extends OpcionDeMenu {

	private static final long serialVersionUID = 9011229442548444687L;
	Persona persona;
	
	/* 
	 * Este metodo se encarga de ejecutar la accion de eliminar una opcion de un usuario determinado
	 * @see uiMain.menuConsola.OpcionDeMenu#ejecutar()
	 */
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
		for(int i = 1; i<=persona.menu.opciones.size(); i++){
			System.out.println(i+" "+persona.menu.opciones.get(i-1).toString());
		}
		@SuppressWarnings("resource")
		Scanner eo = new Scanner(System.in);
		
		System.out.print("Elija la opcion a eliminar: ");
		
		int selec = eo.nextInt();
		
		persona.menu.opciones.remove(selec-1);
		System.out.println("Se ha eliminado la opcion " + selec + " de " + persona.getNombre());
	}

	/* 
	 * Este metodo imprime el nombre que quiere ser visto en pantalla al imprimir un objeto perteneciente a esta clase
	 * @see uiMain.menuConsola.OpcionDeMenu#toString()
	 */
	@Override
	public String toString() {
		return "Eliminar una opcion de un usuario";
	}

}
