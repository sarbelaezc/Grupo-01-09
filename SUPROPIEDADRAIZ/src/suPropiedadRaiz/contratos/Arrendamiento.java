package suPropiedadRaiz.contratos;

import suPropiedadRaiz.inmuebles.Apartamento;
import suPropiedadRaiz.inmuebles.Casa;
import suPropiedadRaiz.usuarios.Cliente;

public class Arrendamiento {
	
	int codigo, tarifa;
	Casa casa;
	Apartamento apartamento;
	Cliente clienteOferente, clienteArrendatario;
	String fechaInicio;
	
	public int getTarifa() {
		return tarifa;
	}
	
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
}
