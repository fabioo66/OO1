package org.example;

public class Reparacion implements Trabajo {
    private String equipo;
    private String nombreTecnico;
    private int cantHoras;
    private double precioPorHora;

    public Reparacion(String equipo, String nombreTecnico, int cantHoras, double precioPorHora) {
        this.equipo = equipo;
        this.nombreTecnico = nombreTecnico;
        this.cantHoras = cantHoras;
        this.precioPorHora = precioPorHora;
    }

    @Override
    public String descripcion() {
        return "Reparacion de " + this.equipo + " por " + this.nombreTecnico + " (" + this.cantHoras + " horas a $" + this.precioPorHora + " por hora)";
    }

    @Override
    public double calcularCosto() {
        return cantHoras * precioPorHora;
    }
}
