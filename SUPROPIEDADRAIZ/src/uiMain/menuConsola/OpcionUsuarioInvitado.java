package uiMain.menuConsola;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Funcionario;
import suPropiedadRaiz.usuarios.FuncionarioJefe;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta clase representa al usuario anonimo o invitado, pregunta los datos, lo crea y lo almacena para el gestor de archivos
 * @author Santiago Arbelaez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OpcionUsuarioInvitado extends OpcionDeMenu {

	private static final long serialVersionUID = -176536618825282299L;
	String motivo;
	@Override
	public void ejecutar() {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Ingrese su cedula: ");
		long cedula = entrada.nextLong();
		
		System.out.print("Ingrese el motivo de la cita");
		System.out.print("[1] Arrendar");
		System.out.print("[2] Comprar");
		System.out.print("[3] Ambas");
		
		int MO = entrada.nextInt();

		if(MO == 1){
			motivo = "Arrendar";
		}
		else if (MO==2){
			motivo= "Comprar";
		}
		else if(MO==3){
			motivo = "Ambas";
		}
		else
		{
			System.out.print("Opcion Invalida");
		}
		
		Persona p = new Cliente(cedula, nombre, motivo);
		try {
			Persona p2 = GestorArchivos.buscar(cedula);
			if(p2 == null){
				FuncionarioJefe funJefe;
				ArrayList<Funcionario> funci = new ArrayList<Funcionario>();
				GestorArchivos.personas.add(p);
				for(int i =0; i< GestorArchivos.personas.size(); i++){
					if(GestorArchivos.personas.get(i) instanceof FuncionarioJefe){
						funJefe = (FuncionarioJefe)GestorArchivos.personas.get(i);
						funci = funJefe.ListaFuncionarios();
					}
					
					
				}
			}
			GestorArchivos.personas.add(p);
				if(.getCitasList().size()<16){
					.setCita(cedula);	
				}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Cliente Invitado";
	}

}

