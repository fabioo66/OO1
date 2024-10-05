package ar.edu.unlp.info.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {
	private ReporteDeConstruccion reporteDeConstruccion;
	
	@BeforeEach
	public void setUp() {
		this.reporteDeConstruccion = new ReporteDeConstruccion();
		this.reporteDeConstruccion.agregarPieza(new Cilindro("acero", "rojo", 5, 10));
		this.reporteDeConstruccion.agregarPieza(new Esfera("acero", "verde", 5));
		this.reporteDeConstruccion.agregarPieza(new Cilindro("metal", "rojo", 5, 10));
		this.reporteDeConstruccion.agregarPieza(new PrismaRectangular("acero", "rojo", 10, 5, 2));
		this.reporteDeConstruccion.agregarPieza(new PrismaRectangular("acero", "verde", 10, 5, 2));
	}
	
	@Test
	public void calcularVolumenTest() {
		assertEquals(1508.997, this.reporteDeConstruccion.getVolumenDeMaterial("acero"), 0.001);
	}
	
	@Test
	public void calcularSuperficieTest() {
		assertEquals(474.159, this.reporteDeConstruccion.getSuperficieDeColor("verde"), 0.001);
	}
	
}
