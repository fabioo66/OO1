package org.example;

public class DadoModificadorFijo implements Dado {
    private int valorFijo;

    public DadoModificadorFijo(int valorFijo) {
        this.valorFijo = valorFijo;
    }

    @Override
    public int lanzar() {
        return (int) (Math.random() * 6) + 1 + valorFijo;
    }
}
