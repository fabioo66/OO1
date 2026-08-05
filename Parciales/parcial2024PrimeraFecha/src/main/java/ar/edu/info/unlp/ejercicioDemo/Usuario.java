package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Entrada> entradas;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.entradas = new ArrayList<>();
    }

    public void agregarEntrada(Entrada entrada) {
        this.entradas.add(entrada);
    }

    public double montoEntradasPeriodo(LocalDate fechaInicial, LocalDate fechaFinal){
        DateLapse dateLapse = new DateLapse(fechaInicial, fechaFinal);
        return this.entradas.stream(). 
            filter(entrada -> dateLapse.includesDate(entrada.getFecha())). 
            mapToDouble(entrada -> entrada.getPrecio()). 
            sum();
    }

    public Entrada entradaAlSiguienteEvento() {
    LocalDate hoy = LocalDate.now();
    return this.entradas.stream() // Stream de entradas
        .filter(entrada -> entrada.getFechaEvento().isAfter(hoy))
        .min(Comparator.comparing(entrada -> entrada.getFechaEvento()))
        .orElse(null);
    }
}
