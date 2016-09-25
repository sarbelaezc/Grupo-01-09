package uiMain.menuConsola;

import suPropiedadRaiz.usuarios.Administrador;

public class OpcionesAdministrador extends OpcionDeMenu {

	Administrador Admin;
	
	public OpcionesAdministrador() {
		Admin = new Administrador();
	}

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
