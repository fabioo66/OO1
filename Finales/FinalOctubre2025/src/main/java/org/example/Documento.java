package org.example;

public class Documento implements Contenido {
    private int cantHojas;
    private boolean esConfidencial;

    public Documento(int cantHojas, boolean esConfidencial) {
        this.cantHojas = cantHojas;
        this.esConfidencial = esConfidencial;
    }

    @Override
    public String resumen() {
        return "Documento: " + cantHojas + " hojas, " + (esConfidencial ? "confidencial" : "no confidencial");
    }

    @Override
    public String instrucciones() {
        return "No compartir.";
    }

    @Override
    public double costo() {
        return esConfidencial ? 400 : 300;
    }
}
