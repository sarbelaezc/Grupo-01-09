package uiMain.menuConsola;

import suPropiedadRaiz.usuarios.Funcionario;

public class OpcionesFuncionario extends OpcionDeMenu {

	Funcionario funcionario;
	
	public OpcionesFuncionario(){
		funcionario = new Funcionario(null, 0, 0);
	}
	
	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Funcionario";
	}

}
