package suPropiedadRaiz.inmuebles;

public class Balcon {
	int area;
	
	Balcon(int a){
		area = Inmuebles.ingresarArea();
	}
	
	public int getArea(){
	    return this.area;
	}
}
