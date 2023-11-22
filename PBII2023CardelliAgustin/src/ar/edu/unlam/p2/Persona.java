package ar.edu.unlam.p2;

import java.util.Objects;

public class Persona {
	
	private Long cuil;
	private String apellido;
	private String nombre;
	
	
	public Persona(Long cuil, String apellido, String nombre) {
		this.cuil = cuil;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	
	

	@Override
	public int hashCode() {
		return Objects.hash(cuil);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(cuil, other.cuil);
	}



/// getters y setters
	public Long getCuil() {
		return cuil;
	}


	public void setCuil(Long cuil) {
		this.cuil = cuil;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
