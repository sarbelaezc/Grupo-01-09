package uiMain.menuConsola;

import java.io.IOException;
import java.util.ArrayList;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Funcionario;
import suPropiedadRaiz.usuarios.FuncionarioJefe;

@SuppressWarnings("serial")
public class OpcionClientesDeFuncinario extends OpcionDeMenu {

	FuncionarioJefe fj;
	ArrayList<Funcionario> listaFunc;
	ArrayList<Cliente> listaClientes;
	
	public OpcionClientesDeFuncinario(){
		
	}
	
	public OpcionClientesDeFuncinario(long cedula) {
		// TODO Auto-generated constructor stub
		try {
			fj = (FuncionarioJefe) GestorArchivos.buscar(cedula);
			listaFunc = fj.ListaFuncionarios();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		for(int i=0; i<listaFunc.size(); i++){
			
			Funcionario f = listaFunc.get(i);
			listaClientes = f.getClientesList();
			
			for(int j=0; j<listaClientes.size();i++){
				
				Cliente c = listaClientes.get(j);
				
				System.out.println("-------------------------------------");
				System.out.println("Funcionario: C.C. " + f.getCedula() + " Nombre: " + f.getNombre());
				System.out.println("Cliente: C.C. " + c.getCedula() + " Nombre: " + c.getNombre());
			}
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Clientes y Funcionarios que los atienden";
	}

}
