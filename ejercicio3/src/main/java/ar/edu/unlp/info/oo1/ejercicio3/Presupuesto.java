package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new LinkedList<Item>();
	}
		
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getCliente() {
		return this.cliente;
	}

	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Item item : this.items) {
			total += item.costo();
		}
		return total;
	}
}