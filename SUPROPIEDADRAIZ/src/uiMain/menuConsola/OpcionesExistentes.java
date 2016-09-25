package uiMain.menuConsola;

public class OpcionesExistentes extends OpcionDeMenu {

	@Override
	public void ejecutar() {
		MenuDeConsola.lanzarMenu();
	}

	@Override
	public String toString() {
		return "Opciones Existentes";
	}

}
