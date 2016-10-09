package suPropiedadRaiz.gestorBD;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import suPropiedadRaiz.usuarios.Cliente;

public class GestorArchivos {

	 public static void crear(){
		 Cliente cliente = new Cliente();
	     ObjectOutputStream salida;
		try {
			salida = new ObjectOutputStream (new FileOutputStream("Cliente.txt"));
			salida.writeObject(cliente);
		    salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
}
