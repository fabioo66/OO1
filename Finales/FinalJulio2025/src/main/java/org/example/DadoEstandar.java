package org.example;

public class DadoEstandar implements Dado {

    @Override
    public int lanzar() {
        return (int) (Math.random() * 6) + 1;
    }
}
