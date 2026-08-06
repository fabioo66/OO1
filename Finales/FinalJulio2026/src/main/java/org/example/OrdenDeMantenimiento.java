package org.example;

import java.util.List;

public class OrdenDeMantenimiento {
    private String nombre;
    public List<Trabajo> trabajos;

    public  OrdenDeMantenimiento(String nombre) {
        this.nombre = nombre;
    }

    public String descripcion() {
        return "Orden " + this.nombre + "\n"
                + this.trabajos.stream().map(Trabajo::descripcion).reduce((a, b) -> a + "\n" + b).orElse("");
    }

    public double calcularCostoTotal(){
        return this.trabajos.stream().mapToDouble((t -> t.calcularCosto())).sum();
    }

    public void agregarTrabajo(Trabajo trabajo) {
        this.trabajos.add(trabajo);
    }
}
