package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EnvioCombinado implements Contenido {

    private List<Contenido> contenidos;

    public EnvioCombinado() {
        this.contenidos = new ArrayList<>();
    }

    public void agregarContenido(Contenido contenido) {
        this.contenidos.add(contenido);
    }

    @Override
    public double costo() {
        return contenidos.stream()
                .mapToDouble(Contenido::costo)
                .sum();
    }

    @Override
    public String resumen() {
        return contenidos.stream()
                .map(Contenido::resumen)
                .collect(Collectors.joining("; "));
    }

    @Override
    public String instrucciones() {
        return IntStream.range(0, contenidos.size())
                .mapToObj(i -> (i + 1) + ". " + contenidos.get(i).instrucciones())
                .collect(Collectors.joining("\n"));
    }
}