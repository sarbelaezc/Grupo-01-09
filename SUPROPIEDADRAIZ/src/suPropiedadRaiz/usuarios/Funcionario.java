package suPropiedadRaiz.usuarios;

import suPropiedadRaiz.contratos.*;

import java.io.Serializable;
import java.util.ArrayList;
import uiMain.menuConsola.*;

public class Funcionario extends Persona implements Serializable{
	
	private static final long serialVersionUID = -1499008267571669186L;
	long cedula, salario, clientes;
	String nombre;
	ArrayList<Cliente> clientesList = new ArrayList<Cliente>();
	ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
	MenuDeConsola menu;
	
	public Funcionario(String nombre, long cedula, long salario) {
		this.setNombre(nombre);
		this.setCedula(cedula);
		this.setSalario(salario);
		menu = new MenuDeConsola();
	}
	
	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public long getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
