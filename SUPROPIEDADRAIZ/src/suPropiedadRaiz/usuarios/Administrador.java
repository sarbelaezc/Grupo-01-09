package suPropiedadRaiz.usuarios;

import java.util.ArrayList;

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
		this.opciones.add("Ver Usuario");
		this.opciones.add("Listar opciones de menu existentes en el sistema");
		this.opciones.add("Agregar Opcion al Usuario");
		this.opciones.add("Eliminar Opcion de Usuario");
		this.opciones.add("Registrar Funcionario Jefe");
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

	/* 
	 * Devuelve las opciones del adminsitrador
	 * (non-Javadoc)
	 * @see suPropiedadRaiz.usuarios.Persona#getOpciones()
	 */
	@Override
	public ArrayList<String> getOpciones() {
		return opciones;
	}
}
