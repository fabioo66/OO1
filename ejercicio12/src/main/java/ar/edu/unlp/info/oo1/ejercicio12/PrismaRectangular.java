package ar.edu.unlp.info.oo1.ejercicio12;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public PrismaRectangular(String material, String color, int ladoMayor, int ladoMenor, int altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	
	public int getLadoMayor() {
		return this.ladoMayor;
	}
	
	public int getLadoMenor() {
		return this.ladoMenor;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public double calcularVolumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
	public double calcularSuperficie() {
		return 2 * (this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}
	
}
