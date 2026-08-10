package org.example;

import java.time.LocalDate;

public class Alimento implements Contenido {
    private LocalDate fechaDeVencimiento;
    private boolean necesitaRefrigeracion;

    public Alimento(LocalDate fechaDeVencimiento, boolean necesitaRefrigeracion) {
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.necesitaRefrigeracion = necesitaRefrigeracion;
    }

    @Override
    public String resumen() {
        return "Alimento vencible: " + fechaDeVencimiento;
    }

    @Override
    public String instrucciones() {
        return necesitaRefrigeracion ? "Mantener refrigerado." : "Almacenar en lugar seco.";
    }

    @Override
    public double costo() {
        return necesitaRefrigeracion ? 550 : 400;
    }
}
