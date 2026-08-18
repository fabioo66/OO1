package org.example;

public class GuiaDeMontaña extends Escalador{

    public GuiaDeMontaña() {
        super();
    }

    @Override
    public double cotizar(Pedido pedido) {
        double costo = pedido.calcularCosto();

        if (costo > this.promedioUltimos3Pedidos()) {
            return costo * 0.93;
        }

        return costo;
    }

    private double promedioUltimos3Pedidos() {
        return this.pedidos.stream()
                .skip(Math.max(0, this.pedidos.size() - 3))
                .mapToDouble(pedido -> pedido.calcularCosto())
                .average()
                .orElse(0);
    }
}
