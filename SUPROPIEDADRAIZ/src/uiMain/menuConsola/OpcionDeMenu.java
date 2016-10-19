package uiMain.menuConsola;

import java.io.Serializable;

/**
 * Esta clase abstracta es la clase padre de todo tipo de opciones de menu diferentes para todo tipo de usuarios
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public abstract class OpcionDeMenu implements Serializable{
	
	private static final long serialVersionUID = -5995294995973883092L;
	public abstract void ejecutar();
	public abstract String toString();
}
