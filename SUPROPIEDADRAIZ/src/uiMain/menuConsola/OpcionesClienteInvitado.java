package uiMain.menuConsola;

import java.util.Scanner;

import suPropiedadRaiz.usuarios.ClienteAnonimo;

public class OpcionesClienteInvitado extends OpcionDeMenu {
	
	@Override
	public void ejecutar() {
		ClienteAnonimo clienteInvitado = new ClienteAnonimo();
	}

	@Override
	public String toString() {
		return "Cliente Invitado";
	}

}
