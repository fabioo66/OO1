package ar.edu.unlp.info.oo1.ejercicio4;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Ticket {
    private LocalDate fecha;
    private List<Producto> productos;

    public Ticket(List<Producto> productos) {
        this.fecha = LocalDate.now();
        this.productos = productos.stream().map(p -> new Producto(p.getPeso(), p.getPrecioPorKilo(), p.getDescripcion())).collect(Collectors.toList());
    }
    
    public double impuesto() {
        return this.getPrecioTotal() * 0.21;
    }

    public LocalDate getFecha() {
		return fecha;
	}

    public int getCantidadDeProductos() {
    	return this.productos.size();
    }

    public double getPesoTotal() {
    	double pesoTotal = 0;
    	for (Producto producto : this.productos) {
    		pesoTotal += producto.getPeso();
    	}
    	return pesoTotal;
    }

    public double getPrecioTotal() {
    	double precioTotal = 0;
    	for (Producto producto : this.productos) {
    		precioTotal += producto.getPrecio();
    	}
    	return precioTotal;
    }
}
