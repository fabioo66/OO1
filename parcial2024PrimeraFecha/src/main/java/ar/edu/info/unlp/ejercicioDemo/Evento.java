package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class Evento {
    private String nombre;
    private LocalDate fecha;
    private String temaPrincipal;
    private double precioDeInscripcion;
    private double precioRemera;

    public Evento(String nombre, LocalDate fecha, String temaPrincipal, double precioDeInscripcion, double precioRemera) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.temaPrincipal = temaPrincipal;
        this.precioDeInscripcion = precioDeInscripcion;
        this.precioRemera = precioRemera;
    }

    protected abstract double calcularPrecioEspecifico();

    // Método general para calcular el precio de asistencia con recargo
    public double calcularPrecioDeAsistencia() {
        double precioBase = precioDeInscripcion + precioRemera + calcularPrecioEspecifico();
        if (LocalDate.now().equals(fecha)) { 
            precioBase *= 1.20;
        }
        return precioBase;
    }

    public Entrada comprarEntrada(Usuario usuario, boolean tieneSeguro){
        double precio = calcularPrecioDeAsistencia();
        if (tieneSeguro) {
            precio += 500;
        }
        Entrada entrada = new Entrada(tieneSeguro, precio, this);
        usuario.agregarEntrada(entrada);

        return entrada;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
