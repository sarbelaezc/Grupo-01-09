package suPropiedadRaiz.inmuebles;

import java.io.Serializable;
import java.util.ArrayList;

public class Apartamento extends Inmuebles implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7251029397390616492L;
	String direccion = "No_especificada";
	int areaT, cantidadBanos, codigo;
	boolean patio = false, parqueaderoComunal= false, enVenta= false, aArrendar= false;
	Terraza terraza;
	Balcon balcon;
	ArrayList<Bano> Banos = new ArrayList<Bano>();
	ArrayList<Pieza> Piezas = new ArrayList<Pieza>();
	
	
	public void terraza(Terraza Terr){
		terraza = Terr;
	}
	
	public void balcon(Balcon Bal){
		balcon = Bal;
	}
	
	////////////////////////////////////get y set de direccion
	public String getDireccion(){
		return direccion;
	}
	public void setDireccion(String dir){
		direccion = dir;
	}
	
	//////////////////////////////////get y set de areaT
	public int getAreatotal(){
		return areaT;
	}
	public void setAreatotal(int areatotal){
		areaT = areatotal;
	}
	
	/////////////////////////////////////get y set de codigo
	public int getCodigo(){
		return codigo;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}	
	
	/////////////////////////////////////////get y set de patio
	public boolean getpatio(){
		return patio;
	}
	public void setpatio(boolean patio){
		this.patio = patio;
	}
	
	/////////////////////////////////////////get y set de parqueadero comunal
	public boolean getparqueaderoComunal(){
		return parqueaderoComunal;
	}
	public void setparqueaderoComunal(boolean parq){
		parqueaderoComunal = parq;
	}
	
	/////////////////////////////////////////get y set de en venta
	public boolean getenVenta(){
		return enVenta;
	}
	public void setenVenta(boolean venta){
		enVenta = venta;
	}

	/////////////////////////////////////////get y set de a arrendar
	public boolean getaArrendar(){
		return aArrendar;
	}
	public void setaArrendar(boolean arrendar){
		aArrendar = arrendar;
	}
	
	//////////////////////////////////get y agregar  Bano
	public String getCantidadbanos(){
		if(Banos.size() == 0){
			return "Baños no agregados";
		}
		else{
			return Integer.toString(Banos.size());
		}
	}
	
	public void agregarbano(){
		Banos.add(new Bano());
	}
	
	
	
}
