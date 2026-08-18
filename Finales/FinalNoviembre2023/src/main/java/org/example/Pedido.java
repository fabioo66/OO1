package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemServicio> items;

    public Pedido() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemServicio item) {
        this.items.add(item);
    }

    public double calcularCosto() {
        return this.items.stream().mapToDouble(item -> item.calcularCosto()).sum();
    }
}
