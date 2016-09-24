package uiMain;

import java.util.ArrayList;

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
			System.out.println(i+" "+opciones.get(i).toString());
		}
	}
}
