package ar.edu.unlam.p2;

import java.util.Objects;

public class Comercio {
	
	private Integer cuit;
	private String nombre;
	
	public Comercio(Integer cuit, String nombre) {
		this.cuit = cuit;
		this.nombre = nombre;
	}
	
	
	
	
	


	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		return Objects.equals(cuit, other.cuit);
	}




	/// getters y setters
	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
