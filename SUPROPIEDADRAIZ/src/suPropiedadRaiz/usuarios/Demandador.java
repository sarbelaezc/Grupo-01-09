package suPropiedadRaiz.usuarios;

import java.io.Serializable;

public class Demandador extends Cliente implements Serializable{

	private static final long serialVersionUID = -4965502740288019833L;
	long presupuesto;
	String preferencia;	
	
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