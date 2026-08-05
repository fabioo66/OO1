package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {

    private ClienteDeCorreo cliente;
    private Email email1;
    private Email email2;
    private Archivo adjunto;

    @BeforeEach
    public void setUp() {
        cliente = new ClienteDeCorreo();
        email1 = new Email("Asunto1", "Cuerpo del email 1");
        email2 = new Email("Asunto2", "Cuerpo del email 2");
        adjunto = new Archivo("archivo.txt");
    }

    @Test
    public void testRecibirEmail() {
        cliente.recibir(email1);
        assertEquals(1, cliente.getInbox().getEmails().size());
        assertEquals(email1, cliente.getInbox().getEmails().get(0));
    }

    @Test
    public void testBuscarTexto() {
        cliente.recibir(email1);
        cliente.recibir(email2);
        assertEquals(email2, cliente.buscarTexto("Asunto2"));
        assertNull(cliente.buscarTexto("no existe"));
    }

    @Test
    public void testEspacioOcupado() {
        email1.agregarAdjunto(adjunto);
        cliente.recibir(email1);
        cliente.recibir(email2);

        int espacioEsperado = email1.getTamaño() + email2.getTamaño();
        assertEquals(espacioEsperado, cliente.espacioOcupado());
    }
}

