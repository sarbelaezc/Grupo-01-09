package suPropiedadRaiz.inmuebles;

import java.io.Serializable;
import java.util.ArrayList;

import suPropiedadRaiz.usuarios.Cliente;

public class Casa extends Inmuebles implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2573902269621370522L;
	int codigo, estrato, AreaTotal, numPisos, cantidadBanos;
	boolean enVenta, A_Arrendar;

	Unidad unidad;
	String direccion = "No_especificada";
	ArrayList<Pieza> piezas = new ArrayList<Pieza>();
	ArrayList<Bano> banos = new ArrayList<Bano>();
	ArrayList<Garaje> garajes = new ArrayList<Garaje>();
	Terraza terraza;
	Balcon balcon;
	Cliente dueno;
	
	public Cliente getDueno(){
		return dueno;
	}
	
	public Casa(int codigo2, String direccion2, String unidad2) {
		codigo = codigo2;
		direccion = direccion2;
		unidad = new Unidad();
		unidad.setNombre(unidad2);
	}
	public void setenVenta(boolean b){
		enVenta = b;
	}
	public void setArrendar(boolean b) {
		A_Arrendar = b;
	}
	
	public boolean getaArrendar() {
		return A_Arrendar;
	}
	
	public int getCodigo(){
		return codigo;
	}
	public String getDireccion() {
		return direccion;
	}
	public Unidad getUnidad() {
		return unidad;
	}
}
