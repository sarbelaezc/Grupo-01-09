package uiMain.menuConsola;

import java.util.ArrayList;
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.inmuebles.Apartamento;
import suPropiedadRaiz.inmuebles.Casa;
import suPropiedadRaiz.inmuebles.Inmuebles;
import suPropiedadRaiz.usuarios.Funcionario;
import suPropiedadRaiz.usuarios.Persona;
/**
 * Representa la opcion del funcionario de asignarle un rol especifico a un inmuble
 * @author Santiago Arbelaez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OpcionAsignarRolInmueble extends OpcionDeMenu {

	private static final long serialVersionUID = 5332755211377836542L;

	Funcionario fun;
	
	Inmuebles inm;
	
	public void ejecutar() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el código del inmueble:");
		int codigo = entrada.nextInt();
		
		inm = GestorArchivos.buscarInmuebles(codigo);
		
		 ///if (fun.getListaAptos().size() != 0 && fun.getListaCasas().size() != 0){
			// System.out.println("No se hallaron casas ni apartamentos registrados aún");
			// return;
		 //}
		 
		if (inm == null){
			System.out.println("No se hallaron casas ni apartamentos con ese código");
			return;
		}
		
		System.out.println("Casa o Apartamento encontrado");
		
		int n = 0;
		
		do {
		
		System.out.println("-----------------------------");
		System.out.println("Escoja entre los siguientes Roles:");
		System.out.println("[1] En Venta");
		System.out.println("[2] En Arriendo");
		System.out.println("[3] Ambos");
		
		n = entrada.nextInt();
		
		if(n < 1 && n > 3){
			System.out.println("Opcion Inválida");
			System.out.println("Ingrese de nuevo");
		}
		
		}while (n < 1 && n > 3);
		
		if(n == 1){
			if (inm instanceof Casa){
				inm.setenVenta(true);
				inm.setArrendar(false);
			}else if (inm instanceof Apartamento){
				inm.setenVenta(true);
				inm.setArrendar(false);
			}
		}else if(n == 2){
			if (inm instanceof Casa){
				inm.setenVenta(false);
				inm.setArrendar(true);
			}else if (inm instanceof Apartamento){
				inm.setenVenta(false);
				inm.setArrendar(true);
			}
		}else if(n ==3){
			if (inm instanceof Casa){
				inm.setenVenta(true);
				inm.setArrendar(true);
			}else if (inm instanceof Apartamento){
				inm.setenVenta(true);
				inm.setArrendar(true);
			}
		}
		
		System.out.println("Rol Asignado al inmueble de código:"+ inm.getCodigo());
	}

	
	public String toString() {
		return "Asignar rol al inmueble";
	}

}
