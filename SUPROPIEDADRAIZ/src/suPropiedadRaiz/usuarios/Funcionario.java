package suPropiedadRaiz.usuarios;

import suPropiedadRaiz.contratos.*;
import suPropiedadRaiz.inmuebles.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Esta clase representa el empleado de planta de la empresa y se encarga de las funciones administrativas que tiene asignadas
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class Funcionario extends Persona implements Serializable{
	
	long salario, clientes;
	ArrayList<Cliente> clientesList = new ArrayList<Cliente>();
	ArrayList<Casa> casaList = new ArrayList<Casa>();
	ArrayList<Apartamento> apartamentoList = new ArrayList<Apartamento>();
	ArrayList<Arrendamiento> ArrendamientoList = new ArrayList<Arrendamiento>();
	ArrayList<CompraVenta> CompraVentaList = new ArrayList<CompraVenta>();
	
	public Funcionario(String nombre, long cedula, long salario) {
		this.setNombre(nombre);
		this.setCedula(cedula);
		this.setSalario(salario);
	}
	
	public long getCedula() {
		return cedula;
	}
	
	public ArrayList<Casa> getListaCasas() {
		return casaList;
	}
	public ArrayList<Apartamento> getListaAptos() {
		return apartamentoList;
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
	
	public ArrayList<Cliente> getClientesList() {
		return clientesList;
	}

	public void setClientesList(ArrayList<Cliente> clientesList) {
		this.clientesList = clientesList;
	}

	//empiezan funciones de este usuario
	public void registrarCliente(long cedula, String nombre, String motivo, long telefono, 
									String direccion, String celular){
		    Cliente Clt = new Cliente(cedula, nombre, motivo, telefono, direccion, celular);
		    clientesList.add(Clt);
	}
	
	public void rolCliente(Cliente clt, String motivo){
		clt.setMotivo(motivo);
	}
	
	public void registrarApar(){
	    Apartamento Apar = new Apartamento();
	    apartamentoList.add(Apar);
	}
	
	public void registrarCasa(){
	    Casa Cas = new Casa();
	    casaList.add(Cas);
	}
	
	public void rolVenderCasa(Inmuebles inm, boolean v){
		inm.setenVenta(v);
	}
	
	public void rolArrCasa(Inmuebles inm, boolean v){
		inm.setArrendar(v);
	}

	public void rolVenderApar(Inmuebles inm, boolean v){
		inm.setenVenta(v);
	}
	
	public void ArrApar(Inmuebles inm, boolean v){
		inm.setArrendar(v);
	}

	public void Arrendar(Cliente clienteOf, Cliente clienteDe, Inmuebles inm){
		Arrendamiento Arren = new Arrendamiento();
		Arren.setClienteOf(clienteOf);
		Arren.setClienteDe(clienteDe);
		Arren.setInmueble(inm);
		ArrendamientoList.add(Arren);
	}
	
	public void ComVe(Cliente clienteOf, Cliente clienteDe, Inmuebles inm){
		CompraVenta CompraVe = new CompraVenta();
		CompraVe.setClienteOf(clienteOf);
		CompraVe.setClienteDe(clienteDe);
		CompraVe.setInmueble(inm);
		CompraVentaList.add(CompraVe);
	}
	
	public ArrayList<Casa> bcasaArr(){
		ArrayList<Casa> BuscasaList = new ArrayList<Casa>();
		for(int i=0; i <casaList.size(); i++){
			Casa casa = casaList.get(i);
			if (casa.getaArrendar() == true){
				int codigo = casa.getCodigo();
				String direccion = casa.getDireccion();
				String unidad = casa.getUnidad().getNombre();
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
				String unidad = Apar.getUnidad().getNombre();
				
				Apartamento Apar1 = new Apartamento(codigo, direccion, unidad);
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

	/* 
	 * Devuelve las opciones del adminsitrador
	 * (non-Javadoc)
	 * @see suPropiedadRaiz.usuarios.Persona#getOpciones()
	 */
	@Override
	public ArrayList<String> getOpciones() {
		return opciones;
	}
}
