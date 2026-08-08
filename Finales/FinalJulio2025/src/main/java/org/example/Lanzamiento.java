package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Lanzamiento {
    private List<Integer> valores;
    private LocalDateTime timestamp;
    private int valorTotal;

    public Lanzamiento(List<Integer> valores, int valorTotal) {
        this.valores = valores;
        this.timestamp = LocalDateTime.now();
        this.valorTotal = valorTotal;
    }
}
