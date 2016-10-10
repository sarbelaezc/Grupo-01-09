package uiMain;

import suPropiedadRaiz.gestorBD.GestorArchivos;

import uiMain.menuConsola.MenuDeConsola;

public class SuPropiedadRaiz {

	public static void main(String[] args) throws ClassNotFoundException {
		GestorArchivos.leer();
		System.out.println("/-/-/-/-/-/-/-/-/-/-/Su Propiedad Raiz/-/-/-/-/-/-/-/-/-/-/");
		@SuppressWarnings("unused")
		MenuDeConsola menu = new MenuDeConsola();
	}
}
