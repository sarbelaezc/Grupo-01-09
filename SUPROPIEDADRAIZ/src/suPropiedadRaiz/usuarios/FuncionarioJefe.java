package suPropiedadRaiz.usuarios;

import java.util.ArrayList;

public class FuncionarioJefe extends Funcionario {
	
	ArrayList <Funcionario> FuncionarioList = new ArrayList<Funcionario>();
	
	public FuncionarioJefe() {
		super();
	}

	public void registrarFuncionario(){
	    Funcionario Func = new Funcionario();
	    FuncionarioList.add(Func);
	 }
	  
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
}
