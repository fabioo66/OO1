package org.example;

public class Urgente extends TipoInspeccion {

    public Urgente() {
        super("urgente");
    }

    @Override
    public double calcularCosto() {
        return 9000;
    }
}
