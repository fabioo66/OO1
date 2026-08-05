package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cuentaCorriente;
	
	@BeforeEach
	public void setUp() {
		cuentaCorriente = new CuentaCorriente();
	}
	
	@Test
	public void testInitialize() {
		assertEquals(0, cuentaCorriente.getDescubierto());
		assertEquals(0, cuentaCorriente.getSaldo());
	}
	
	@Test
	public void calcularDepositar() {
		cuentaCorriente.setSaldo(100);
		cuentaCorriente.depositar(200);
		assertEquals(300, cuentaCorriente.getSaldo());
	}
	
	@Test 
	public void calcularExtraer() {
		cuentaCorriente.setSaldo(100);
		cuentaCorriente.extraer(100);
		assertEquals(0, cuentaCorriente.getSaldo());
	}
	
	@Test
	public void calcularExtraerPorDebajo() {
		cuentaCorriente.setDescubierto(500);
		cuentaCorriente.setSaldo(100);
		cuentaCorriente.extraer(400);
		assertEquals(-300, cuentaCorriente.getSaldo());
	}
}
