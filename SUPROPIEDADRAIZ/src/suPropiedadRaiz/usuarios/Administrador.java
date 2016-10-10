package suPropiedadRaiz.usuarios;

import java.util.ArrayList;
import uiMain.menuConsola.*;

public class Administrador extends Persona {
	
	String nombre;
	ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	
	public Administrador(){
		this.nombre = "Administrador";
	}
}
