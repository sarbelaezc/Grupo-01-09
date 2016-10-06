import java.util.Scanner;

import suPropiedadRaiz.usuarios.ClienteAnonimo;

public class OpcionesClienteInvitado extends OpcionDeMenu {
			
 ClienteAnonimo anonimo;
	
	public OpcionesClienteInvitado() {
		anonimo = new ClienteAnonimo();
	}

	public void ejecutar() {
		
		MenuDeConsola.limpiarLista();
		
		MenuDeConsola.anadirOpcion(new SolicitarCita());
		
		MenuDeConsola.lanzarMenu();
	}
	
		
	@Override
	public String toString() {
		return "Cliente Invitado";
	}

}
