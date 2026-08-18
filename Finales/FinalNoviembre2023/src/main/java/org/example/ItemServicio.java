package org.example;

public class ItemServicio {
    private int cantidad;
    private Servicio servicio;

    public ItemServicio(int cantidad, Servicio servicio) {
        this.cantidad = cantidad;
        this.servicio = servicio;
    }

    public double calcularCosto() {
        return this.servicio.calcularCosto(this.cantidad);
    }
}
