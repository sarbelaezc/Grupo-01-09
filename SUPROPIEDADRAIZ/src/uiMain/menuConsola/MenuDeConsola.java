package uiMain.menuConsola;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase implementa un menu de consola en formato DOS
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class MenuDeConsola implements Serializable{
	
	private static final long serialVersionUID = 3755786809174840531L;
	ArrayList<OpcionDeMenu> opciones = new ArrayList<OpcionDeMenu>();
		
	/**
	 * Metodo que le añade una opcion al menu existente
	 * @param op
	 */
	public void anadirOpcion(OpcionDeMenu op){
		this.opciones.add(op);
	}
	
	/**
	 * Este metodo se encarga de lanzar el menu de consola para el usuario
	 */
	public void lanzarMenu(){
	
		for(int i = 1; i<=opciones.size(); i++){
			System.out.println(i+" "+opciones.get(i-1).toString());
		}
		@SuppressWarnings("resource")
		Scanner eo = new Scanner(System.in);
		
		System.out.print("Elija una opción: ");
		
		int selec = eo.nextInt();
		opciones.get(selec-1).ejecutar();	
	}
	
	public void lanzarMenuAnterior() {
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
	public void limpiarLista(){
		opciones.clear();
	}
	
	/**
	 * Este metodo se encarga de iniciar una sesion para un usuario
	 */
	public void logIn(){
		
		System.out.println("¿Que tipo de Usuario es usted?");
		
		this.limpiarLista();
		
		anadirOpcion(new OpcionSalir());
		anadirOpcion(new OpcionUsuarioInvitado());
		anadirOpcion(new OpcionUsuarioRegistrado());
		
		this.lanzarMenu();
		
	}
}
