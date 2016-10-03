package uiMain.menuConsola;

public class OpcionSalir extends OpcionDeMenu {
	
	public void ejecutar() {
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("Gracias por ingresar a SuPropiedadRaiz, vuelva pronto.");
		System.exit(0);
	}
	
	public String toString(){
		return "Salir";
	}
	
}
