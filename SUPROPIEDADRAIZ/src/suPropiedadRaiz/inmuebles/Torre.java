package suPropiedadRaiz.inmuebles;

import java.io.Serializable;
import java.util.ArrayList;

public class Torre implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3618017347665059123L;
	int numApartamentosPiso;
	int numPisos, codigo;
	boolean Ascensor;
	ArrayList<Apartamento> Aptos = new ArrayList<Apartamento>();
	int numeroDeTorre;
	Unidad unidad;
	
	////////////////////////////////////////////////
	public void AgregarApto(Apartamento apto){
		Aptos.add(apto);
	}
	public int getnumAptos(){
		return Aptos.size();
	}
	///////////////////////////////////////// get y set de número de apartamentos por piso
	public int getNumApartamentosPiso(){
		return numApartamentosPiso;
	}
	public void setNumApartamentosPiso(int num){
		numApartamentosPiso = num;
	}
	///////////////////////////////////////// get y set de número de  pisos
	public int getNumPisos(){
		return numPisos;
	}
	public void setNumPisos(int num){
		numPisos = num;
	}
	///////////////////////////////////////// get y set de código
	public int getCodigo(){
		return codigo;
	}
	public void setCodigo(int cod){
		codigo = cod;
	}
	/////////////////////////////////////////get y set de si tiene ascensor
	public boolean getAscensor(){
		return Ascensor;
	}
	public void setAscensor(boolean Ascensor){
		this.Ascensor = Ascensor;
	}
	public int getNumeroDeTorre() {
		return numeroDeTorre;
	}
}
