package uiMain.menuConsola;
import java.io.IOException;
import java.util.Scanner;
import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.usuarios.*;

/**
 * Esta opcion representa la capacidad de funcionario de cmabiarle el rol a un cliente seleccionado
 * @author Santiago Arbelaez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class OpcionAsignarRolCliente extends OpcionDeMenu {

	private static final long serialVersionUID = -3375878365254753626L;
	Persona persona;
	Cliente clt;
	@Override
	public void ejecutar() {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese la ID del cliente");
		long ID = entrada.nextLong();
		
		try{
			persona = GestorArchivos.buscar(ID);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		clt= (Cliente)persona;
		
		System.out.print("Ingrese el nuevo motivo");
		String M = entrada.nextLine();
		clt.setMotivo(M);
	}

	@Override
	public String toString() {
		return "Asignar rol a un cliente";
	}

}
