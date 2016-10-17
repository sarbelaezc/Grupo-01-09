package uiMain;

import java.io.IOException;
import suPropiedadRaiz.gestorBD.GestorArchivos;
import uiMain.menuConsola.MenuDeConsola;

public class SuPropiedadRaiz {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		System.out.println("/-/-/-/-/-/-/-/-/-/-/Su Propiedad Raiz/-/-/-/-/-/-/-/-/-/-/");
		GestorArchivos.crearListaPersonas();
		GestorArchivos.leer();
		MenuDeConsola.logIn().menu.lanzarMenu();
	}
}
