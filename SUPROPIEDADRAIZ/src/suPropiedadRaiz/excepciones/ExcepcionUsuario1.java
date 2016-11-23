package suPropiedadRaiz.excepciones;

/**
 * Esta clase representa la excepcion de que ocurre al solicitar acceder sin llenar alguno de los campos
 * de inicio de sesion.
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class ExcepcionUsuario1 extends ExcepcionUsuario {
	
	public ExcepcionUsuario1(){
		super("Los campos de nombre de usuario o contraseña \n no han sido diligenciados correctamente.");
	}
}
