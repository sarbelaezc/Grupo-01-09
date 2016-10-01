package suPropiedadRaiz.usuarios;
import java.util.Scanner;
public class ClienteRegistrado extends Cliente {
	long telefono, estrato;
	String direccion;
	
	ClienteRegistrado(){
		super();
		this.estrato = ingresarEstrato();
	}
	public ClienteRegistrado(long cedula){
		this.cedula = cedula;
	}
	public long ingresarEstrato(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese estrato de preferencia: ");
		estrato = entrada.nextLong();	
		return estrato;
	}
	
}
