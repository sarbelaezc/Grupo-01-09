package suPropiedadRaiz.inmuebles;

/**
 * Representa la capacidad de un inmueble de tener un balcon con un area
 * @author Santiago Arbel�ez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
public class Balcon {
	int area;

// Get y set de area de balcon
	public void setArea(int area){
		this.area = area;
	}
	
	public int getArea(){
	    return area;
	}
	
	public String toString(){
		if (this.area != 0){
			return "Balcon de area:" + Integer.toString(getArea());
		}
		else {
			return "No se ha especificado el �rea del Balcon";
		}
	}
}
