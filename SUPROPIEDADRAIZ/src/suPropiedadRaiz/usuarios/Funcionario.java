package suPropiedadRaiz.usuarios;

import suPropiedadRaiz.contratos.*;
import suPropiedadRaiz.inmuebles.*;
import java.io.Serializable;
import java.util.ArrayList;
import uiMain.menuConsola.*;

public class Funcionario extends Persona implements Serializable{
	
	private static final long serialVersionUID = -1499008267571669186L;
	long salario, clientes;
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
	
	public void rolClienteOf(Cliente clt, String Oferente){
		clt.setMotivo(Oferente);
	}
	
	public void rolClienteDe(Cliente clt, String Demandante){
		clt.setMotivo(Demandante);
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

	public void Arrendar(Cliente clienteOf, Cliente clienteDe, Inmuebles inm){
		Arrendamiento Arren = new Arrendamiento();
		Arren.setClienteOf(clienteOf);
		Arren.setClienteDe(clienteDe);
		Arren.Inmueble = inm;
		ArrendamientoList.add(Arren);
	}
	
	public void ComVe(Cliente clienteOf, Cliente clienteDe, Inmuebles inm){
		CompraVenta CompraVe = new CompraVenta();
		CompraVe.setClienteOf(clienteOf);
		CompraVe.setClienteDe(clienteDe);
		CompraVe.Inmueble = inm;
		CompraVentaList.add(CompraVe);
	}
	
	public ArrayList<Casa> bcasaArr(){
		ArrayList<Casa> BuscasaList = new ArrayList<Casa>();
		for(int i=0; i <casaList.size(); i++){
			Casa casa = casaList.get(i);
			if (casa.getaArrendar() == true){
				int codigo = casa.getCodigo();
				String direccion = casa.getDireccion();
				String unidad = casa.getUnidad();
				Casa casa1 = new Casa(codigo, direccion, unidad);
				BuscasaList.add(casa1);
			}
		}
		return BuscasaList;
	}
	
	public ArrayList<Apartamento> bAparArr(){
		ArrayList<Apartamento> BusAparList = new ArrayList<Apartamento>();
		for(int i=0; i <apartamentoList.size(); i++){
			Apartamento Apar = apartamentoList.get(i);
			if (Apar.getaArrendar() == true){
				int codigo = Apar.getCodigo();
				String direccion = Apar.getDireccion();
				String unidad = Apar.getUnidad();
				int torre = Apar.getTorre();
				Apartamento Apar1 = new Apartamento(codigo, direccion, unidad, torre);
				BusAparList.add(Apar1);
				
			}
		}
		return BusAparList;
	}
	
	public Casa consultaCasaArr(int codigo){
		Casa casa1 = null;
		for(int i=0; i<casaList.size(); i++){
			Casa casa= casaList.get(i);
			if(casa.getCodigo() == codigo && casa.getaArrendar() == true){
				casa1 = casa;
				break;
			}
		}
		return casa1;
	}
	
	public Casa consultaCasaVe(int codigo){
		Casa casa1 = null;
		for(int i=0; i<casaList.size(); i++){
			Casa casa= casaList.get(i);
			if(casa.getCodigo() == codigo && casa.getenVenta() == true){
				casa1 = casa;
				break;
			}
		}
		return casa1;
	}
	
	public Apartamento consultaAparArr(int codigo){
		Apartamento Apar1 = null;
		for(int i=0; i<apartamentoList.size(); i++){
			Apartamento Apar = apartamentoList.get(i);
			if(Apar.getCodigo() == codigo && Apar.getaArrendar() ==true){
				Apar1 = Apar;
				break;
			}
		}
		return Apar1;
	}
	
	public Apartamento consultaAparVe(int codigo){
		Apartamento Apar1 = null;
		for(int i=0; i<apartamentoList.size(); i++){
			Apartamento Apar = apartamentoList.get(i);
			if(Apar.getCodigo() == codigo && Apar.getenVenta() ==true){
				Apar1 = Apar;
				break;
			}
		}
		return Apar1;
	}
}
