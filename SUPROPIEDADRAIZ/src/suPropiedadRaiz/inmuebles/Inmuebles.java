package suPropiedadRaiz.inmuebles;

import java.util.Scanner;

public abstract class Inmuebles {
	
	public static int ingresarArea(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el area: ");
		int area = entrada.nextInt();
		return area;
	}
	
	public static int ingresarValor(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el valor: ");
		int valor = entrada.nextInt();
		return valor;
	}
}
