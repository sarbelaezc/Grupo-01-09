package suPropiedadRaiz.usuarios;

import java.io.Serializable;
import java.util.ArrayList;

import uiMain.menuConsola.OpcionDeMenu;

public abstract class Persona implements Serializable {

	private static final long serialVersionUID = 7543457343574046297L;
	long cedula;
	String nombre;
	public ArrayList<OpcionDeMenu> opciones;
	
	public abstract long getCedula();

	public abstract String getNombre();
}
