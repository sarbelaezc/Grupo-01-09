package uiMain.menuConsola;

import java.util.ArrayList;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.inmuebles.Apartamento;
import suPropiedadRaiz.inmuebles.Casa;
import suPropiedadRaiz.inmuebles.Inmuebles;
import suPropiedadRaiz.usuarios.Funcionario;
import suPropiedadRaiz.usuarios.Persona;

public class OpcionAsignarRolInmueble extends OpcionDeMenu {

	private static final long serialVersionUID = 5332755211377836542L;

	Funcionario fun;
	Casa casa;
	Apartamento apto;
	
	
	public void ejecutar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el código del inmueble:");
		int codigo = entrada.nextInt();
		
		for (int i=0; i<GestorArchivos.personas.size(); i++){
			 if (GestorArchivos.personas.get(i) instanceof Funcionario){
				 fun = (Funcionario) GestorArchivos.personas.get(i);
				 
				 if (fun.getListaCasas().size() != 0){
				 for (int j=0; j <fun.getListaCasas().size(); j++){
					  casa = (fun.getListaCasas()).get(j);
					 if(  casa.getCodigo() == codigo){
						
					}
				 	}
				 }
			}
		 
		}

	}

	
	public String toString() {
		return "Asignar rol al inmueble";
	}

}
