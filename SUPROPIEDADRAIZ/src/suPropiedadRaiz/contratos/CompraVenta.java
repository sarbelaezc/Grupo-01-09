package suPropiedadRaiz.contratos;
import suPropiedadRaiz.inmuebles.Apartamento;
import suPropiedadRaiz.inmuebles.Casa;
import suPropiedadRaiz.usuarios.Cliente;

public class CompraVenta {
	long codigo, valor;
	String fecha;
	Casa casa;
	Apartamento apartamento;
	Cliente clienteOferente, clienteComprador;
	
	public long getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
