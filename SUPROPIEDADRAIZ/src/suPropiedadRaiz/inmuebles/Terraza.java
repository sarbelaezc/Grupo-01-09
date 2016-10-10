package suPropiedadRaiz.inmuebles;

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
			return "No Tiene terraza o no se ha especificado";
		}
	}
}
