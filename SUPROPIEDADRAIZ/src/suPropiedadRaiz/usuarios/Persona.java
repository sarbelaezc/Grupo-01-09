package suPropiedadRaiz.usuarios;

import java.io.Serializable;
import uiMain.menuConsola.MenuDeConsola;

public abstract class Persona implements Serializable {

	private static final long serialVersionUID = 7543457343574046297L;
	long cedula;
	String nombre;
	public MenuDeConsola menu;
	
	public abstract long getCedula();

	public abstract String getNombre();
}
