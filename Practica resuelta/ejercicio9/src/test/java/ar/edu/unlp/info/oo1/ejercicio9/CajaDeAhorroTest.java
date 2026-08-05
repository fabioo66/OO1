package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	private CajaDeAhorro cajaDeAhorro;
	
	@BeforeEach
	public void setUp() {
		cajaDeAhorro = new CajaDeAhorro();
	}
	
	@Test
	public void testInitialize() {
		assertEquals(0, cajaDeAhorro.getSaldo());
	}
	
	@Test
	public void calcularDepositoComision() {
		cajaDeAhorro.setSaldo(400);
		cajaDeAhorro.depositar(200);
		assertEquals(596, cajaDeAhorro.getSaldo());
	}
	
	@Test
	public void calcularExtraerComision() {
		cajaDeAhorro.setSaldo(400);
		cajaDeAhorro.extraer(100);
		assertEquals(298, cajaDeAhorro.getSaldo());
	}
	
	@Test
	public void CalcularExtraerSinSaldo() {
		cajaDeAhorro.setSaldo(400);
		assertFalse(cajaDeAhorro.extraer(400));
	}
}
