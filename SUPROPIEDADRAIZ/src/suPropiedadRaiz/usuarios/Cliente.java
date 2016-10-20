package suPropiedadRaiz.usuarios;

import java.io.Serializable;
import java.util.ArrayList;
import suPropiedadRaiz.inmuebles.*;
import suPropiedadRaiz.contratos.*;
import uiMain.menuConsola.*;

public class Cliente extends Persona implements Serializable {
	
	private static final long serialVersionUID = -8985406422251618852L;
	private long cedula, telefono;
	private String nombre;
	private String motivo, direccion, celular;
	ArrayList<Casa> CaList = Funcionario.casaList;
	ArrayList<Apartamento> ApList = Funcionario.apartamentoList;
	ArrayList<Arrendamiento> ArrenList = Funcionario.ArrendamientoList;
	ArrayList<Inmuebles> A = new ArrayList<Inmuebles>();
	
	public Cliente(){
		menu = new MenuDeConsola();
		menu.logIn();
		menu.anadirOpcion(new OpcionSalir());
	}

	public Cliente(long cedula, String nombre, String motivo){
		this.setCedula(cedula);
		this.setNombre(nombre);
		this.setMotivo(motivo);
		menu = new MenuDeConsola();
		menu.anadirOpcion(new OpcionSalir());
	}
	
	public Cliente(long cedula, String nombre, String motivo, long telefono, String direccion){
		this.setCedula(cedula);
		this.setNombre(nombre);
		this.setMotivo(motivo);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		menu = new MenuDeConsola();
		menu.anadirOpcion(new OpcionSalir());
	}
	
	public Cliente(long cedula, String nombre, String motivo, long telefono, String direccion, String celular){
		this.setCedula(cedula);
		this.setNombre(nombre);
		this.setMotivo(motivo);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setCelular(celular);
		menu = new MenuDeConsola();
		menu.anadirOpcion(new OpcionSalir());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCedula() {
		return cedula;
	}
	
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public ArrayList<Inmuebles> Dema_Arr(Cliente clt){
		ArrayList<Inmuebles> BuscasaList = new ArrayList<Inmuebles>();
		for(int i=0; i <ArrenList.size(); i++){
			Arrendamiento A = ArrenList.get(i);
			if (A.getClienteOf().getCedula() == clt.getCedula()){
				Casa A1 = (Casa)A.getInmueble();
				int codigo = A1.getCodigo();
				String direccion = A1.getDireccion();
				String unidad = A1.getUnidad().getNombre();
				Casa A2 = new Casa(codigo, direccion, unidad);
				BuscasaList.add(A2);
			}
		}
		return BuscasaList;
	}
	
	public ArrayList<Inmuebles> CltOfertarArr(Cliente clt){
		ArrayList<Inmuebles> BuscasaList = new ArrayList<Inmuebles>();
		for(int i=0; i <CaList.size(); i++){
			Casa A = CaList.get(i);
			if (A.getDueno().getCedula() == clt.cedula && A.getaArrendar() == true){
				int codigo = A.getCodigo();
				String direccion = A.getDireccion();
				String unidad = A.getUnidad().getNombre();
				Casa A2 = new Casa(codigo, direccion, unidad);
				BuscasaList.add(A2);
			}
		}
		for(int i=0; i <ApList.size(); i++){
			Apartamento A = ApList.get(i);
			if (A.getDueno().getCedula() == clt.cedula && A.getaArrendar() == true){
				int codigo = A.getCodigo();
				String direccion = A.getDireccion();
				String unidad = A.getUnidad().getNombre();
				int torre = A.getTorre().getNumeroDeTorre();
				Apartamento A2 = new Apartamento(codigo, direccion, unidad, torre);
				BuscasaList.add(A2);
			}
		}
		return BuscasaList;
	}
	public ArrayList<Inmuebles> CltOfertarVenta(Cliente clt){
		ArrayList<Inmuebles> BuscasaList = new ArrayList<Inmuebles>();
		for(int i=0; i <CaList.size(); i++){
			Casa A = CaList.get(i);
			if (A.dueno.cedula == clt.cedula && A.getenVenta() == true){
				int codigo = A.getCodigo();
				String direccion = A.getDireccion();
				String unidad = A.getUnidad();
				Casa A2 = new Casa(codigo, direccion, unidad);
				BuscasaList.add(A2);
			}
		}
		for(int i=0; i <ApList.size(); i++){
			Apartamento A = ApList.get(i);
			if (A.dueno.cedula == clt.cedula && A.getenVenta() == true){
				int codigo = A.getCodigo();
				String direccion = A.getDireccion();
				String unidad = A.getUnidad();
				int torre = A.getTorre();
				Apartamento A2 = new Apartamento(codigo, direccion, unidad, torre);
				BuscasaList.add(A2);
			}
		}
		return BuscasaList;
	}
	
}