package org.example;

public class Servicio {
    private double valorNormal;
    private double valorConDescuento;
    private int cantMinima;

    public Servicio(double valorNormal, double valorConDescuento, int cantMinima) {
        this.valorNormal = valorNormal;
        this.valorConDescuento = valorConDescuento;
        this.cantMinima = cantMinima;
    }

    public double calcularCosto(int cantidad) {
        double valorUnitario = cantidad > this.cantMinima
                ? this.valorConDescuento
                : this.valorNormal;

        return cantidad * valorUnitario;
    }
}
