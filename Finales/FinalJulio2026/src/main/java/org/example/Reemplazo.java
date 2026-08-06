package org.example;

public class Reemplazo implements Trabajo {
    private String nombreComponente;
    private String sector;
    private int cantComponentes;
    private int precioUnitario;

    public Reemplazo(String nombreComponente, String sector, int cantComponentes, int precioUnitario) {
        this.nombreComponente = nombreComponente;
        this.sector = sector;
        this.cantComponentes = cantComponentes;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String descripcion() {
        return "Reemplazo de " + this.cantComponentes + " " + this.nombreComponente + " en " + this.sector + " ($" + this.precioUnitario + " cada uno)";
    }

    @Override
    public double calcularCosto() {
        return cantComponentes * precioUnitario;
    }
}
