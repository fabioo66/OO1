package ar.edu.info.unlp.ejercicioDemo;

public class Sede {
    private String nombre;
    private double precioPorDia;
    private int cantDias;

    public Sede(String nombre, double precioPorDia, int cantDias) {
        this.nombre = nombre;
        this.precioPorDia = precioPorDia;
        this.cantDias = cantDias;
    }

    public double precioTotal() {
        return this.precioPorDia * this.cantDias;
    }
}
