package suPropiedadRaiz.usuarios;
import suPropiedadRaiz.contratos.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {
	
	long cedula, salario, clientes;
	String nombre;
	ArrayList<Cliente> clientesList = new ArrayList<Cliente>();
	ArrayList <ClienteRegistrado> ClienteList = new ArrayList<ClienteRegistrado>();
	
	public Funcionario(String nombre, long cedula, long salario) {
		this.nombre = nombre; 
		this.cedula = cedula; 
		this.salario = salario;
	}
	
	public Funcionario() {
		nombre = ingresarNombre();
		cedula = ingresarCedula();
		salario = ingresarSalario();
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
	
	public long ingresarSalario(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese su salario: ");
		salario = entrada.nextLong();
		return salario;
	}
	
	public void Arrendar(){
		Arrendamiento Arren = new Arrendamiento();
	}
	
	public void CompraVen(){
		CompraVenta ComVen = new CompraVenta();
	}


}
