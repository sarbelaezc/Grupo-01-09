package suPropiedadRaiz.inmuebles;

/**
 * Representa al capacidad de una casa de poseer terraza
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class Terraza {
	int area = 0;
	
//// Get y set de area de Terraza	
	public void setArea(int area){
		this.area = area;
	}
	
	public int getArea(){
	    return area;
	}
	
	public String toString(){
		if (this.area != 0){
			return "Terraza de area:" + area;
		}
		else {
			return "No se ha especificado el área de la Terraza";
		}
	}
}
