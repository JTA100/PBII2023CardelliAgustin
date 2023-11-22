package ar.edu.unlam.p2;

public class TarjetaDeDebito extends Tarjeta implements Pagadora{

	public TarjetaDeDebito(Long numero, String fechaDeVencimiento, Integer codigoDeSeguridad, Double saldo) {
		super(numero, fechaDeVencimiento, codigoDeSeguridad, saldo);
		// TODO Auto-generated constructor stub
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
	
	

}
