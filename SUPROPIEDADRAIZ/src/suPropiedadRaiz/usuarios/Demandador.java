package suPropiedadRaiz.usuarios;

import java.io.Serializable;
import suPropiedadRaiz.inmuebles.*;

public class Demandador extends Cliente implements Serializable{

	private static final long serialVersionUID = -4965502740288019833L;
	long presupuesto;
	Casa preferenciasCA;	
	Apartamento preferenciasAP;
	
	public Demandador(long cedula, String nombre, String motivo, long presupuesto, long presupuesto1, Casa casa){
		super(cedula, nombre, motivo);
		this.setPresupuesto(presupuesto1);
	}
	
	public Demandador(long cedula, String nombre, String motivo, long presupuesto) {
		super(cedula, nombre, motivo);
		this.setPresupuesto(presupuesto);
	}
	
	public void setPresupuesto(long presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	public long getPresupuesto(){
		return presupuesto;
	}
}