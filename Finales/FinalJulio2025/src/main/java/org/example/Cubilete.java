package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cubilete {
    private List<Dado> dados;
    private List<Lanzamiento> lanzamientos;

    public Cubilete() {
        this.dados = new ArrayList<>();
        this.lanzamientos = new ArrayList<>();
    }

    public Lanzamiento lanzar() {

        List<Integer> valores = dados.stream()
                .map(Dado::lanzar)
                .toList();

        int total = valores.stream()
                .mapToInt(Integer::intValue)
                .sum();

        Lanzamiento lanzamiento = new Lanzamiento(
                valores,
                total
        );

        lanzamientos.add(lanzamiento);

        return lanzamiento;
    }
}
