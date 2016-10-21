package uiMain.menuConsola;

import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.inmuebles.Apartamento;
import suPropiedadRaiz.inmuebles.Casa;
import suPropiedadRaiz.inmuebles.Inmuebles;
import suPropiedadRaiz.usuarios.Funcionario;

/**
 * Representa la opcion del funcionario de asignarle un rol especifico a un inmuble
 * @author Santiago Arbelaez Cata�o
 * @author Sebastian Chavarr�a G�mez
 * @author Santiago Montoya Palacio
 */
public class OpcionAsignarRolInmueble extends OpcionDeMenu {

	private static final long serialVersionUID = 5332755211377836542L;

	Funcionario fun;
	
	Inmuebles inm;
	
	public void ejecutar() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el c�digo del inmueble:");
		int codigo = entrada.nextInt();
		
		
		for (int i=0; i<GestorArchivos.personas.size(); i++){
			 
			if (GestorArchivos.personas.get(i) instanceof Funcionario){
				 fun = (Funcionario) GestorArchivos.personas.get(i);
				 
				 if (fun.getListaCasas().size() != 0){
				 
					 for (int j=0; j <fun.getListaCasas().size(); j++){
					 
						 if(  fun.getListaCasas().get(j).getCodigo() == codigo){
							 inm = fun.getListaCasas().get(j);
							 j = fun.getListaCasas().size();
							 i= GestorArchivos.personas.size();
						 }
				 	}
				 }
				 
				 if (fun.getListaAptos().size() != 0){
					 
					 for (int j=0; j <fun.getListaAptos().size(); j++){
					 
						 if(  fun.getListaAptos().get(j).getCodigo() == codigo){
							 inm = fun.getListaAptos().get(j);
							 j = fun.getListaAptos().size();
							 i = GestorArchivos.personas.size();
						 }
				 	}
				 }
				 
				 
			}
		}
		 ///if (fun.getListaAptos().size() != 0 && fun.getListaCasas().size() != 0){
			// System.out.println("No se hallaron casas ni apartamentos registrados a�n");
			// return;
		 //}
		 
		if (inm == null){
			System.out.println("No se hallaron casas ni apartamentos con ese c�digo");
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
			System.out.println("Opcion Inv�lida");
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
		
		System.out.println("Rol Asignado al inmueble de c�digo:"+ inm.getCodigo());
	}

	
	public String toString() {
		return "Asignar rol al inmueble";
	}

}
