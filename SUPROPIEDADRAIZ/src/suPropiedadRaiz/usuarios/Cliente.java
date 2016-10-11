package suPropiedadRaiz.usuarios;

import java.io.Serializable;
import java.util.ArrayList;
import uiMain.menuConsola.*;

public class Cliente extends Persona implements Serializable {
	
	private static final long serialVersionUID = -8985406422251618852L;
	long cedula, telefono;
	private String nombre;
	String motivo, direccion, celular;
	public ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	
	public Cliente(long cedula, String nombre, String motivo){
		this.setCedula(cedula);
		this.setNombre(nombre);
		this.setMotivo(motivo);
	}
	
	public Cliente(long cedula, String nombre, String motivo, long telefono, String direccion){
		this.setCedula(cedula);
		this.setNombre(nombre);
		this.setMotivo(motivo);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
	}
	
	public Cliente(long cedula, String nombre, String motivo, long telefono, String direccion, String celular){
		this.setCedula(cedula);
		this.setNombre(nombre);
		this.setMotivo(motivo);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setCelular(celular);
	}
	
	public Cliente() {
		System.out.println("Se creo un cliente nulo, revisar este constructor");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCedula() {
		return cedula;
	}
	
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	

	public long getTelefono() {
		return telefono;
	}
	

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	
	public String getDireccion() {
		return direccion;
	}

	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
}