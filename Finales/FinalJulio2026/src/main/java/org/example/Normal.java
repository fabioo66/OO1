package org.example;

public class Normal extends TipoInspeccion {

    public Normal() {
        super("normal");
    }

    @Override
    public double calcularCosto() {
        return 6000;
    }
}
