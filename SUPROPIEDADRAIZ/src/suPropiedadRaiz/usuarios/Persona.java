package suPropiedadRaiz.usuarios;

import java.io.Serializable;
import java.util.ArrayList;

import uiMain.menuConsola.MenuDeConsola;

/**
 * Clase abstracta padre de todos los usuarios
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public abstract class Persona implements Serializable {

	long cedula;
	String nombre, clave;
	public MenuDeConsola menu;
	ArrayList<String> opciones = new ArrayList<String>();
	
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public abstract long getCedula();

	public abstract String getNombre();
	
	public abstract ArrayList<String> getOpciones();
}
