package ar.edu.unlp.info.oo1.ejercicio15;

public class Consumo {
	private double energiaActiva;
	private double energiaReactiva;
	
	public Consumo(double energiaActiva, double energiaReactiva) {
		this.energiaActiva = energiaActiva;
		this.energiaReactiva = energiaReactiva;
	}
	
	public double getEnergiaActiva() {
		return energiaActiva;
	}

	public double getEnergiaReactiva() {
		return energiaReactiva;
	}

	public double getFactorPotencia() {
		return this.energiaActiva / (Math.sqrt(Math.pow(this.energiaActiva, 2) + Math.pow(this.energiaReactiva, 2)));
	}
}
