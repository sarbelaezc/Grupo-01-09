package suPropiedadRaiz.contratos;

import java.io.Serializable;

public class Arrendamiento implements Serializable {
	
	private static final long serialVersionUID = -7214924795934539004L;
	int tarifa;
	String fechaInicio;
	
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
