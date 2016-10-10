package suPropiedadRaiz.inmuebles;

import java.io.Serializable;
import java.util.ArrayList;

public class Unidad implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6855104747384357151L;
	String nombre, direccion, estrato ;
	int codigo, numTorres, aptosTorre;
	boolean cerrada = false, piscina= false, gimnasio= false; 
	boolean zonasverdes = false, salonsocial = false;
	boolean parque= false, vigilancia= false, serviciodeaseo= false;
	ServiciosAdicionales ServAd;
	ArrayList <Casa> Casas = new ArrayList<Casa>();
	ArrayList <Torre> torres = new ArrayList<Torre>();
	
	////////////////////////////////////
	public void AgregarTorre(){
		torres.add(new Torre());
	}
	public void AgregarCasa(Casa casa){
		Casas.add(casa);
	}
	public int getnumCasas(){
		return Casas.size();
	}
	public int getnumTorres(){
		return torres.size();
	}
	
	////////////////////////////////////get y set de nombre
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nom){
		nombre = nom;
	}
	////////////////////////////////////get y set de direccion
	public String getDireccion(){
		return direccion;
	}
	public void setDireccion(String dir){
		direccion = dir;
	}
	////////////////////////////////////get y set de estrato
	public String getEstrato(){
		return estrato;
	}
	public void setEstrato(String est){
		estrato = est;
	}
	/////////////////////////////////////////get y set de si es unidad cerrada o no
	public boolean getCerrada(){
		return cerrada;
	}
	public void setCerrada(boolean cerrada){
		this.cerrada = cerrada;
	}
	/////////////////////////////////////////get y set de piscina
	public boolean getPiscina(){
		return piscina;
	}
	public void setPiscina(boolean piscina){
		this.piscina = piscina;
	}
	/////////////////////////////////////////get y set de gimnasio
	public boolean getGimnasio(){
		return gimnasio;
	}
	public void setGimnasio(boolean gym){
		gimnasio = gym;
	}
	/////////////////////////////////////////get y set de zonas verdes
	public boolean getZonaV(){
		return zonasverdes;
	}
	public void setZonaV(boolean zon){
		zonasverdes = zon;
	}
	/////////////////////////////////////////get y set de salon social
	public boolean getSalon(){
		return salonsocial;
	}
	public void setSalon(boolean salon){
		salonsocial = salon;
	}	
	/////////////////////////////////////////get y set de parque
	public boolean getParque(){
		return parque;
	}
	public void setParque(boolean parque){
		this.parque = parque;
	}
	/////////////////////////////////////////get y set de vigilancia
	public boolean getVigilancia(){
		return vigilancia;
	}
	public void setVigilancia(boolean vig){
		vigilancia = vig;
	}
	/////////////////////////////////////////get y set de servicio de aseo
	public boolean getServicioAseo(){
		return serviciodeaseo;
	}
	public void setServicioAseo(boolean serv){
		serviciodeaseo = serv;
	}
}
