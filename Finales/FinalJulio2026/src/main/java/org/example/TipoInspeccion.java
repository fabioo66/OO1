package org.example;

public abstract class TipoInspeccion {
    private String nombre;

    public TipoInspeccion(String nombre) {
        this.nombre = nombre;
    }

    protected abstract double calcularCosto();

    public String getNombre() {
        return this.nombre;
    }
}
