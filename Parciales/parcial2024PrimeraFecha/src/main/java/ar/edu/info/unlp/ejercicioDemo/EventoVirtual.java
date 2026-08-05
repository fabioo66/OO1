package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class EventoVirtual extends Evento {
    private double montoEnvio;

    public EventoVirtual(String nombre, LocalDate fecha, String temaPrincipal, double precioDeInscripcion, double precioRemera, double montoEnvio) {
        super(nombre, fecha, temaPrincipal, precioDeInscripcion, precioRemera);
        this.montoEnvio = montoEnvio;
    }

    @Override
    protected double calcularPrecioEspecifico() {
        return this.montoEnvio;
    }
}
