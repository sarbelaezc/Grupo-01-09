package suPropiedadRaiz.usuarios;

import java.io.Serializable;
import uiMain.menuConsola.MenuDeConsola;

/**
 * Clase abstracta padre de todos los usuarios
 * @author Santiago Arbel�ez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
public abstract class Persona implements Serializable {

	private static final long serialVersionUID = 7543457343574046297L;
	long cedula;
	String nombre;
	public MenuDeConsola menu;
	
	public abstract long getCedula();

	public abstract String getNombre();
}
