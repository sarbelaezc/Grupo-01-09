package uiMain.menuConsola;

import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Funcionario;
import suPropiedadRaiz.usuarios.FuncionarioJefe;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta clase representa la capacidad del funcionario jefe de registrar un nuevo funcionario en el sistema bajo su cargo
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class OpcionNuevoFuncionario extends OpcionDeMenu {

	FuncionarioJefe fj;
	
	public OpcionNuevoFuncionario(FuncionarioJefe funcionarioJefe) {
		fj = funcionarioJefe;
	}

	public OpcionNuevoFuncionario() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese nombre del nuevo funcionario: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Ingrese cedula del nuevo funcionario: ");
		long cedula = entrada.nextLong();
		
		System.out.print("Ingrese salario del nuevo funcioanrio: ");
		long salario = entrada.nextLong();

		Persona p = new Funcionario(nombre, cedula, salario);
		
		fj.registrarFuncionario(nombre, cedula, salario);
		
		GestorArchivos.personas.add(p);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Registrar un nuevo funcionario";
	}

}
