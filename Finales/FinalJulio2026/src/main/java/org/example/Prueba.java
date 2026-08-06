package org.example;

import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        OrdenDeMantenimiento orden = new OrdenDeMantenimiento("Mantenimiento Torre Norte");

        orden.agregarTrabajo(new Inspeccion("sala de maquinas", "Laura Mendez", 2, new Urgente()));
        orden.agregarTrabajo(new Reparacion("ascensor principal", "Martin Suarez", 5, 4500));
        orden.agregarTrabajo(new Reemplazo("luminarias", "cochera", 8, 1200));

        System.out.println(orden.descripcion());
        System.out.println("Costo total: " + orden.calcularCostoTotal());
    }
}
