package org.example;

public class MontañistaAmateur extends Escalador {

    public MontañistaAmateur() {
        super();
    }

    @Override
    public double cotizar(Pedido pedido) {
        double costo = pedido.calcularCosto();

        if (this.sumaPedidos() > costo * 2) {
            return costo * 0.95;
        }

        return costo;
    }

    private double sumaPedidos() {
        return this.pedidos.stream().mapToDouble(pedido -> pedido.calcularCosto()).sum();
    }
}
