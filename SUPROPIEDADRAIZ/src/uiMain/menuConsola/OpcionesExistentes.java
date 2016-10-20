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
		menu.anadirOpcion(new OpcionNuevaUsuario());
		menu.anadirOpcion(new OpcionSalir());
		menu.anadirOpcion(new OpcionUsuarioInvitado());
		menu.anadirOpcion(new OpcionUsuarioRegistrado());
		menu.anadirOpcion(new OpcionVerUsuario());	
		menu.anadirOpcion(new OpcionNuevoFuncionarioJ());
		menu.anadirOpcion(new OpcionRegistrarCliente());
		menu.anadirOpcion(new OpcionAsignarRolCliente());
		menu.anadirOpcion(new OpcionRegistrarInmueble());
		menu.anadirOpcion(new OpcionAsignarRolInmueble());
		menu.anadirOpcion(new OpcionRegistrarCompraVenta());
		menu.anadirOpcion(new OpcionRegistrarArrendamiento());
		menu.anadirOpcion(new OpcionBuscarCasaArriendo());
		menu.anadirOpcion(new OpcionBuscarAptoArriendo());
		menu.anadirOpcion(new OpcionBuscarCasaEspeA());
		menu.anadirOpcion(new OpcionBuscarAptoEspeA());
		menu.anadirOpcion(new OpcionBuscarCasaEspeV());
		menu.anadirOpcion(new OpcionBuscarAptoEspeV());
		menu.anadirOpcion(new OpcionComisionArriendos());
		menu.anadirOpcion(new OpcionComisionVentas());
		menu.anadirOpcion(new OpcionSalarioNeto());
		menu.anadirOpcion(new OpcionVerListaClientes());
		menu.anadirOpcion(new OpcionFuncionariosACargo());
		menu.anadirOpcion(new OpcionClientesDeFuncinario());
		menu.anadirOpcion(new OpcionNuevoFuncionario());
		menu.anadirOpcion(new OpcionBuscarInmueblesArrendados());
		menu.anadirOpcion(new OpcionConsignarInmuebleArrenda());
		menu.anadirOpcion(new OpcionConsignarInmuebleVenta());
	}
	
	@Override
	public void ejecutar() {
		
		menu.limpiarLista();
		
		menu.anadirOpcion(new OpcionEliminarDeUsuario());
		menu.anadirOpcion(new OpcionesExistentes());
		menu.anadirOpcion(new OpcionNuevaUsuario());
		menu.anadirOpcion(new OpcionSalir());
		menu.anadirOpcion(new OpcionUsuarioInvitado());
		menu.anadirOpcion(new OpcionUsuarioRegistrado());
		menu.anadirOpcion(new OpcionVerUsuario());
		menu.anadirOpcion(new OpcionNuevoFuncionarioJ());
		menu.anadirOpcion(new OpcionRegistrarCliente());
		menu.anadirOpcion(new OpcionAsignarRolCliente());
		menu.anadirOpcion(new OpcionRegistrarInmueble());
		menu.anadirOpcion(new OpcionAsignarRolInmueble());
		menu.anadirOpcion(new OpcionRegistrarCompraVenta());
		menu.anadirOpcion(new OpcionRegistrarArrendamiento());
		menu.anadirOpcion(new OpcionBuscarCasaArriendo());
		menu.anadirOpcion(new OpcionBuscarAptoArriendo());
		menu.anadirOpcion(new OpcionBuscarCasaEspeA());
		menu.anadirOpcion(new OpcionBuscarAptoEspeA());
		menu.anadirOpcion(new OpcionBuscarCasaEspeV());
		menu.anadirOpcion(new OpcionBuscarAptoEspeV());
		menu.anadirOpcion(new OpcionComisionArriendos());
		menu.anadirOpcion(new OpcionComisionVentas());
		menu.anadirOpcion(new OpcionSalarioNeto());
		menu.anadirOpcion(new OpcionVerListaClientes());
		menu.anadirOpcion(new OpcionFuncionariosACargo());
		menu.anadirOpcion(new OpcionClientesDeFuncinario());
		menu.anadirOpcion(new OpcionNuevoFuncionario());
		menu.anadirOpcion(new OpcionBuscarInmueblesArrendados());
		menu.anadirOpcion(new OpcionConsignarInmuebleArrenda());
		menu.anadirOpcion(new OpcionConsignarInmuebleVenta());
		
		menu.lanzarMenu();
	}

	@Override
	public String toString() {
		return "Opciones Existentes <<<<<<<<<<<<<<<<<< NOT YET >>>>>>>>>>>>>>>>>>";
	}
}
