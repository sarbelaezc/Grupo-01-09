package suPropiedadRaiz.inmuebles;

/**
 * Representa la capacidad de una unidad de poseer diferente tipo de servicios
 * @author Santiago Arbeláez Cataño
 * @author Sebastian Chavarría Gómez
 * @author Santiago Montoya Palacio
 */
public class ServiciosAdicionales {
	
	boolean vigilancia, aseo, piscina, gimnasio, salonSocial, parque, zonasVerdes;

	public boolean isVigilancia() {
		return vigilancia;
	}

	public void setVigilancia(boolean vigilancia) {
		this.vigilancia = vigilancia;
	}

	public boolean isAseo() {
		return aseo;
	}

	public void setAseo(boolean aseo) {
		this.aseo = aseo;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public boolean isGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(boolean gimnasio) {
		this.gimnasio = gimnasio;
	}

	public boolean isSalonSocial() {
		return salonSocial;
	}

	public void setSalonSocial(boolean salonSocial) {
		this.salonSocial = salonSocial;
	}

	public boolean isParque() {
		return parque;
	}

	public void setParque(boolean parque) {
		this.parque = parque;
	}

	public boolean isZonasVerdes() {
		return zonasVerdes;
	}

	public void setZonasVerdes(boolean zonasVerdes) {
		this.zonasVerdes = zonasVerdes;
	}
}
