package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {

    private Carpeta carpeta;
    private Carpeta destino;
    private Email email1;
    private Email email2;
    private Archivo adjunto;

    @BeforeEach
    public void setUp() {
        carpeta = new Carpeta("Personal");
        destino = new Carpeta("Trabajo");
        email1 = new Email("Asunto1", "Cuerpo del email 1");
        email2 = new Email("Asunto2", "Cuerpo con palabra clave");
        adjunto = new Archivo("archivo.txt");
    }

    @Test
    public void testAgregarEmail() {
        carpeta.agregarEmail(email1);
        assertEquals(1, carpeta.getEmails().size());
        assertEquals(email1, carpeta.getEmails().get(0));
    }

    @Test
    public void testMoverEmail() {
        carpeta.agregarEmail(email1);
        carpeta.mover(email1, destino);
        assertEquals(0, carpeta.getEmails().size());
        assertEquals(1, destino.getEmails().size());
        assertEquals(email1, destino.getEmails().get(0));
    }

    @Test
    public void testBuscarTexto() {
        carpeta.agregarEmail(email1);
        carpeta.agregarEmail(email2);
        assertEquals(email2, carpeta.buscarTextoEnCarpeta("palabra clave"));
        assertNull(carpeta.buscarTextoEnCarpeta("no existe"));
    }

    @Test
    public void testEspacioOcupado() {
        email1.agregarAdjunto(adjunto);
        carpeta.agregarEmail(email1);
        carpeta.agregarEmail(email2);
        int espacioEsperado = email1.getTamaño() + email2.getTamaño();
        assertEquals(espacioEsperado, carpeta.espacioOcupado());
    }
}
