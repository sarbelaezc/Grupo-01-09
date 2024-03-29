package suPropiedadRaiz.usuarios;

import java.io.Serializable;
import java.util.ArrayList;
import suPropiedadRaiz.inmuebles.*;
import suPropiedadRaiz.contratos.*;
import uiMain.menuConsola.*;
import suPropiedadRaiz.gestorBD.*;
/**
 * Esta clase representa tanto al cliente anonimo como al cliente registrado con las funciones respectivas
 * @author Santiago Arbel�ez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class Cliente extends Persona implements Serializable {
	
	private long telefono;
	private String motivo, direccion, celular;
	ArrayList<Inmuebles> A = new ArrayList<Inmuebles>();

	/**
	 * Constructor para cliente anonimo
	 * @param cedula
	 * @param nombre
	 * @param motivo
	 */
	public Cliente(long cedula, String nombre, String motivo){
		this.setCedula(cedula);
		this.setNombre(nombre);
		this.setMotivo(motivo);
		this.clave = "user";
		this.opciones.add("Inmuebles consignados para venta");
		this.opciones.add("Inmuebles consignados para arrendar");
		this.opciones.add("Inmuebles que posee en arrendamiento");
	}
	
	/**
	 * Uno de los constructores para cliente registrado
	 * @param cedula
	 * @param nombre
	 * @param motivo
	 * @param telefono
	 * @param direccion
	 */
	public Cliente(long cedula, String nombre, String motivo, long telefono, String direccion){
		this(cedula, nombre, motivo);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.clave = "user";
		this.opciones.add("Inmuebles consignados para venta");
		this.opciones.add("Inmuebles consignados para arrendar");
		this.opciones.add("Inmuebles que posee en arrendamiento");
	}
	
	/**
	 * Constructor usado para que el funcionario cree un usuario
	 * @param cedula
	 * @param nombre
	 * @param motivo
	 * @param telefono
	 * @param direccion
	 * @param celular
	 */
	public Cliente(long cedula, String nombre, String motivo, long telefono, String direccion, String celular){
		this(cedula, nombre, motivo);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setCelular(celular);
		this.clave = "user";
		this.opciones.add("Inmuebles consignados para venta");
		this.opciones.add("Inmuebles consignados para arrendar");
		this.opciones.add("Inmuebles que posee en arrendamiento");
	}

	/* Devuelve el nombre del cliente
	 * (non-Javadoc)
	 * @see suPropiedadRaiz.usuarios.Persona#getNombre()
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre del cliente por el que se ingresa
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* Devuelve el numero de cedula
	 * (non-Javadoc)
	 * @see suPropiedadRaiz.usuarios.Persona#getCedula()
	 */
	public long getCedula() {
		return cedula;
	}
	
	/**
	 * Cambia el numero de ceula por el ingresado como parametro
	 * @param cedula
	 */
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	/**
	 * Deuelve el string motivo del cliente
	 * @return motivo
	 */
	public String getMotivo() {
		return motivo;
	}

	/**
	 * Cambia el motivo del cliente por el pasado como parametro
	 * @param motivo
	 */
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	/**
	 * Devuelve el telefono del cliente
	 * @return telefono
	 */
	public long getTelefono() {
		return telefono;
	}

	/**
	 * Cambia el telefono del cliente por el infresado como parametro
	 * @param telefono
	 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	/**
	 * Devuelve la direccion del cliente 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Cambia la direccion del cliente por la ingresada como parametro
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Devuelve el celular del cliente
	 * @return celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * Cambia el valor del celular del cliente por el ingresado como parametro
	 * @param celular
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	/**
	 * Hace una busqueda de los inmuebles que tiene arrendados y devuelve una lista con los mismos
	 * @param clt
	 * @return BuscasaList
	 */
	public ArrayList<Inmuebles> Dema_Arr(int cedulacliente, int codigofunc){
		ArrayList<Inmuebles> Lista = new ArrayList<Inmuebles>();
		Persona Func = GestorArchivos.buscar(codigofunc);
		Lista = GestorArchivos.buscarListaInmuebles(cedulacliente);
			
			if (A.getClienteOf().getCedula() == clt.getCedula()){
				Casa A1 = (Casa)A.getInmueble();
				int codigo = A1.getCodigo();
				String direccion = A1.getDireccion();
				String unidad = A1.getUnidad().getNombre();
				Casa A2 = new Casa(codigo, direccion, unidad);
				BuscasaList.add(A2);
			}
		
		return BuscasaList;
	}
	
	/**
	 * Es un cliente oferente que busca inmuebles que tiene consignados para arrendar y devuelve lista
	 * @param clt
	 * @return BuscasaList
	 */
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
			if (A.getDueno().getCedula() == clt.getCedula() && A.getaArrendar() == true){
				int codigo = A.getCodigo();
				String direccion = A.getDireccion();
				String unidad = A.getUnidad().getNombre();
				
				Apartamento A2 = new Apartamento(codigo, direccion, unidad);
				BuscasaList.add(A2);
			}
		}
		return BuscasaList;
	}
	/**
	 * Es un oferente que busca inmubles que tiene para la venta y tambien le devuelve su lista
	 * @param clt
	 * @return BuscasaList
	 */
	public ArrayList<Inmuebles> CltOfertarVenta(Cliente clt){
		ArrayList<Inmuebles> BuscasaList = new ArrayList<Inmuebles>();
		for(int i=0; i <CaList.size(); i++){
			Casa A = CaList.get(i);
			if (A.getDueno().getCedula() == clt.getCedula() && A.getenVenta() == true){
				int codigo = A.getCodigo();
				String direccion = A.getDireccion();
				String unidad = A.getUnidad().getNombre();
				Casa A2 = new Casa(codigo, direccion, unidad);
				BuscasaList.add(A2);
			}
		}
		for(int i=0; i <ApList.size(); i++){
			Apartamento A = ApList.get(i);
			if (A.getDueno().getCedula() == clt.getCedula() && A.getenVenta() == true){
				int codigo = A.getCodigo();
				String direccion = A.getDireccion();
				String unidad = A.getUnidad().getNombre();
				
				Apartamento A2 = new Apartamento(codigo, direccion, unidad);
				BuscasaList.add(A2);
			}
		}
		return BuscasaList;
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