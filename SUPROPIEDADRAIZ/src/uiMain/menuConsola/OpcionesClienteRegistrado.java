package uiMain.menuConsola;

import suPropiedadRaiz.usuarios.ClienteRegistrado;

public class OpcionesClienteRegistrado extends OpcionDeMenu {
	
	ClienteRegistrado cliente;
	
	public OpcionesClienteRegistrado(){
		cliente = new ClienteRegistrado();
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "Cliente Registrado";
	}

}
