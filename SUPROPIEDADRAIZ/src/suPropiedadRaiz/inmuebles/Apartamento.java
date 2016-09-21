package suPropiedadRaiz.inmuebles;

import java.util.ArrayList;

public class Apartamento extends Unidad {
	String direccion, cuartos;
	int areaT, cantidadBanos, codigo;
	boolean patio, parqueaderoComunal, enVenta, aArrendar;
	Terraza terraza;
	Balcon balcon;
	ArrayList<Bano> Banos = new ArrayList<Bano>();
	ArrayList<Pieza> Piezas = new ArrayList<Pieza>();
}
