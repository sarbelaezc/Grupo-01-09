package uiMain.menuConsola;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Persona;

public class MenuDeConsola {
	
	static ArrayList<OpcionDeMenu> opciones;
	Persona persona;
	
	public MenuDeConsola() throws ClassNotFoundException, IOException{
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		@SuppressWarnings("unused")
		String nombre = entrada.nextLine();
		
		System.out.print("Ingrese su cedula: ");
		long cedula = entrada.nextLong();
		
		persona = GestorArchivos.buscar(cedula);
		
		System.out.println(persona.opciones.get(0));
		opciones = persona.opciones;

		MenuDeConsola.lanzarMenu(opciones);
	}
	
	public void anadirOpcion(OpcionDeMenu op){
		MenuDeConsola.opciones.add(op);
	}
	
	public static void lanzarMenu(ArrayList<OpcionDeMenu> opciones){
		
		opciones.add(new OpcionSalir());
	
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
	
	public static void limpiarLista(){
		opciones.clear();
	}
}
