package suPropiedadRaiz.usuarios;

import uiMain.menuConsola.*;

/**
 * Esta clase representa el administrador del programa con todo lo que impica
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class Administrador extends Persona {
		
	/**
	 * Constructor para el administrador recibiendo los siguientes parametros y generandole un menu 
	 * @param nombre
	 * @param cedula
	 */
	public Administrador(String nombre, long cedula, String clave){
		this.nombre = nombre;
		this.cedula = cedula;
		this.clave = clave;
		menu = new MenuDeConsola();
		menu.anadirOpcion(new OpcionSalir());
		menu.anadirOpcion(new OpcionVerUsuario());
		menu.anadirOpcion(new OpcionesExistentes());
		menu.anadirOpcion(new OpcionNuevaUsuario());
		menu.anadirOpcion(new OpcionEliminarDeUsuario());
		menu.anadirOpcion(new OpcionNuevoFuncionarioJ());
	}

	/* 
	 * Devuelve el numero de cedula del administrador
	 * (non-Javadoc)
	 * @see suPropiedadRaiz.usuarios.Persona#getCedula()
	 */
	@Override
	public long getCedula() {
		return this.cedula;
	}
	
	/**
	 * Cambia la cedula del administrador por el que se ingreso por parametro
	 * @param cedula
	 */
	public void setCedula(long cedula){
		this.cedula = cedula;
	}

	/* 
	 * Devuelve el nombre del administrador
	 * (non-Javadoc)
	 * @see suPropiedadRaiz.usuarios.Persona#getNombre()
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Cambia el nombre del administrador por el que ingresa por parametro
	 * @param nombre
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}
