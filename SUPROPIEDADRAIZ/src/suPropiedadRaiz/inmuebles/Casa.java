package suPropiedadRaiz.inmuebles;

import java.io.Serializable;
import java.util.ArrayList;

import suPropiedadRaiz.usuarios.Cliente;

/**
 * Representa un inmueble de tipo casa con los atributos solicitados
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class Casa extends Inmuebles implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2573902269621370522L;
	int codigo, estrato, AreaTotal, numPisos, cantidadBanos;
	boolean enVenta= false, enArriendo = false,parqueaderoCom = false;
	boolean Vendida = false; boolean Arrendada;
	String direccion = "No_especificada";
	ArrayList<Pieza> piezas = new ArrayList<Pieza>();
	ArrayList<Bano> banos = new ArrayList<Bano>();
	Garaje garaje;
	Unidad unidad;
	Terraza terraza;
	Balcon balcon;
	Cliente dueno;
	
	
	///// Contructores
	public Casa(int codigo2, String direccion2, String unidad2) {
		codigo = codigo2;
		direccion = direccion2;
		unidad = new Unidad();
		unidad.setNombre(unidad2);
	}
	public Casa() {
		
	}
	
	//////////////// Métodos 
	public Cliente getDueno(){
		return dueno;
	}
	
	public String getCantidadbanos(){
		if(banos.size() == 0){
			return "Baños no agregados";
		}
		else{
			return Integer.toString(banos.size());
		}
	}
	
	public void setenVenta(boolean b){
		enVenta = b;
	}
	public void setArrendar(boolean b) {
		enArriendo = b;
	}
	
	public boolean getaArrendar() {
		return enArriendo;
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

	public boolean getenVenta() {
		return enVenta;
	}
	
	public boolean getParqueaderoCom(){
		return parqueaderoCom;
	}
}
