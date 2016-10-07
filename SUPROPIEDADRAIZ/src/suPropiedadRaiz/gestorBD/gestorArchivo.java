
package suPropiedadRaiz.gestorBD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import suPropiedadRaiz.usuarios.Cliente;

public class gestorArchivo {
	
	BufferedWriter bw;
	static BufferedReader br;
	static File archivo;
	
	static Cliente cliente;
	
	@SuppressWarnings("unused")
	public static void crear(){
		File archivo = new File("./Clientes.txt");
	}	
	
	public void nuevocliente(Integer cedulaC,String nombreC,Integer edadC){
		
		String texto = "";
		try{
			
			if(archivo.exists()) {
			      // El fichero ya existe
				 br = new BufferedReader(new FileReader(archivo));
			     System.out.println("El fichero de texto ya estaba creado.");
			  
			     String a;
			     while ((a=br.readLine())!=null) {
			       texto=texto+a+"\n";
			     }
			     bw = new BufferedWriter(new FileWriter(archivo));
			     bw.write(texto+cedulaC+" "+nombreC+" "+edadC+"\n");
			     bw.close();

			} else {
			      // El fichero no existe y hay que crearlo
				bw = new BufferedWriter(new FileWriter(archivo));
			    System.out.println("Acabo de crear el fichero de texto.");
			    bw.write(cedulaC+" "+nombreC+" "+edadC+"\n");
			}
			bw.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Cliente buscarCliente(long cedula) {
		if(archivo.exists()){
			try {
				
				br = new BufferedReader(new FileReader(archivo));
				String aux = String.valueOf(cedula);
				String a;
				String[] texto;
				
			    while ((a=br.readLine())!=null) {			       
			    	texto=a.split(" ");
			    	if (aux.equals(texto[0])){
			    		cliente = new Cliente();
			    		return cliente;
			    	}
			     }
			     return null;				
			} catch (Exception e) {				
				e.printStackTrace();
			}				
		}
		return null;
	}
	
	
	
}
