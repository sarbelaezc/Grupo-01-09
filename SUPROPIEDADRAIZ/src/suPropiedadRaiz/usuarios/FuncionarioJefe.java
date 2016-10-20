package suPropiedadRaiz.usuarios;

import java.util.ArrayList;
import uiMain.menuConsola.*;

public class FuncionarioJefe extends Funcionario {
	
	private static final long serialVersionUID = 7210150202792519097L;
	ArrayList <Funcionario> FuncionariosList = new ArrayList<Funcionario>();
	
	public FuncionarioJefe(String nombre, long cedula, long salario) {
		super(nombre, cedula, salario);
		menu = new MenuDeConsola();
		menu.anadirOpcion(new OpcionSalir());
		menu.anadirOpcion(new OpcionFuncionariosACargo(this.cedula));
		menu.anadirOpcion(new OpcionClientesDeFuncinario(this.cedula));
		menu.anadirOpcion(new OpcionNuevoFuncionario());
	}

	public void registrarFuncionario(String nombre, long cedula, long salario){
	    Funcionario Func = new Funcionario(nombre, cedula, salario);
	    FuncionariosList.add(Func);
	 }
	
	 public ArrayList<Funcionario> ListaFuncionarios(){
		 ArrayList <Funcionario> FunciList = new ArrayList<Funcionario>();
		 for(int i = 0; i<FuncionariosList.size(); i++){
			Funcionario Func = FuncionariosList.get(i);
	     	FunciList.add(Func);
	     }
		 return FunciList;
	  } 
}
