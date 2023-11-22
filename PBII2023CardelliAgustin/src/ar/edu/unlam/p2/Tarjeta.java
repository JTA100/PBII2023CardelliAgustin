package ar.edu.unlam.p2;

import java.util.Objects;

public class Tarjeta extends Medio{
	
	private Long numero;
	private String fechaDeVencimiento;
	private Integer codigoDeSeguridad;
	private Double saldo;
	
	public Tarjeta(Long numero, String fechaDeVencimiento, Integer codigoDeSeguridad, Double saldo) {
		
		super(fechaDeVencimiento);
		this.numero = numero;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.codigoDeSeguridad = codigoDeSeguridad;
		this.saldo = 0.0;
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(numero, other.numero);
	}




	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
