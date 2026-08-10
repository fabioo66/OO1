package org.example;

public class Encomienda {
    private int numeroSeguimiento;
    private String destinatario;
    private Contenido contenido;

    public Encomienda(int numeroSeguimiento, String destinatario, Contenido contenido) {
        this.numeroSeguimiento = numeroSeguimiento;
        this.destinatario = destinatario;
        this.contenido = contenido;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public Contenido getContenido() {
        return contenido;
    }
}
