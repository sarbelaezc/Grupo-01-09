package uiMain.menuConsola;

import java.io.Serializable;

public abstract class OpcionDeMenu implements Serializable{
	
	private static final long serialVersionUID = -5995294995973883092L;
	public abstract void ejecutar();
	public abstract String toString();
}
