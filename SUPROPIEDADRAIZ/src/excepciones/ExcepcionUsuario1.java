package excepciones;

@SuppressWarnings("serial")
public class ExcepcionUsuario1 extends ExcepcionUsuario {
	
	public ExcepcionUsuario1(){
		super("Los campos de nombre de usuario o contrase�a \n no han sido diligenciados correctamente.");
	}
}
