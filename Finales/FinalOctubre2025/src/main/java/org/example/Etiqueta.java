package org.example;

public class Etiqueta {
    private Encomienda encomienda;

    public Etiqueta(Encomienda encomienda) {
        this.encomienda = encomienda;
    }

    public String generar() {
        return "Destinatario: " + encomienda.getDestinatario() + "\n"
                + "Resumen: " + encomienda.getContenido().resumen() + "\n"
                + "Instrucciones:\n" + encomienda.getContenido().instrucciones();
    }
}
