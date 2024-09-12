package ar.edu.unlp.info.oo1.ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Balanza {
    private List<Producto> productos;

    public void ponerEnCero() {
        this.productos.clear();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public Ticket emitirTicket() {
        return new Ticket(new LinkedList<Producto>(this.productos));
    }
    
    public List<Producto> getProductos() {
    	return this.productos;
    }
    
    public int getCantidadDeProductos() {
    	return this.productos.size();
    }
    
    public double getPrecioTotal() {
    	double precioTotal = 0;
    	for (Producto producto : this.productos) {
    		precioTotal += producto.getPrecio();
    	}
    	return precioTotal;
    }

    public double getPesoTotal() {
    	double pesoTotal = 0;
    	for (Producto producto : this.productos) {
    		pesoTotal += producto.getPeso();
    	}
    	return pesoTotal;
    }
}
