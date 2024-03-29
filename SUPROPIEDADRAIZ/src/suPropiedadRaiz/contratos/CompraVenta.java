package suPropiedadRaiz.contratos;

import java.io.Serializable;

import suPropiedadRaiz.inmuebles.Inmuebles;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Demandador;

/**
 * Guarda el cliente oferenete y el demandador, los relaciona como un contrato de arrendamiento
 * @author Santiago Arbel�ez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
public class CompraVenta implements Serializable{

	private static final long serialVersionUID = 205373569062991690L;
	long valor;
	String fecha;
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
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public long getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	public void setInmueble(Inmuebles inm) {
		inmueble = inm;
		
	}
	
}
