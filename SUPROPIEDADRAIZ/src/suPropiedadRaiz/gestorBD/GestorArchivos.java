package suPropiedadRaiz.gestorBD;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import suPropiedadRaiz.usuarios.Administrador;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Funcionario;
import suPropiedadRaiz.usuarios.FuncionarioJefe;
import suPropiedadRaiz.usuarios.Persona;

/**
 * Esta Clase representa la accion guardar objetos del programa
 * @author Santiago Arbelaez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class GestorArchivos {
	
	 public static ArrayList<Persona> personas = new ArrayList<Persona>();
	 
	 /**
	 * Esta funcion representa la capacidad de la clase GestorArchivos para crear una lista con personas para ser agregada al archivo .obj
	 * @return ArrayList<Persona>
	 * @throws ExceptionFileNotFoundException, IOException
	 */
	 public static ArrayList<Persona> crearListaPersonas() throws FileNotFoundException, IOException{
		
		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Datos.obj"));
		 
		 //personas.add(new Cliente(1037650446, "Santiago", "Venta", 2641578, "Mi Casa", "3102955586"));
		 //personas.add(new Cliente(1037650447, "Sebastian", "Venta", 4444444, "Su Casa"));
	 	 //personas.add(new Cliente(1045, "Santiago", "Arrendamiento"));
	 	 //personas.add(new Funcionario("Juan", 111112222, 360000));
	 	 //personas.add(new FuncionarioJefe("Jaime", 5556555, 5000000));
	 	 personas.add(new Administrador("Administrador", 1));
		
		 for (int i=0; i<personas.size(); i++){
			 oos.writeObject(personas.get(i));
		 }
		 oos.close();
		 return personas;
	 }
	 
	 /**
	 * Esta funcion representa la capacidad de la clase GestorArchivos de crear un archivo Datos.obj
	 * @throws IOException
	 */
	public static void crear() throws IOException{
		 
		File fichero = new File("Datos.obj");
		
		if (fichero.exists()){
			
		}else{
			  crearListaPersonas();
		}
		System.out.println("Se ha creado Clientes.obj");
	 }
	 
	 /**
	 * Esta funcion se encarga de leer el archivo Datos.obj y cerciorarse de que se guardan los archivos correctamente
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static void leer() throws ClassNotFoundException, IOException{
				
		ObjectInputStream entrada = null;
		 
		try{
			
			entrada = new ObjectInputStream(new FileInputStream("Datos.obj"));
			
			while(true){
				
				Object obj = entrada.readObject();
								
				if(obj instanceof Cliente){
					
					personas.add((Cliente) obj);
					
					System.out.println("----------------C--------------");
					System.out.println(((Cliente) obj).getNombre());
					System.out.println(((Cliente) obj).getCedula());
					System.out.println(((Cliente) obj).getMotivo());
					System.out.println(((Cliente) obj).getTelefono());
					System.out.println(((Cliente) obj).getDireccion());
					System.out.println(((Cliente) obj).getCelular());
					
				}else if(obj instanceof FuncionarioJefe){
					
					personas.add((FuncionarioJefe) obj);
					
					System.out.println("----------------FJ-------------");
					System.out.println( ((FuncionarioJefe) obj).getNombre());
					System.out.println( ((FuncionarioJefe) obj).getCedula());
					System.out.println( ((FuncionarioJefe) obj).getSalario());
					
				}else if(obj instanceof Funcionario){
					
					personas.add((Funcionario) obj);
					
					System.out.println("----------------F--------------");
					System.out.println( ((Funcionario) obj).getNombre());
					System.out.println( ((Funcionario) obj).getCedula());
					System.out.println( ((Funcionario) obj).getSalario());
					
				}else if(obj instanceof Administrador){
					
					personas.add((Administrador) obj);
					
					System.out.println("----------------A--------------");
					System.out.println( ((Administrador) obj).getNombre());
					System.out.println( ((Administrador) obj).getCedula());
				}
			}
		}catch(IOException io){
			System.out.println("/-/-/-/-/-/-/-/-/-/-/Su Propiedad Raiz/-/-/-/-/-/-/-/-/-/-/");
		}finally{
			entrada.close();
		}
	 }
	
	 /**
	 * Esta funcion es la encargada de buscar por la cedula una persona entre todas las presentes en el archivo Datos.obj y devolverla al ser encontrada
	 * @param cedula
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static Persona buscar(long cedula) throws ClassNotFoundException, IOException{
		 
		Persona persona;
		Persona personaEncontrada = null;
		 
		for (int i = 0; i<personas.size(); i++){
			persona = personas.get(i);
			if(persona.getCedula() == cedula){
				personaEncontrada = persona;
			} 
		}
		return personaEncontrada;
	}
}
