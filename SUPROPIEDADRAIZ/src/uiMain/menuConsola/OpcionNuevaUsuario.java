package uiMain.menuConsola;

import java.io.IOException;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta clase representa la opcion del administrador de agregarle una opcion existente a un usuario
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OpcionNuevaUsuario extends OpcionDeMenu {

	private static final long serialVersionUID = -5057806560207948430L;
	Persona persona;
	OpcionesExistentes ope;
	
	@Override
	public void ejecutar() {
		
		ope = new OpcionesExistentes();
		
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
		
		for(int i = 1; i<=ope.menu.opciones.size(); i++){
			System.out.println(i + " " + ope.menu.opciones.get(i-1).toString());
		}
		
		@SuppressWarnings("resource")
		Scanner eo = new Scanner(System.in);
		
		System.out.print("Ingrese la opcion que se agregará: ");
		
		int selec = eo.nextInt();
		persona.menu.anadirOpcion(ope.menu.opciones.get(selec-1));
	}

	@Override
	public String toString() {
		return "Adicionar una nueva opción a un usuario";
	}

}
