package uiMain.menuConsola;

import java.util.ArrayList;

import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Funcionario;

/**
 * Esta clase representa la opcion del funcionario de ver todos los clientes que tiene a cargo
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class OpcionVerListaClientes extends OpcionDeMenu {

	Funcionario f;
	ArrayList<Cliente> listaClientes;
	
	public OpcionVerListaClientes(Funcionario funcionario) {
		// TODO Auto-generated constructor stub
		f = funcionario;
	}

	public OpcionVerListaClientes() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		listaClientes = f.getClientesList();
		System.out.println("----------Clientes----------");
		for(int i=0; i<listaClientes.size(); i++){
			Cliente c = listaClientes.get(i);
			System.out.println("C.C. " + c.getCedula() + " Nombre: " + c.getNombre());
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ver lista de clientes";
	}

}
