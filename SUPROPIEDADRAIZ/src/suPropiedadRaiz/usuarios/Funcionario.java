package suPropiedadRaiz.usuarios;

import suPropiedadRaiz.contratos.*;
import java.util.ArrayList;
import uiMain.menuConsola.*;

public class Funcionario extends Persona{
	
	long cedula, salario, clientes;
	String nombre;
	ArrayList<Cliente> clientesList = new ArrayList<Cliente>();
	ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	
	public Funcionario(String nombre, long cedula, long salario) {
		ingresarNombre(nombre);
		ingresarCedula(cedula);
		ingresarSalario(salario);
	}
	
	public void ingresarCedula(long cedula){
		this.cedula = cedula;
	}
	
	public void ingresarNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void ingresarSalario(long salario){
		this.salario = salario;
	}
	
	public void registrarCliente(long cedula, String nombre,  String motivo){
		    Cliente Clt = new Cliente(cedula, nombre, motivo);
		    clientesList.add(Clt);
	}
	
	public void Arrendar(){
		Arrendamiento Arren = new Arrendamiento();
	}
	
	public void CompraVen(){
		CompraVenta ComVen = new CompraVenta();
	}
}
