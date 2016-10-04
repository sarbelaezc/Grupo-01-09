package suPropiedadRaiz.usuarios;

import java.util.ArrayList;
import java.util.Scanner;
import uiMain.menuConsola.*;

public class Cliente {
	long cedula, telefono, estrato;
	String nombre, motivo, direccion;
	ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	
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
	
	public void ingresarMotivo(String motivo) {
		this.motivo = motivo;	
	}
	
	public void ingresarDireccion(String direccion) {
		this.direccion = direccion;	
		
	}
	
	public void ingresarNombre(String nombre){
		this.nombre = nombre;
	}

	public void ingresarCedula (long cedula){
		this.cedula = cedula;
	}
	
	public void ingresarTelefono(long telefono){
		this.telefono = telefono;
	}
}