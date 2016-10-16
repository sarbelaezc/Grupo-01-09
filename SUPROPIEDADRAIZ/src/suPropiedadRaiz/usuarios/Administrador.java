package suPropiedadRaiz.usuarios;

import java.util.ArrayList;
import uiMain.menuConsola.*;

public class Administrador extends Persona {
	
	private static final long serialVersionUID = 6885455392745744589L;
	String nombre;
	long cedula;
	public ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	
	public Administrador(String nombre, long cedula){
		this.nombre = nombre;
		this.cedula = cedula;
		opciones.add(new OpcionVerUsuario());
		opciones.add(new OpcionNuevaUsuario());
		opciones.add(new OpcionEliminarDeUsuario());
		opciones.add(new OpcionSalir());
	}

	@Override
	public long getCedula() {
		return this.cedula;
	}
	
	public void setCedula(long cedula){
		this.cedula = cedula;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}
