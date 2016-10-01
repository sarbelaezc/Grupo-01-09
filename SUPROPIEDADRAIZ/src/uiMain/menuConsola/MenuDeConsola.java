package uiMain.menuConsola;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDeConsola {
	
	static ArrayList<OpcionDeMenu> opciones;
	
	public MenuDeConsola(){
		opciones = new ArrayList<OpcionDeMenu>();
		opciones.add(new OpcionesAdministrador());
		opciones.add(new OpcionesClienteRegistrado());
		opciones.add(new OpcionesClienteInvitado());
		opciones.add(new OpcionesFuncionario());
		opciones.add(new OpcionesFuncionarioJefe());
	}
	
	public static void anadirOpcion(OpcionDeMenu op){
		opciones.add(op);
	}
	
	public static void lanzarMenu(){
		
		opciones.add(new OpcionSalir());
	
		for(int i = 1; i<=opciones.size(); i++){
			System.out.println(i+" "+opciones.get(i-1).toString());
		}
		
		@SuppressWarnings("resource")
		Scanner eo = new Scanner(System.in);
		
		System.out.print("Elija una opción: ");
		
		int selec = eo.nextInt();
		
		opciones.get(selec).ejecutar();	
	}
	
	public static void lanzarMenuAnterior() {
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		for(int i = 1; i<=opciones.size(); i++){
			System.out.println(i+" "+opciones.get(i-1).toString());
		}
		@SuppressWarnings("resource")
		Scanner br = new Scanner(System.in);
		System.out.print("Escoja una opcion: ");
		int op =br.nextInt();
		opciones.get((op)-1).ejecutar();
	}
	
	public static void limpiarLista(){
		opciones.clear();
	}
}
