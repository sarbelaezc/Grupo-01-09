package suPropiedadRaiz.inmuebles;

/**
 * Representa la capacidad de un inmueble de tener uno o mas banios
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class Bano extends Cuarto {
	
	private static final long serialVersionUID = 5211070822684513671L;
	boolean banera = false, ducha = false, enchapado = false, puerta = false;
	
/////////////////////////////////////////get y set de area
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	/////////////////////////////////////////get y set de banera
	public boolean getBanera(){
		return banera;
	}
	
	public void setpatio(boolean banera){
		this.banera = banera;
	}
	
	/////////////////////////////////////////get y set de ducha
	public boolean getDucha(){
		return ducha;
	}
	
	public void setDucha(boolean ducha){
		this.ducha = ducha;
	}

	/////////////////////////////////////////get y set de enchapado
	public boolean getEnchapado(){
		return enchapado;
	}
	
	public void setEnchapado(boolean enchapado){
		this.enchapado = enchapado;
	}

	/////////////////////////////////////////get y set de puerta
	public boolean getPuerta(){
		return puerta;
	}
	
	public void setPuerta(boolean puerta){
		this.puerta = puerta;
	}
	
}
