package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuiaDeMontañaTest {
    private Escalador guiaDeMontaña;

    @BeforeEach
    public void setup {
        this.guiaDeMontaña = new GuiaDeMontaña();
    }

    @Test
    public void testCon0Pedidos() {
        assertEquals(this.guiaDeMontaña.pedidos.size(), 0);
    }

    @Test
    public void testCon 4 pedidos() {
        Pedido pedido1 = new Pedido();
        Pedido
    }
}
