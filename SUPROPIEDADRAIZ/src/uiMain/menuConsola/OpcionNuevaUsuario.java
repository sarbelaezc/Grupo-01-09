package uiMain.menuConsola;

import java.io.IOException;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta clase representa la opcion del administrador de agregarle una opcion existente a un usuario
 * @author Santiago Arbel�ez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
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
		
		System.out.print("Ingrese la opcion que se agregar�: ");
		
		persona.menu.limpiarLista();
		
		persona.menu.lanzarMenu();
	}

	@Override
	public String toString() {
		return "Adicionar una nueva opci�n a un usuario";
	}

}
