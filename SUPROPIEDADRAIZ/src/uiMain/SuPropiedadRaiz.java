package uiMain;

import java.io.FileNotFoundException;
import java.io.IOException;
import suPropiedadRaiz.gestorBD.GestorArchivos;
import uiMain.menuConsola.MenuDeConsola;

/**
 * Esta clase es la clase principal del programa
 * @author Santiago Arbel�ez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
public class SuPropiedadRaiz {

	/**
	 * Metodo main con el cual se comienza a correr el programa
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("/-/-/-/-/-/-/-/-/-/-/Su Propiedad Raiz/-/-/-/-/-/-/-/-/-/-/");
		GestorArchivos.crearListaPersonas();
		GestorArchivos.leer();
		MenuDeConsola.logIn().menu.lanzarMenu();
	}
}
