package suPropiedadRaiz.usuarios;

import uiMain.menuConsola.*;

public class Administrador extends Persona {
	
	private static final long serialVersionUID = 6885455392745744589L;
	String nombre;
	long cedula;
	
	public Administrador(String nombre, long cedula){
		this.nombre = nombre;
		this.cedula = cedula;
		menu = new MenuDeConsola();
		menu.anadirOpcion(new OpcionSalir());
		menu.anadirOpcion(new OpcionVerUsuario());
		menu.anadirOpcion(new OpcionesExistentes());
		menu.anadirOpcion(new OpcionNuevaUsuario());
		menu.anadirOpcion(new OpcionEliminarDeUsuario());
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
