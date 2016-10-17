package suPropiedadRaiz.usuarios;

import suPropiedadRaiz.contratos.*;
import suPropiedadRaiz.inmuebles.*;
import java.io.Serializable;
import java.util.ArrayList;
import uiMain.menuConsola.*;

public class Funcionario extends Persona implements Serializable{
	
	private static final long serialVersionUID = -1499008267571669186L;
	long cedula, salario, clientes;
	String nombre;
	ArrayList<Cliente> clientesList = new ArrayList<Cliente>();
	ArrayList<Casa> casaList = new ArrayList<Casa>();
	ArrayList<Apartamento> apartamentoList = new ArrayList<Apartamento>();
	ArrayList<Arrendamiento> ArrendamientoList = new ArrayList<Arrendamiento>();
	ArrayList<CompraVenta> CompraVentaList = new ArrayList<CompraVenta>();
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
	
	//empiezan funciones de este usuario
	public void registrarCliente(long cedula, String nombre,  String motivo){
		    Cliente Clt = new Cliente(cedula, nombre, motivo);
		    clientesList.add(Clt);
	}
	
	public void registrarApar(){
	    Apartamento Apar = new Apartamento();
	    apartamentoList.add(Apar);
	}
	
	public void registrarCasa(){
	    Casa Cas = new Casa();
	    casaList.add(Cas);
	}
	
	public void setRolCliente(String rol){
		Cliente.motivo = rol;
	}
	
	public void VenderCasa(Inmuebles inm){
		inm.setenVenta(true);
	}
	
	public void NoVenderCasa(Inmuebles inm){
		inm.setenVenta(false);
	}
	
	public void ArrCasa(Inmuebles inm){
		inm.setArrendar(true);
	}
	
	public void NoArrCasa(Inmuebles inm){
		inm.setArrendar(false);
	}

	public void VenderApar(Inmuebles inm){
		inm.setenVenta(true);
	}
	
	public void NoVenderApar(Inmuebles inm){
		inm.setenVenta(false) ;
	}
	
	public void ArrApar(Inmuebles inm){
		inm.setArrendar(true);
	}
	
	public void NoArrApar(Inmuebles inm){
		inm.setArrendar(false);
	}

	public void Arrendar(Cliente clienteOf, Cliente clienteDe){
		Arrendamiento Arren = new Arrendamiento();
		Arren.ClienteOf = clienteOf;
		Arren.ClienteDe = clienteDe;
		ArrendamientoList.add(Arren);
	}
	
	public void ComVe(Cliente clienteOf, Cliente clienteDe){
		CompraVenta CompraVe = new CompraVenta();
		CompraVe.ClienteOf = clienteOf;
		CompraVe.clienteDe = clienteDe;
		CompraVentaList.add(CompraVe);
	}
	
	public ArrayList<Casa> bcasaArr(){
		ArrayList<Casa> BucasaList = new ArrayList<Casa>();
		for(int i=0; i <casaList.size(); i++){
			Casa casa = casaList.get(i);
			if (casa.getaArrendar() == true){
				BucasaList.add(casa);
			}
		}
		return BucasaList;
	}
	
	public ArrayList<Apartamento> bAparArr(){
		ArrayList<Apartamento> BuAparList = new ArrayList<Apartamento>();
		for(int i=0; i <apartamentoList.size(); i++){
			Apartamento Apar = apartamentoList.get(i);
			if (Apar.getaArrendar() == true){
				BuAparList.add(Apar);
			}
		}
		return BuAparList;
	}
}
