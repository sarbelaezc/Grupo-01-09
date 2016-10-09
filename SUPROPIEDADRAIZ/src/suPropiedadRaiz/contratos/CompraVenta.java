package suPropiedadRaiz.contratos;

import java.io.Serializable;

public class CompraVenta implements Serializable{

	private static final long serialVersionUID = 205373569062991690L;
	long valor;
	String fecha;
	
	
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
	
}
