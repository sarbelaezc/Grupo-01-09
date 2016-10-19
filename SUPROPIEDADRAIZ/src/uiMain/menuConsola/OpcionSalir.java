package uiMain.menuConsola;

import java.io.FileNotFoundException;
import java.io.IOException;

import suPropiedadRaiz.gestorBD.GestorArchivos;

/**
 * Esta clase representa la opcion salir del sistema con la cual termina su ejecucion
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OpcionSalir extends OpcionDeMenu {
	
	private static final long serialVersionUID = 360779906994216970L;

	public void ejecutar() {
		try {
			GestorArchivos.crearListaPersonas();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("Gracias por ingresar a Su Propiedad Raiz, vuelva pronto.");
		System.exit(0);
	}
	
	public String toString(){
		return "Salir";
	}
	
}
