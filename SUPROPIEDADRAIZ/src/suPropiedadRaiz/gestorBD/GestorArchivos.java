package suPropiedadRaiz.gestorBD;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import suPropiedadRaiz.usuarios.Administrador;
import suPropiedadRaiz.usuarios.Cliente;
import suPropiedadRaiz.usuarios.Funcionario;
import suPropiedadRaiz.usuarios.FuncionarioJefe;
import suPropiedadRaiz.usuarios.Persona;

public class GestorArchivos {
	
	 static ArrayList<Persona> personas = new ArrayList<Persona>();
	 static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	 static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
	 static ArrayList<FuncionarioJefe> listaFuncionariosJefes = new ArrayList<FuncionarioJefe>();
	 
	 public static ArrayList<Persona> crearListaPersonas() throws FileNotFoundException, IOException{
		
		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Datos.obj"));
		 
		 personas.add(new Cliente(1037650446, "Santiago", "Venta", 2641578, "Mi Casa", "3102955586"));
		 personas.add(new Cliente(1037650447, "Sebastian", "Venta", 4444444, "Su Casa"));
	 	 personas.add(new Cliente(1045, "Santiago", "Arrendamiento"));
	 	 personas.add(new Funcionario("Juan", 111112222, 360000));
	 	 personas.add(new FuncionarioJefe("Jaime", 5556555, 5000000));
	 	 personas.add(new Administrador("Administrador1", 1037650445));
		
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
					System.out.println("----------------C--------------");
					System.out.println( ((Cliente) obj).getNombre());
					System.out.println(((Cliente) obj).getCedula());
					System.out.println(((Cliente) obj).getMotivo());
					System.out.println(((Cliente) obj).getTelefono());
					System.out.println(((Cliente) obj).getDireccion());
					System.out.println(((Cliente) obj).getCelular());
				}else if(obj instanceof FuncionarioJefe){
					System.out.println("----------------FJ-------------");
					System.out.println( ((FuncionarioJefe) obj).getNombre());
					System.out.println( ((FuncionarioJefe) obj).getCedula());
					System.out.println( ((FuncionarioJefe) obj).getSalario());
				}else if(obj instanceof Funcionario){
					System.out.println("----------------F--------------");
					System.out.println( ((Funcionario) obj).getNombre());
					System.out.println( ((Funcionario) obj).getCedula());
					System.out.println( ((Funcionario) obj).getSalario());
				}else if(obj instanceof Administrador){
					System.out.println("----------------A--------------");
					System.out.println( ((Administrador) obj).getNombre());
					System.out.println( ((Administrador) obj).getCedula());
				}
				
				/**
				if(obj instanceof Cliente){
					listaClientes.add((Cliente) obj);
				}else if(obj instanceof FuncionarioJefe){
					listaFuncionariosJefes.add((FuncionarioJefe) obj);
				}else if(obj instanceof Funcionario){
					listaFuncionarios.add((Funcionario) obj);
				}
				*/	
			}
		}catch(IOException io){
			System.out.println("--------------fin-------------");
		}finally{
			entrada.close();
		}
	 }
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
