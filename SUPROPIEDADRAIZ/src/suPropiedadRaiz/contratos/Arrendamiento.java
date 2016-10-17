package suPropiedadRaiz.contratos;

import java.io.Serializable;

import suPropiedadRaiz.inmuebles.Inmuebles;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Demandador;

public class Arrendamiento implements Serializable {
	
	private static final long serialVersionUID = -7214924795934539004L;
	int tarifa;
	String fechaInicio;
	int codigo;
	Inmuebles inmueble;
	Cliente ClienteOf;
	Demandador ClienteDe;
	
	public Cliente getClienteOf(){
		return ClienteOf;
	}
	
	public Cliente getClienteDe(){
		return ClienteDe;
	}
	
	public void setClienteOf(Cliente b){
		ClienteOf = b;
	}
	
	public void setClienteDe(Cliente b){
		ClienteDe = (Demandador) b;
	}
	
	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public int getTarifa() {
		return tarifa;
	}
	
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
}
