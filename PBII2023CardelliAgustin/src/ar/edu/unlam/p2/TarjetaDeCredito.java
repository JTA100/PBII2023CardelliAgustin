package ar.edu.unlam.p2;

public class TarjetaDeCredito extends Tarjeta implements Pagadora{
	
	private Double limiteDeCompra;

	

	public void setLimiteDeCompra(Double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}

	public TarjetaDeCredito(Long numero, String fechaDeVencimiento, Integer codigoDeSeguridad, Double saldo, Double limiteDeCompra) {
		super(numero, fechaDeVencimiento, codigoDeSeguridad, saldo);
		this.limiteDeCompra = limiteDeCompra;
		
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}
	
	public Double getLimiteDeCompra() {
		return limiteDeCompra;
	}
	

}
