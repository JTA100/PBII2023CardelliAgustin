package ar.edu.unlam.p2;

public class Compra {
	
	private Double importe;
	private Boolean pagada;
	
	
	public Compra(Double importe, Boolean pagada) {
		this.importe = importe;
		this.pagada = pagada;
	}


	public Double getImporte() {
		return importe;
	}


	public void setImporte(Double importe) {
		this.importe = importe;
	}


	public Boolean getPagada() {
		return pagada;
	}


	public void setPagada(Boolean pagada) {
		this.pagada = pagada;
	}
}
