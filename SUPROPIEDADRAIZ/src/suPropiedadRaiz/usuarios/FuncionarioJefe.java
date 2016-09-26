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
	  
	  public void ListaFuncionarios(){
		  for(int i = 0; i<FuncionarioList.size(); i++){
			  Funcionario Func = FuncionarioList.get(i);
			  System.out.println(Func);
	    }
	  }
	  
	  public ClienteRegistrado ListaClientes(){
	    for(int i = 0; i<ClientesList.size(); i++){
	      ClienteRegistrado Clt = ClienteRegistradoList.get(i);
	      return Clt;
	    }
	  }
}
