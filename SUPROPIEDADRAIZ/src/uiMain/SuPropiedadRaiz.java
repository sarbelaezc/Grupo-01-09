package uiMain;

import java.io.FileNotFoundException;
import java.io.IOException;
import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta clase es la clase principal del programa
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
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
		
		GestorArchivos.crear();	
		GestorArchivos.leer();	
		@SuppressWarnings("unused")
		Persona p = new Cliente();
		GestorArchivos.crearListaPersonas();
	}
}
