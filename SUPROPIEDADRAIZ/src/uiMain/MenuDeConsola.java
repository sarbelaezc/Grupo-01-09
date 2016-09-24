package uiMain;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDeConsola {
	
	ArrayList<OpcionDeMenu> opciones;
	
	public MenuDeConsola(){
		opciones = new ArrayList<OpcionDeMenu>();
	}
	
	public void anadirOpcion(OpcionDeMenu op){
		opciones.add(op);
	}
	
	public void lanzarMenu(){
		
		opciones.add(new OpcionSalir());
	
		for( int i = 0 ; i < opciones.size(); i ++ ){
			System.out.println(i + " " + opciones.get(i).toString());
		}
		
		@SuppressWarnings("resource")
		Scanner eo = new Scanner(System.in);
		
		System.out.print("Elija una opción: ");
		
		int selec = eo.nextInt();
		
		opciones.get(selec).ejecutar();
		
	}
}
