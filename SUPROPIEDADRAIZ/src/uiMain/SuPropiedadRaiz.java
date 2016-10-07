package uiMain;

import suPropiedadRaiz.gestorBD.gestorArchivo;
import uiMain.menuConsola.MenuDeConsola;

public class SuPropiedadRaiz {

	public static void main(String[] args) {
		gestorArchivo.crear();
		System.out.println("/-/-/-/-/-/-/-/-/-/-/Su Propiedad Raiz/-/-/-/-/-/-/-/-/-/-/");
		@SuppressWarnings("unused")
		MenuDeConsola menu = new MenuDeConsola();
	}
}
