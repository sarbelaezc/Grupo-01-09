package suPropiedadRaiz.excepciones;

/**
 * Esta clase representa la excepcion de que ocurre al solicitar acceder sin llenar alguno de los campos
 * de inicio de sesion.
 * @author Santiago Arbel�ez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class ExcepcionUsuario1 extends ExcepcionUsuario {
	
	public ExcepcionUsuario1(){
		super("Los campos de nombre de usuario o contrase�a \n no han sido diligenciados correctamente.");
	}
}
