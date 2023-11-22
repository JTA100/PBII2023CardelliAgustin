package ar.edu.unlam.p2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void queSePuedanAlmacenarLosDistintosTiposDeTransacciones() {
		
		Persona persona = new Persona(40075, "Cardelli", "Agustin");
		Comercio comercio = new Comercio(1234, "Agus");
		Billetera billetera = new Billetera("nombre");
		billetera.agregarPersona(persona);
		billetera.agregarComercio(comercio);
		
	}
	
	
	@Test
	public void queSePuedanAlmacenarLosDistintosTiposDePersonas() {
		
	}
	
	
	@Test
	public void queSePuedanAsociadACadaPersonaSusMedios() {
		
	}
	
	
	@Test
	public void queSePuedanRealizarCompras() {
		
		
		
	}
	
	
	@Test
	public void queSePuedanRealizarTransferencias() {
		
	}
	
	
	@Test
	public void queSeLanceUnaExcepcionSiElSaldoDeLaTarjetaEsInsuficienteParaHacerUnaCompra() {
		
	}
	
	
	@Test
	public void queSeLanceUnaExcepcionSiElSaldoDeLaCuentaVirtualEsInsuficienteParaHacerUnaCompra() {
		
	}
	
	
	@Test
	public void queSeLanceUnaExcepcionSiElLimiteDeCompraDeLaTarjetaEsInsuficienteParaHacerUnaCompra() {
		
	}
	
	
	@Test
	public void queSeLanceUnaExcepcionSiElSaldoDeLaCuentaEsInsuficienteParaHacerUnaTransferencia() {
		
	}
	
	@Test
	public void queDesdeUnaCuentaCorrienteSePuedaRealizarUnaTransferenciaPorEncimaDeSuSaldo() {
		
	}
	

}
