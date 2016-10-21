package suPropiedadRaiz.inmuebles;

import java.io.Serializable;

/**
 * Representa la capacidad de un inmueble de poseer un garaje
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class Garaje implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5609853935063512889L;
	boolean puertaElectrica;
	int codigo, area, altura;
	
	public int getArea() {
		return area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public boolean getPuertaE() {
		return puertaElectrica;
	}
	
	public void setPuertaE(boolean puerta) {
		puertaElectrica = puerta;
	}
}
