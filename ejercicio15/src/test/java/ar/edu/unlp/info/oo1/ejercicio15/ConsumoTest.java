package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsumoTest {
    private Consumo consumo1;
    private Consumo consumo2;
    private Consumo consumo3;

    @BeforeEach
    public void setUp() {
        consumo1 = new Consumo(100, 0);       
        consumo2 = new Consumo(100, 100);     
        consumo3 = new Consumo(100, 50);    
    }

    @Test
    public void testFactorPotencia() {
        assertEquals(1.0, consumo1.getFactorPotencia(), 0.01);
        assertEquals(0.707, consumo2.getFactorPotencia(), 0.01);
        assertEquals(0.894, consumo3.getFactorPotencia(), 0.01);
    }
}
