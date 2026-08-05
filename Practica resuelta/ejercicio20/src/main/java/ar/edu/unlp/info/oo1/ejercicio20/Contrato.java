package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;
import java.time.Period;

public abstract class Contrato {
	private LocalDate inicio;

	public Contrato(LocalDate inicio) {
		super();
		this.inicio = inicio;
	}
	
	
	public LocalDate getInicio() {
		return inicio;
	}


	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}


	public abstract boolean estaVigente ();
	public abstract double calcularMonto(Empleado empleado);
	
	public int calcularDuracion () {
		return Period.between(inicio, LocalDate.now()).getYears();
	}
}
