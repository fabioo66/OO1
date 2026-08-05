package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	private Inversor inversor;
	
	@BeforeEach
	public void setUp() {
		inversor = new Inversor("ale");
	}
	
	@Test
	public void calcularValorTotal() {
		inversor.agregarInversion(new PlazoFijo(LocalDate.now().minusDays(2), 3000, 0.05));
		inversor.agregarInversion(new InversionEnAcciones("meli", 5, 1000));
		assertEquals(8300, inversor.valorActual());
	}
	
	public void calcularValorTotalSinInversiones() {
		assertEquals(0, inversor.valorActual());
	}
	
	
	
	
}
