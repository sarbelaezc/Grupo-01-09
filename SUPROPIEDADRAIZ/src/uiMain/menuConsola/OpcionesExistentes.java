package uiMain.menuConsola;

public class OpcionesExistentes extends OpcionDeMenu {

	private static final long serialVersionUID = 957442375590288316L;

	@Override
	public void ejecutar() {
		MenuDeConsola.lanzarMenu(MenuDeConsola.opciones);
	}

	@Override
	public String toString() {
		return "Opciones Existentes";
	}

}
