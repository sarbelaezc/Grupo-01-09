
package suPropiedadRaiz.gestorBD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class gestorArchivo {

	File archivo = new File("Clientes.txt");
	BufferedWriter bw;
	BufferedReader br;
	
	
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
	
	public boolean buscarCliente(int cedula, String cliente) {
		if(archivo.exists()){
			try {
				br = new BufferedReader(new FileReader(archivo));
				
				
				String aux = String.valueOf(cedula);
				 String a;
				 String[] texto;
			     while ((a=br.readLine())!=null) {
			       
			    	 texto=a.split(" ");
			    	 if (aux.equals(texto[0])){
			    		 return true;
			    	 }
			     }
			     return false;
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
				
			}
		return false;
	}
	
	
	
}
