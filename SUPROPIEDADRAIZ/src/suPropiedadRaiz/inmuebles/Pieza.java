package suPropiedadRaiz.inmuebles;

public class Pieza extends Cuarto {
	
	
	Pieza(){
		area = Inmuebles.ingresarArea();
		uso = Cuarto.ingresarUso();
	}
	
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
