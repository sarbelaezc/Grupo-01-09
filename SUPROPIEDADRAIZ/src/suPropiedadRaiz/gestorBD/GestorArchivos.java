package suPropiedadRaiz.gestorBD;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import suPropiedadRaiz.inmuebles.Inmuebles;
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
		String nom = "Datos.obj";
		File fichero = new File(nom);
		
		if (fichero.exists()){
			System.out.println("El fichero existe");
			try {
				GestorArchivos.leer();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}else{
		 	personas.add(new Administrador("Administrador", 1));
			
			System.out.println("Se ha creado Clientes.obj");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/Su Propiedad Raiz/-/-/-/-/-/-/-/-/-/-/");	
		}
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
						
				}else if(obj instanceof FuncionarioJefe){
					personas.add((FuncionarioJefe) obj);
					
				}else if(obj instanceof Funcionario){
					personas.add((Funcionario) obj);
					
				}else if(obj instanceof Administrador){				
					personas.add((Administrador) obj);
					
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
	
	public static Inmuebles buscarInmuebles(int codigo){
		FuncionarioJefe funJefe;
		Funcionario fun;
		Inmuebles inm = null;
		
		for(int i=0;i < GestorArchivos.personas.size();i++){
			if (GestorArchivos.personas.get(i) instanceof FuncionarioJefe){
				funJefe = (FuncionarioJefe) GestorArchivos.personas.get(i);
				if (funJefe.getListaFuncionarios().size() != 0){
					for(int j = 0; j < funJefe.getListaFuncionarios().size(); i++){
						fun = (Funcionario) GestorArchivos.personas.get(i);
						 
						 if (fun.getListaCasas().size() != 0){
						 
							 for (int k=0; k <fun.getListaCasas().size(); k++){
							 
								 if(  fun.getListaCasas().get(j).getCodigo() == codigo){
									 inm = fun.getListaCasas().get(j);
									 k = fun.getListaCasas().size();
									 j= GestorArchivos.personas.size();
								 }
						 	}
						 }
						 
						 if (fun.getListaAptos().size() != 0){
							 
							 for (int k=0; k <fun.getListaAptos().size(); k++){
							 
								 if(  fun.getListaAptos().get(j).getCodigo() == codigo){
									 inm = fun.getListaAptos().get(j);
									 k = fun.getListaAptos().size();
									 j = GestorArchivos.personas.size();
								 }
						 	}
						 }
					}
				}else {
					System.out.println("No se hallaron Funcionarios Registrados");
				}
			}
		}
		return inm;
	}
	
	
}
