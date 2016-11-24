package suPropiedadRaiz.inmuebles;

import java.io.Serializable;

/**
 * Clase abstracta de la que heredan atributos y metodos la clase pieza y banio
 * @author Santiago Arbel�ez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
public abstract class Cuarto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3943277537164824255L;
	int area = 0;
	String uso = "No Especificado";
}
