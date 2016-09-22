package suPropiedadRaiz.usuarios;

import java.util.ArrayList;

public class FuncionarioJefe extends Funcionario {
	  ArrayList <Funcionario> FuncionarioList = new ArrayList<Funcionario>();
	
	  public void registrarFuncionario(String nombre, long cedula, long salario){
	      Funcionario Func = new Funcionario(nombre, cedula, salario);
	    	this.cedula = ingresarCedula();
	    	this.nombre = ingresarNombre();
	      FuncionarioList.add(Func);
	    
	  }
	  
	  public Funcionario ListaFuncionarios(){
	    for(int i = 0; i<FuncionarioList.size; i++){
	      Funcionario Func = Funcionario.get(i);
	      return Func;
	    }
	  }
	  
	  public ClienteRegistrado ListaClientes(){
	    for(int i = 0; i<ClientesList.size; i++){
	      ClienteRegistrado Clt = ClienteRegistrado.get(i);
	      return Clt;
	  }
}
