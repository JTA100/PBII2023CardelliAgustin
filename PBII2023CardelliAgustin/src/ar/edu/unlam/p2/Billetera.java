package ar.edu.unlam.p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Billetera {
	
	private String nombre;
	private Set<Comercio> comercios;
	private List<Compra> compras;
	private Map<Medio, Integer> medioDePago;
	private Set<Persona> personas;
	
	
	public Billetera(String nombre) {
		this.nombre = nombre;
		this.comercios = new HashSet<>();
		this.compras = new ArrayList<>();
		this.medioDePago = new HashMap<>();
		this.personas = new TreeSet<>();
	}
	
	/// metodos
	
	public Set<Persona> getPersonas() {
		return personas;
	}


	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}


	public void agregarComercio(Comercio nuevo) {
		comercios.add(nuevo);
	}
	
	public Integer cantidadDeComercios() {
		return this.comercios.size();
	}
	
	private Comercio buscarComercio(Long cuitComercio) {
		for(Comercio actual: comercios) {
			if(actual.getCuit().equals(cuitComercio)) {
				return actual;
			}
		}
		return null;
	}
	
	public void agregarPersona(Persona nuevo) {
		this.personas.add(nuevo);
	}
	
	public Integer cantidadPersonas() {
		return this.personas.size();	}
	
	private Persona buscarPersona(Integer cuil) {
		for(Persona actual: personas) {
			if(actual.getCuil().equals(cuil)) {
				return actual;
			}
		}
		return null;
	}
	
	public void agregarMedio(Integer cuilPersona, Medio nuevo) throws NoEsTitular {
		Persona p = buscarPersona(cuilPersona);
		if(p == null) {
			
		}
		if(!p.getNombre().equals(nuevo.getTitular())){
			throw new  NoEsTitular();
		}
		
		medioDePago.put(nuevo, cuilPersona);
	}
	
	
	public Compra crearQR(Long cuitDelComercio, Double importe) {
		
		Comercio buscado = buscarComercio(cuitDelComercio);
		Compra nueva = new Compra(buscado, importe, null);
		compras.add(nueva);
		return nueva;
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
