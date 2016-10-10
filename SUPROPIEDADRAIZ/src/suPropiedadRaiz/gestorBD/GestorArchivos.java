package suPropiedadRaiz.gestorBD;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import suPropiedadRaiz.usuarios.Cliente;

public class GestorArchivos {

	 public static void crear(){
		 Cliente cliente=new Cliente(1037650445, "Santiago", "Prueba");
		 ObjectOutputStream salida;
		try {
			salida = new ObjectOutputStream(new FileOutputStream("Clientes.obj"));
			salida.writeObject("Datos del cliente\n");
			salida.writeObject(cliente);
			salida.close();
			
			System.out.println("Se ha creado Clientes.obj");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 
	 public static void leer() throws ClassNotFoundException{
		ObjectInputStream entrada;
		
		try {
			entrada = new ObjectInputStream(new FileInputStream("Clientes.obj"));
			String str=(String)entrada.readObject();
			Cliente obj1=(Cliente)entrada.readObject();
			System.out.println("------------------------------");
			System.out.println(str+obj1.getNombre());
			System.out.println("------------------------------");
			entrada.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
			crear();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	 }
}
