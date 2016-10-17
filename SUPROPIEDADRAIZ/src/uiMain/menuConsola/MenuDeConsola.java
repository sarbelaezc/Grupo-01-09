package uiMain.menuConsola;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta clase implementa un menu de consola en formato DOS
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class MenuDeConsola implements Serializable{
	
	private static final long serialVersionUID = 3755786809174840531L;
	static ArrayList<OpcionDeMenu> opciones;
		
	/**
	 * Metodo que le añade una opcion al menu existente
	 * @param op
	 */
	public void anadirOpcion(OpcionDeMenu op){
		MenuDeConsola.opciones.add(op);
	}
	
	/**
	 * Este metodo se encarga de lanzar el menu de consola para el usuario
	 */
	public void lanzarMenu(){
		
		anadirOpcion(new OpcionSalir());
	
		for(int i = 1; i<=opciones.size(); i++){
			System.out.println(i+" "+opciones.get(i-1).toString());
		}
		@SuppressWarnings("resource")
		Scanner eo = new Scanner(System.in);
		
		System.out.print("Elija una opción: ");
		
		int selec = eo.nextInt();
		opciones.get(selec-1).ejecutar();	
	}
	
	public static void lanzarMenuAnterior() {
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		for(int i = 1; i<=opciones.size(); i++){
			System.out.println(i+" "+opciones.get(i-1).toString());
		}
		@SuppressWarnings("resource")
		Scanner br = new Scanner(System.in);
		
		System.out.print("Escoja una opcion: ");
		
		int selec =br.nextInt();
		opciones.get((selec)-1).ejecutar();
	}
	
	/**
	 * Este metodo limpia la lista de opciones para poder pasar al siguiente paso
	 */
	public static void limpiarLista(){
		opciones.clear();
	}
	
	/**
	 * Este metodo se encarga de iniciar una sesion para un usuario
	 * @return Persona
	 */
	public static Persona logIn(){
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		@SuppressWarnings("unused")
		String nombre = entrada.nextLine();
		
		System.out.print("Ingrese su cedula: ");
		long cedula = entrada.nextLong();
		
		Persona persona = null;
		try {
			persona = GestorArchivos.buscar(cedula);
		} catch (ClassNotFoundException e) {
			System.out.println("Persona no encontrada");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return persona;
	}
}
