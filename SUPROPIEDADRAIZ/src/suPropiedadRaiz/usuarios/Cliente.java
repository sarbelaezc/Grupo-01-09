package suPropiedadRaiz.usuarios;

import java.io.Serializable;
import java.util.ArrayList;
import uiMain.menuConsola.*;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = -8985406422251618852L;
	long cedula, telefono, estrato;
	private String nombre;
	String motivo;
	String direccion;
	public ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	
	public Cliente(long cedula, String nombre, String motivo, long telefono, String direccion){
		ingresarCedula(cedula);
		ingresarNombre(nombre);
		ingresarMotivo(motivo);
		ingresarTelefono(telefono);
		ingresarDireccion(direccion);
	}
	
	public Cliente(long cedula, String nombre, String motivo){
		ingresarCedula(cedula);
		ingresarNombre(nombre);
		ingresarMotivo(motivo);
	}
	
	public Cliente() {
		System.out.println("Se creo un cliente nulo, revisar este constructor");
	}

	public void ingresarMotivo(String motivo) {
		this.motivo = motivo;	
	}
	
	public void ingresarDireccion(String direccion) {
		this.direccion = direccion;	
		
	}
	
	public void ingresarNombre(String nombre){
		this.setNombre(nombre);
	}

	public void ingresarCedula (long cedula){
		this.cedula = cedula;
	}
	
	public void ingresarTelefono(long telefono){
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}