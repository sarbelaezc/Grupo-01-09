package uiMain.menuConsola;

import suPropiedadRaiz.usuarios.FuncionarioJefe;

public class OpcionesFuncionarioJefe extends OpcionDeMenu {
	
	FuncionarioJefe jefe;
	
	public OpcionesFuncionarioJefe(){
		jefe = new FuncionarioJefe();
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Funcionario Jefe";
	}

}
