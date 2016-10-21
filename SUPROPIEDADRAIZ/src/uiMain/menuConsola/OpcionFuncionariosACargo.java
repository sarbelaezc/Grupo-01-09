package uiMain.menuConsola;

import java.io.IOException;
import java.util.ArrayList;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Funcionario;
import suPropiedadRaiz.usuarios.FuncionarioJefe;

/**
 * Esta clase representa la capacidad del funcionario jefe de ver que funcionarios tiene bajo su cargo
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class OpcionFuncionariosACargo extends OpcionDeMenu {

	FuncionarioJefe fj;
	ArrayList<Funcionario> listaFunc;
	
	public OpcionFuncionariosACargo() {
		// TODO Auto-generated constructor stub
	}
	
	public OpcionFuncionariosACargo(long cedula) {
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

	/* No retorna el salario neto sino el salario del funcionario
	 * @see uiMain.menuConsola.OpcionDeMenu#ejecutar()
	 */
	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		for(int i=0; i<listaFunc.size(); i++){
			Funcionario f = listaFunc.get(i);
			System.out.println("Funcionario : C.C." + f.getCedula() + " Nombre: " + f.getNombre() + " Salario neto: " + f.getSalario());
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Funcionarios bajo su cargo";
	}

}
