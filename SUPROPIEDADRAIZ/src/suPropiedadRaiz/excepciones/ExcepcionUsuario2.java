package suPropiedadRaiz.excepciones;

/**
 * Esta clase representa la excepcion de que ocurre al solicitar acceder como una persona
 * que no esta registrada, o con los datos de inicio de sesion erroneos.
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class ExcepcionUsuario2 extends ExcepcionUsuario {

	public ExcepcionUsuario2() {
		super("Nombre de usuario o contraseña no validos");
	}
}
