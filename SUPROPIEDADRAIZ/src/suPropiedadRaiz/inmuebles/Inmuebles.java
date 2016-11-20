package suPropiedadRaiz.inmuebles;

import java.io.Serializable;

import javax.swing.ImageIcon;

/**
 * Clase que permite agrupar apartamento y casa bajo el mismo tipo de objeto
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
@SuppressWarnings("serial")
public abstract class Inmuebles implements Serializable{
	
	ImageIcon imagen;

	public abstract void setenVenta(boolean b);

	public abstract void setArrendar(boolean b);

	public abstract int getCodigo();

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}	
	
}
