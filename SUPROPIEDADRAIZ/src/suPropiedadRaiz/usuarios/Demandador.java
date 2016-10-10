package suPropiedadRaiz.usuarios;

public class Demandador{
	long codigo, presupuesto;
	String preferencia;
	
	public Demandador(long codigo){
		ingresarCodigo(codigo);
	}
	
	public Demandador(long codigo, long presupuesto){
		ingresarCodigo(codigo);
		ingresarPresupuesto(presupuesto);
	}

	public void ingresarPresupuesto(long presupuesto) {
		this.presupuesto = presupuesto;
	}

	public void ingresarCodigo(long codigo) {
		this.codigo = codigo;
	}
	
}