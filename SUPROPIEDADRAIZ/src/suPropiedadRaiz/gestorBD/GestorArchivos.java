package suPropiedadRaiz.gestorBD;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Persona;

public class GestorArchivos {
	
	 static ArrayList<Persona> personas = new ArrayList<Persona>();
	 
	 public static ArrayList<Persona> crearListaPersonas() throws FileNotFoundException, IOException{
		
		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Datos.obj"));
		 
		 personas.add(new Cliente(1037650445, "Santiago", "Venta", 2641578, "Mi Casa", "3102955586"));
		 personas.add(new Cliente(1037650445, "Sebastian", "Venta", 4444444, "Su Casa"));
	 	 personas.add(new Cliente(1045, "Santiago", "Arrendamiento"));
		
		 for (int i=0; i<personas.size(); i++){
			 oos.writeObject(personas.get(i));
		 }
		 oos.close();
		 return personas;
	 }
	 
	 public static void crear() throws IOException{
		 
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Datos.obj"));
		
		salida.writeObject(personas);
		salida.close();
		
		System.out.println("Se ha creado Clientes.obj");
	 }
	 
	 public static void leer() throws ClassNotFoundException, IOException{
				
		ObjectInputStream entrada = null;
		 
		try{
			
			entrada = new ObjectInputStream(new FileInputStream("Datos.obj"));
			
			while(true){
				
				Object obj = entrada.readObject();
				
				if(obj instanceof Cliente){
					System.out.println("------------------------------");
					System.out.println( ((Cliente) obj).getNombre());
					System.out.println(((Cliente) obj).getCedula());
					System.out.println(((Cliente) obj).getMotivo());
					System.out.println(((Cliente) obj).getTelefono());
					System.out.println(((Cliente) obj).getDireccion());
					System.out.println(((Cliente) obj).getCelular());
				}
			}
		}catch(IOException io){
			System.out.println("--------------fin-------------");
		}finally{
			entrada.close();
		}
	 }
}
