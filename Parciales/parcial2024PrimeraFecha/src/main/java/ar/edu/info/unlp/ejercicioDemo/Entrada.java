package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Entrada {
    private LocalDate fechaDeCompra;
    private boolean tieneSeguro;
    private double precio;
    private Evento evento;

    public Entrada(boolean tieneSeguro, double precio, Evento evento) {
        this.fechaDeCompra = LocalDate.now();
        this.tieneSeguro = tieneSeguro;
        this.precio = precio;
        this.evento = evento;
    }
    
    public double montoARecuperar() {
        DateLapse dateLapse = new DateLapse(this.fechaDeCompra, this.evento.getFecha());
        int dias = dateLapse.sizeInDays();

        double monto = 0;

        if (dias >= 30){
            monto = this.precio * 0.50;
        } 

        if (this.tieneSeguro){
            monto += this.precio * 0.15;
        }

        return monto;
    }

    public LocalDate getFecha() {
        return fechaDeCompra;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFechaEvento() {
        return evento.getFecha();
    }
    
}
