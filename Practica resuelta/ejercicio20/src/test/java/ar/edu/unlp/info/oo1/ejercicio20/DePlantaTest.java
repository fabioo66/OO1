package ar.edu.unlp.info.oo1.ejercicio20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DePlantaTest {
	private DePlanta contratoDePlanta;
	private Empleado empleado;
	
	@BeforeEach
	public void setUp() {
		contratoDePlanta = new DePlanta(LocalDate.of(2024, 03, 29), 500, 50, 30);
	}
	
	@Test
	public void noTieneHijosNiConyugue() {
		empleado = new Empleado("Fabio", "Torrejon", "5-45478924-10", LocalDate.of(2004, 02, 10), false, false);
		assertEquals(500, contratoDePlanta.calcularMonto(empleado));
	}
	
	public void TieneHijos() {
		empleado = new Empleado("Fabio", "Torrejon", "5-45478924-10", LocalDate.of(2004, 02, 10), true, false);
		assertEquals(500, contratoDePlanta.calcularMonto(empleado));
	}
	
	
	
	
}
