package uiMain.menuConsola;

/**
 * Representa la opcion de funcionario que le permite buscar un apartamento especifico
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
import java.util.Scanner;

import suPropiedadRaiz.gestorBD.GestorArchivos;
import suPropiedadRaiz.inmuebles.Apartamento;
@SuppressWarnings("serial")
public class OpcionBuscarAptoEspeA extends OpcionDeMenu {

	
	public void ejecutar() {
	Apartamento apto;
	@SuppressWarnings("resource")
	Scanner entrada  = new Scanner (System.in);
	System.out.println("Ingrese el c�digo de del Apartamento: ");
	int codigo = entrada.nextInt();
	apto = (Apartamento)GestorArchivos.buscarInmuebles(codigo);
	
	if (apto == null){
		System.out.println(" no Encontrado");
		return;
	}
	
	System.out.println("Apartamento encontrado");
	System.out.println("-------------------------------------------------------------------------");
	System.out.println("C�digo: "+ apto.getCodigo());
	System.out.println("Direccion: "+ apto.getDireccion());
	System.out.println("Estrato: " + apto.getEstrato());
	System.out.println("Area Total: " + apto.getAreatotal());
	System.out.println("Cantidad de Ba�os:" + apto.getCantidadbanos());
	System.out.println("Patio: " + apto.getpatio() + "  Parqueadero Comunal: " + apto.getparqueaderoComunal() );
	System.out.println("En venta: " + apto.getenVenta() + "En Arrendamiento: " + apto.getaArrendar() );
	System.out.println("");
	System.out.println("Apartamento encontrado");	

	}

	
	public String toString() {
		
		return "Buscar apartamento especifico en Arrendamiento o en Venta";
	}

}
