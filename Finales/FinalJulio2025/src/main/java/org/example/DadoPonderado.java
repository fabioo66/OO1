package org.example;

import java.util.Map;

public class DadoPonderado implements Dado {

    private Map<Integer, Double> probabilidades;

    public DadoPonderado(Map<Integer, Double> probabilidades) {
        this.probabilidades = probabilidades;
    }

    @Override
    public int lanzar() {
        double random = Math.random();
        double acumulado = 0.0;

        for (Map.Entry<Integer, Double> entry : probabilidades.entrySet()) {
            acumulado += entry.getValue();

            if (random < acumulado) {
                return entry.getKey();
            }
        }

        throw new IllegalStateException("Probabilidades inválidas");
    }
}