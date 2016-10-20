package uiMain.menuConsola;

import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Funcionario;
import suPropiedadRaiz.usuarios.Persona;

@SuppressWarnings("serial")
public class OpcionNuevoFuncionario extends OpcionDeMenu {

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
		GestorArchivos.personas.add(p);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Registrar un nuevo funcionario";
	}

}
