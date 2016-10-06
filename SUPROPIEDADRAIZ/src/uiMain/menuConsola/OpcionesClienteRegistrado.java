package uiMain.menuConsola;

import suPropiedadRaiz.usuarios.ClienteRegistrado;

public class OpcionesClienteRegistrado extends OpcionDeMenu {

 ClienteRegistrado clienteReg;
	
   public OpcionesClienteRegistrado() {
		clienteReg = new ClienteRegistrado();
	}

	public void ejecutar() {
		
		MenuDeConsola.limpiarLista();
		
		MenuDeConsola.anadirOpcion(new BusquedaVenderVivienda());
		MenuDeConsola.anadirOpcion(new BusquedaViviendaConsignadaparaArrendar());
		MenuDeConsola.anadirOpcion(new BusquedaViviendasArrendadas());
		
		MenuDeConsola.lanzarMenu();
	}
	
	public String toString(){
		return "Cliente Registrado";
	}
}
