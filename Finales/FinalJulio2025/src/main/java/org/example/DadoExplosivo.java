package org.example;

public class DadoExplosivo implements Dado {
    private int valorMaximo;

    public DadoExplosivo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    @Override
    public int lanzar() {
        int valorRandom = (int) (Math.random() * valorMaximo) + 1;
        int valorTotal = valorRandom;
        while (valorRandom == valorMaximo) {
            valorRandom = (int) (Math.random() * valorMaximo) + 1;
            valorTotal += valorRandom;
        }
        return valorTotal;
    }
}
