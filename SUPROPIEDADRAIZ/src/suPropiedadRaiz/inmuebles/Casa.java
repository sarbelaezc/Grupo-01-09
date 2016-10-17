package suPropiedadRaiz.inmuebles;

import java.io.Serializable;
import java.util.ArrayList;

public class Casa extends Inmuebles implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2573902269621370522L;
	int codigo, estrato, AreaTotal, numPisos, cantidadBanos;
	boolean enVenta, A_Arrendar;
	
	ArrayList<Pieza> piezas = new ArrayList<Pieza>();
	ArrayList<Bano> banos = new ArrayList<Bano>();
	ArrayList<Garaje> garajes = new ArrayList<Garaje>();
	Terraza terraza;
	Balcon balcon;
	
	public void setenVenta(boolean b){
		enVenta = b;
	}
	public void setArrendar(boolean b) {
		A_Arrendar = b;
	}
	
	public boolean getaArrendar() {
		return A_Arrendar;
	}
	
	
}
