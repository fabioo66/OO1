package ar.edu.unlp.info.oo1.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	String nombre;
	List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public double valorActual() {
		return this.inversiones.stream()
				.mapToDouble(inversion->inversion.valorActual())
				.sum();
	}
}
