package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;

public class EventoPresencial extends Evento{
    private List<Sede> sedes;

    public EventoPresencial(String nombre, LocalDate fecha, String temaPrincipal, double precioDeInscripcion, double precioRemera, List<Sede> sedes) {
        super(nombre, fecha, temaPrincipal, precioDeInscripcion, precioRemera);
        this.sedes = sedes;
    }

    public void agregarSede(Sede sede) {
        this.sedes.add(sede);
    }

    public double calcularCostoEstadia() {
        return this.sedes.stream().mapToDouble(sede -> sede.precioTotal()).sum();
    }

    @Override
    protected double calcularPrecioEspecifico() {
        return this.calcularCostoEstadia();
    }
}
