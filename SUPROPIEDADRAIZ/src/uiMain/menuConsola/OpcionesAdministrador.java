package uiMain.menuConsola;

public class OpcionesAdministrador extends OpcionDeMenu {

	public void ejecutar() {
		
		MenuDeConsola.limpiarLista();
		
		MenuDeConsola.anadirOpcion(new OpcionVerUsuario());
		MenuDeConsola.anadirOpcion(new OpcionesExistentes());
		MenuDeConsola.anadirOpcion(new OpcionNuevaUsuario());
		MenuDeConsola.anadirOpcion(new OpcionEliminarDeUsuario());
		
		MenuDeConsola.lanzarMenu();
	}
	
	public String toString(){
		return "Administrador";
	}

}
