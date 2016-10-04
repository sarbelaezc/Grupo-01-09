package suPropiedadRaiz.usuarios;

import java.util.ArrayList;
import uiMain.menuConsola.*;

public class FuncionarioJefe extends Funcionario {
	
	ArrayList <Funcionario> FuncionarioList = new ArrayList<Funcionario>();
	ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	
	public FuncionarioJefe(String nombre, long cedula, long salario) {
		super(nombre, cedula, salario);
	}

	public void registrarFuncionario(String nombre, long cedula, long salario){
	    Funcionario Func = new Funcionario(nombre, cedula, salario);
	    FuncionarioList.add(Func);
	 }
	/*
	 public Funcionario ListaFuncionarios(){
	    for(int i = 0; i<FuncionarioList.size(); i++){
	      Funcionario Func = FuncionarioList.get(i);
	      return Func;
	    }
	  }
	  
	  public ClienteRegistrado ListaClientes(){
	    for(int i = 0; i<clientesList.size(); i++){
	      ClienteRegistrado Clt = ClienteList.get(i);
	      return Clt;
	    }
	  }
	  */
}
