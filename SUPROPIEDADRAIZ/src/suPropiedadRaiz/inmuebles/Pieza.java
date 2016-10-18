package suPropiedadRaiz.inmuebles;

public class Pieza extends Cuarto {
	
	private static final long serialVersionUID = 7973907635557393320L;

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
	
	public int getArea() {
		return area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
}
