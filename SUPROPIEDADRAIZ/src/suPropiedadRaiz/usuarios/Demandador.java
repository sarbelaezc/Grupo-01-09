package suPropiedadRaiz.usuarios;

import java.io.Serializable;
import suPropiedadRaiz.inmuebles.*;

/**
 * Esta clase representa la facultad de un cliente de ser demandador con todos los atributos que trae
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class Demandador extends Cliente implements Serializable{

	private static final long serialVersionUID = -4965502740288019833L;
	long presupuesto;
	Casa preferenciasCA;	
	Apartamento preferenciasAP;
	
	/**
	 * Cosntructor
	 * @param cedula
	 * @param nombre
	 * @param motivo
	 * @param presupuesto
	 * @param presupuesto1
	 * @param casa
	 */
	public Demandador(long cedula, String nombre, String motivo, long presupuesto, long presupuesto1, Casa casa){
		super(cedula, nombre, motivo);
		this.setPresupuesto(presupuesto1);
	}
	
	/**
	 * Constructor
	 * @param cedula
	 * @param nombre
	 * @param motivo
	 * @param presupuesto
	 */
	public Demandador(long cedula, String nombre, String motivo, long presupuesto) {
		super(cedula, nombre, motivo);
		this.setPresupuesto(presupuesto);
	}
	
	/**
	 * Cambia el valor del presupuesto por el ingresado en parametro
	 * @param presupuesto
	 */
	public void setPresupuesto(long presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	/**
	 * Devuelve el presupuesto del cliente demandador
	 * @return presupuesto
	 */
	public long getPresupuesto(){
		return presupuesto;
	}
}