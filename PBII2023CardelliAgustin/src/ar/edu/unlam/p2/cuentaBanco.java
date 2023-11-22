package ar.edu.unlam.p2;

public class cuentaBanco extends Cuenta implements Transferible{

	private String cbu;
	
	public cuentaBanco(String cbu, String tipo, String titular) {
		this.cbu = cbu;
		this.tipo = tipo;
		this.titular = titular;
	}
	
	

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean extraer(Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}
	
	

}
