package suPropiedadRaiz.excepciones;

/**
 * Esta clase representa la excepcion de que ocurre al solicitar acceder a los datos de una persona
 * que no esta registrada, por medio de su cedula unicamente 
 * @author Santiago Arbel�ez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class ExcepcionUsuario3 extends ExcepcionUsuario {
	
	public ExcepcionUsuario3(){
		super("Esta cedula no se encuentra registrada");
	}
}
