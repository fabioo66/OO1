package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
	private PlazoFijo plazoFijo;
	private PlazoFijo plazoFijoFechaActual;
	private PlazoFijo plazoFijoInteres;
	
	@BeforeEach
    public void setUp() {
        plazoFijo = new PlazoFijo(LocalDate.now().minusDays(2), 3000, 0.05); 
        plazoFijoFechaActual = new PlazoFijo(LocalDate.now().minusDays(2), 3000, 0.05); 
        plazoFijoInteres = new PlazoFijo(LocalDate.now().minusDays(2), 3000, 0.01); 
    }

    @Test
    public void calcularValorActual() {
        assertEquals(3300, plazoFijo.valorActual());
        assertEquals(3300, plazoFijoFechaActual.valorActual());
        assertEquals(3060, plazoFijoInteres.valorActual());
    }
}
