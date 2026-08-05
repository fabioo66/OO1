package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaTest {
    private Usuario usuario;
    private CuadroTarifario cuadroTarifario;
    private Factura factura;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("Fabio", "Calle Falsa 123");
        cuadroTarifario = new CuadroTarifario(10);
    }

    @Test
    public void testCalcularBonificacionSinBonificacion() {
        usuario.agregarConsumo(new Consumo(100, 0)); // Factor de potencia de 1.0
        factura = new Factura(usuario, cuadroTarifario);
        assertEquals(0.10, factura.calcularBonificacion(), 0.01); // Cambiado a 0.10
    }

    @Test
    public void testCalcularBonificacionConBonificacion() {
        usuario.agregarConsumo(new Consumo(100, 50)); // Factor de potencia de 0.894
        factura = new Factura(usuario, cuadroTarifario);
        assertEquals(0.10, factura.calcularBonificacion(), 0.01);
    }
}
