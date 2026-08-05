package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class EmailTest {

    private Email email;
    private Archivo adjunto1;
    private Archivo adjunto2;

    @BeforeEach
    public void setUp() {
        email = new Email("Asunto", "Cuerpo del email");
        adjunto1 = new Archivo("imagen.png");
        adjunto2 = new Archivo("video.mp4");
    }

    @Test
    public void testGetTamaño() {
        email.agregarAdjunto(adjunto1);
        email.agregarAdjunto(adjunto2);

        int tamañoEsperado = "Asunto".length() + "Cuerpo del email".length() 
                             + "imagen.png".length() + "video.mp4".length();
        assertEquals(tamañoEsperado, email.getTamaño());
    }

    @Test
    public void testContieneTexto() {
        assertEquals(true, email.contieneTexto("Asunto"));
        assertEquals(false, email.contieneTexto("no existe"));
    }

    @Test
    public void testAdjuntos() {
        email.agregarAdjunto(adjunto1);
        List<Archivo> adjuntos = email.getAdjuntos();
        assertEquals(1, adjuntos.size());
        assertEquals("imagen.png", adjuntos.get(0).getNombre());
    }
}

