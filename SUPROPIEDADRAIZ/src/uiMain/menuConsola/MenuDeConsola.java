package uiMain.menuConsola;

import java.util.ArrayList;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.gestorArchivo;
import suPropiedadRaiz.usuarios.Cliente;

public class MenuDeConsola {
	
	static ArrayList<OpcionDeMenu> opciones;
	Cliente cliente;
	
	public MenuDeConsola(){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Ingrese su cedula: ");
		long cedula = entrada.nextLong();
		
		cliente = gestorArchivo.buscarCliente(cedula);
		
		opciones = new ArrayList<OpcionDeMenu>();
		
		opciones.add(new OpcionesAdministrador());
		opciones.add(new OpcionesClienteRegistrado());
		opciones.add(new OpcionesClienteInvitado());
		opciones.add(new OpcionesFuncionario());
		opciones.add(new OpcionesFuncionarioJefe());

		MenuDeConsola.lanzarMenu();
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
		
		System.out.print("Elija una opci�n: ");
		
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
		int op =br.nextInt();
		opciones.get((op)-1).ejecutar();
	}
	
	public static void limpiarLista(){
		opciones.clear();
	}
}
