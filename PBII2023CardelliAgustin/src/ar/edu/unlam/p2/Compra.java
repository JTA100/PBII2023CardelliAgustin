package ar.edu.unlam.p2;

public class Compra {
	
	private Double importe;
	private Boolean pagada;
	private Comercio comercio;
	
	public Compra(Comercio comercio, Double importe, Boolean pagada) {
		this.setComercio(comercio);
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


	public Comercio getComercio() {
		return comercio;
	}


	public void setComercio(Comercio comercio) {
		this.comercio = comercio;
	}
}
