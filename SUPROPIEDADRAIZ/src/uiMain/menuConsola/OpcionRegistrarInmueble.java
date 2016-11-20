package uiMain.menuConsola;

import java.util.Scanner;
import suPropiedadRaiz.inmuebles.Apartamento;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Representa la opcion de un funcionario de registrar un inmueble a su nombre
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */

public class OpcionRegistrarInmueble extends OpcionDeMenu {

	private static final long serialVersionUID = -2659895597544556300L;
	Persona persona;
	Cliente clt;
	@SuppressWarnings("resource")
	@Override
	public void ejecutar() {
		
		Apartamento Apar = new Apartamento();
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresar codigo del apartamento");
		int codigo = entrada.nextInt();
		Apar.setCodigo(codigo);
		
		System.out.print("Ingresar area total del apartamento");
		int areaT = entrada.nextInt();
		Apar.setAreatotal(areaT);
		
		System.out.print("Ingresar direccion del apartamento");
		String direccion = entrada.next();
		Apar.setDireccion(direccion);
		
		System.out.print("Ingresar [1] si tiene patio, [2] en caso contrario ");
		int o = entrada.nextInt();

		if(o == 1){
			boolean patio = true;
			Apar.setpatio(patio);
		}
		else if (o==2){
			boolean patio = false;
			Apar.setpatio(patio);
		}
		
		System.out.print("Ingresar [1] si tiene parqueadero comunal, [2] en caso contrario ");
		int i = entrada.nextInt();
		if(i == 1){
			boolean parquear = true;
			Apar.setparqueaderoComunal(parquear);
		}
		else if (i==2){
			boolean parquear = false;
			Apar.setparqueaderoComunal(parquear);
		}
		
	}

	@Override
	public String toString() {
		return "Registrar un inmueble";
	}

}
