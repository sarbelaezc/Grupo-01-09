package suPropiedadRaiz.usuarios;

import java.io.Serializable;

public class Demandador implements Serializable{

	private static final long serialVersionUID = -4965502740288019833L;
	long presupuesto;
	String preferencia;

	public Demandador(long presupuesto){
		ingresarPresupuesto(presupuesto);
	}

	public void ingresarPresupuesto(long presupuesto) {
		this.presupuesto = presupuesto;
	}
}