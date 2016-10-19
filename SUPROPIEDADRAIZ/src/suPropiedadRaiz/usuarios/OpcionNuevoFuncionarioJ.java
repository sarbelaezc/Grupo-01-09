package suPropiedadRaiz.usuarios;

import java.util.Scanner;

import uiMain.menuConsola.OpcionDeMenu;

public class OpcionNuevoFuncionarioJ extends OpcionDeMenu {

	private static final long serialVersionUID = -8696187756254609865L;

	@Override
	public void ejecutar() {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese nombre del nuevo funcionario jefe: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Ingrese cedula del nuevo funcionario jefe: ");
		long cedula = entrada.nextLong();
		
		System.out.print("Ingrese salario del nuevo funcioanrio jefe: ");
		long salario = entrada.nextLong();

		new FuncionarioJefe(nombre, cedula, salario);
	}

	@Override
	public String toString() {
		return "Crear nuevo Funcionario Jefe";
	}

}
