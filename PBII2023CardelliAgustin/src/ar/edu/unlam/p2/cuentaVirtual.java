package ar.edu.unlam.p2;

public class cuentaVirtual extends Cuenta implements Transferible{
	
	private String cvu;
	
	public cuentaVirtual(String cbu, String tipo, String titular, String cvu) {
		this.cvu = cvu;
		this.tipo = tipo;
		this.titular = titular;
	}

	public String getCvu() {
		return cvu;
	}

	public void setCvu(String cvu) {
		this.cvu = cvu;
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

}
