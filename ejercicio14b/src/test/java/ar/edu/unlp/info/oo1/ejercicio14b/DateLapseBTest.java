package ar.edu.unlp.info.oo1.ejercicio14b;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseBTest {
	private DateLapseB dateLapse;
	
	@BeforeEach
	public void setUp() {
		this.dateLapse = new DateLapseB(LocalDate.of(2024, 10, 2), 13);
	}
	
	@Test
	public void calcularSizeInDays() {
		assertEquals(13, this.dateLapse.sizeInDays());
	}
	
	@Test
	public void chequearIncludesDate() {
		assertTrue(this.dateLapse.includesDate(LocalDate.of(2024, 10, 10)));
	}

}
