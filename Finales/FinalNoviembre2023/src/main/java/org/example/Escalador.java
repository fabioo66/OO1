package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Escalador {
    protected List<Pedido> pedidos;

    public Escalador() {
        this.pedidos = new ArrayList<>();
    }

    public List<Pedido> getPedidos() {
        return this.pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public abstract double cotizar(Pedido pedido);
}
