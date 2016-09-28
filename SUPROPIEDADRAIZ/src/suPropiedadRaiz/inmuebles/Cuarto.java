package suPropiedadRaiz.inmuebles;

import java.util.Scanner;

public abstract class Cuarto {
	
	int area, codigo;
	String uso;
	
	public static String ingresarUso(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el uso: ");
		String uso = entrada.nextLine();
		return uso;
	}
}
