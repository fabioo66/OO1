package org.example;

public class Inspeccion implements Trabajo{
    private String sector;
    private String nombreTecnico;
    private int cantHoras;
    private TipoInspeccion tipoInspeccion;

    public Inspeccion(String sector, String nombreTecnico, int cantHoras, TipoInspeccion tipoInspeccion) {
        this.sector = sector;
        this.nombreTecnico = nombreTecnico;
        this.cantHoras = cantHoras;
        this.tipoInspeccion = tipoInspeccion;
    }

    @Override
    public String descripcion() {
        return "Inspeccion de " +  this.sector + " por " + this.nombreTecnico + " (" + this.tipoInspeccion.getNombre() + ", " + this.cantHoras + " horas)";
    }

    @Override
    public double calcularCosto() {
        return tipoInspeccion.calcularCosto();
    }
}
