package uiMain.menuConsola;

/**
 * Esta clase es la encargada de mostrar y alojar las opciones existentes en el sistema sin importar el usuario
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OpcionesExistentes extends OpcionDeMenu {

	private static final long serialVersionUID = 957442375590288316L;
	MenuDeConsola menu = new MenuDeConsola();
	
	public OpcionesExistentes(){
		
		menu.anadirOpcion(new OpcionEliminarDeUsuario());
		menu.anadirOpcion(new OpcionesExistentes());
		menu.anadirOpcion(new OpcionNuevaUsuario());
		menu.anadirOpcion(new OpcionSalir());
		menu.anadirOpcion(new OpcionUsuarioInvitado());
		menu.anadirOpcion(new OpcionUsuarioRegistrado());
		menu.anadirOpcion(new OpcionVerUsuario());	
	}
	
	@Override
	public void ejecutar() {
		
		menu.anadirOpcion(new OpcionEliminarDeUsuario());
		menu.anadirOpcion(new OpcionesExistentes());
		menu.anadirOpcion(new OpcionNuevaUsuario());
		menu.anadirOpcion(new OpcionSalir());
		menu.anadirOpcion(new OpcionUsuarioInvitado());
		menu.anadirOpcion(new OpcionUsuarioRegistrado());
		menu.anadirOpcion(new OpcionVerUsuario());	
		
		menu.lanzarMenu();
	}

	@Override
	public String toString() {
		return "Opciones Existentes <<<<<<<<<<<<<<<<<< NOT YET >>>>>>>>>>>>>>>>>>";
	}
}
