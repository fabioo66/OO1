package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>();
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double getVolumenDeMaterial(String nombreDeMaterial) {
		return this.piezas.stream()
			.filter(pieza -> pieza.getMaterial().equals(nombreDeMaterial))
			.mapToDouble(pieza -> pieza.calcularVolumen())
			.sum();
	}
	
	public double getSuperficieDeColor(String unNombreDeColor) {
		return this.piezas.stream()
				.filter(pieza -> pieza.getColor().equals(unNombreDeColor))
				.mapToDouble(pieza -> pieza.calcularSuperficie())
				.sum();
	}
}
