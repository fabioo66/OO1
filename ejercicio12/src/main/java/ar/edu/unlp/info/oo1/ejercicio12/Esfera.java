package ar.edu.unlp.info.oo1.ejercicio12;

public class Esfera extends Pieza {
	private int radio;
	
	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}
	
	public int getRadio() {
		return this.getRadio();
	}
	
	public double calcularVolumen() {
		return (4.0 / 3.0) * Math.PI * Math.pow(this.radio, 3);
	}
	
	public double calcularSuperficie() {
		return 4 * Math.PI * Math.pow(this.radio, 2);
	}
}
