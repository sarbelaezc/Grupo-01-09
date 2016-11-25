package suPropiedadRaiz.usuarios;

import java.util.ArrayList;

/**
 * Esta clase representa el funcionario jefe y todas sus funciones
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class FuncionarioJefe extends Funcionario {
	
	ArrayList <Funcionario> FuncionariosList = new ArrayList<Funcionario>();
	
	/**
	 * Constructor para el funcionario jefe
	 * @param nombre
	 * @param cedula
	 * @param salario
	 */
	public FuncionarioJefe(String nombre, long cedula, long salario) {
		super(nombre, cedula, salario);
		this.clave = "fj";
		this.opciones.add("Registrar nuevo funcionario");
		this.opciones.add("Consultar sueldo");
		this.opciones.add("Listar todos los clientes");
		this.opciones.add("Listas los funcionarios que tiene");
		this.opciones.add("Listar sueldos de funcionario");
	}

	/**
	 * Esta funcion representa la capacidad de crear un funcionario por aprte del funcioanrio jefe
	 * @param nombre
	 * @param cedula
	 * @param salario
	 */
	public void registrarFuncionario(String nombre, long cedula, long salario){
	    Funcionario Func = new Funcionario(nombre, cedula, salario);
	    FuncionariosList.add(Func);
	 }
	
	 /**
	 *  Este metodo lee y devuelve todos los funcionarios que tiene a cargo el funcionario jefe
	 * @return FunciList
	 */
	public ArrayList<Funcionario> ListaFuncionarios(){
		 ArrayList <Funcionario> FunciList = new ArrayList<Funcionario>();
		 for(int i = 0; i<FuncionariosList.size(); i++){
			Funcionario Func = FuncionariosList.get(i);
	     	FunciList.add(Func);
	     }
		 return FunciList;
	  }

	public ArrayList<Funcionario> getListaFuncionarios() {
		
		return FuncionariosList;
	} 
}
