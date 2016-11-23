package uiMain.gui;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * Esta clase represnta lso formularios que serán necesarios en el programa
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public class FieldPanel extends JPanel{

	String tituloCriterios, tituloValores;
	String[] criterios, valores;
	boolean[] habilitado;
	JTextField[] campos;
	
	/**
	 * crea un nuevo objeto de tipo FieldPanel
	 * @arg tituloCriterios titulo para la columna "CRITERIO"
	 * @arg criterios array con los nombres de los criterios
	 * @arg tituloValores titulo para la columna "VALOR"
	 * @arg valores array con los valores iniciales; Si 'null', no hay valores iniciales
	 * @arg habilitado array con los campos no-editables por el usuario; Si 'null', todos son editables
	 * @param tituloCriterios, criterios, tituloValores, valores, habilitado
	 * @return 
	 */
	public FieldPanel(String tituloCriterios, String[] criterios, String tituloValores, String[] valores, boolean[] habilitado){
		
		this.tituloCriterios = tituloCriterios;
		this.criterios = criterios;
		this.tituloValores = tituloValores;
		this.valores = valores;
		this.habilitado = habilitado;
		int n = this.criterios.length;
		this.campos = new JTextField[n];
		
		JLabel tituloC = new JLabel(tituloCriterios);
		JLabel tituloV = new JLabel(tituloValores);
		
		tituloC.setFont(new Font("Dialog", Font.BOLD, 14));
		tituloV.setFont(new Font("Dialog", Font.BOLD, 14));
		
		tituloC.setBorder(new EmptyBorder(2,2,2,2));
		tituloV.setBorder(new EmptyBorder(2,2,2,2));
		
		this.setLayout(new GridLayout(n+1,2));
		
		this.add(tituloC);
		this.add(tituloV);
		
		for(int j=0; j<campos.length; j++){
			campos[j] = new JTextField();
		}
		for(int i=0; i<n; i++){
			this.add(new JLabel(criterios[i]));
			this.add(campos[i]);
		}		
	}
	/**
	 * Metodo que se le ingresa un parametro y devuelve el valor correspondiente a este
	 * @param criterio
	 * @return String valor
	 */
	public String getValue(String criterio){
		String valor = null;
		for(int i=0; i<this.criterios.length; i++){
			if(criterios[i].equals(criterio)){
				valor = campos[i].getText();
				break;
			}
		}
		return valor;
	}
	/**
	 * Metodo que devuelve 0 si se da clic a aceptar y 1 si se da clic a borrar
	 * @param FieldPanel fp
	 * @return resp=0 si Aceptar, resp=1 si Borrar
	 */
	public int mostrar(FieldPanel fp){
		int resp = -2;
		String botones[] = {"Aceptar","Borrar"};
		resp = JOptionPane.showOptionDialog(null,fp,null,JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
		return resp;
	}

	/**
	 * Metodo que devuelve el arreglo de campos para llenar con informacion
	 * @return JTextField[] campos
	 */
	public JTextField[] getCampos() {
		return campos;
	}

}