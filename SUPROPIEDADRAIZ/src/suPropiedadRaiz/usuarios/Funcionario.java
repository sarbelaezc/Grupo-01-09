package suPropiedadRaiz.usuarios;

public class Funcionario {
	long cedula, salario, clientes;
	String nombre;

	public Funcionario(String nombre, long cedula, long salario) {
		
	}
	public long ingresarCedula(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese su número de cedula: ");
		cedula = entrada.nextLong();
		return cedula;
	}
	
	public String ingresarNombre(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		nombre = entrada.nextLine();
		return nombre;
	}

}
