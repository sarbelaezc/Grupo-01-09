package suPropiedadRaiz.usuarios;
import suPropiedadRaiz.contratos.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {
	
	long cedula, salario, clientes;
	String nombre;
	ArrayList<Cliente> clientesList = new ArrayList<Cliente>();

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
	
	public void Arrendar(){
		Arrendamiento Arren = new Arrendamiento();
	}
	
	public void CompraVen(){
		CompraVenta ComVen = new CompraVenta();
	}


}
