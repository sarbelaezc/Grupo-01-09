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
	
	
}
