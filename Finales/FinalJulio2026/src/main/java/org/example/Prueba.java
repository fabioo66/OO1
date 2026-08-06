package org.example;

import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        OrdenDeMantenimiento orden = new OrdenDeMantenimiento("Mantenimiento Torre Norte");

        orden.trabajos = List.of(
                new Inspeccion("sala de maquinas", "Laura Mendez", 2, new Urgente()),
                new Reparacion("ascensor principal", "Martin Suarez", 5, 4500),
                new Reemplazo("luminarias", "cochera", 8, 1200)
        );

        System.out.println(orden.descripcion());
        System.out.println("Costo total: " + orden.calcularCostoTotal());
    }
}
