package ar.edu.unlam.p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Billetera {
	
	private String nombre;
	private Set<Comercio> comercios;
	private List<Compra> compras;
	private Map<Medio, Integer> medioDePago;
	
	
	public Billetera(String nombre) {
		this.nombre = nombre;
		this.comercios = new HashSet<>();
		this.compras = new ArrayList<>();
		this.medioDePago = new HashMap<>();
	}
	
	
	public void agregarComercio(Comercio nuevo) {
		comercios.add(nuevo);
	}
	
	public Integer cantidadDeComercios() {
		return this.comercios.size();
	}
	

	/// getters y setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Set<Comercio> getComercios() {
		return comercios;
	}


	public void setComercios(Set<Comercio> comercios) {
		this.comercios = comercios;
	}


	public List<Compra> getCompras() {
		return compras;
	}


	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}




	public Map<Medio, Integer> getMedioDePago() {
		return medioDePago;
	}




	public void setMedioDePago(Map<Medio, Integer> medioDePago) {
		this.medioDePago = medioDePago;
	}

}
