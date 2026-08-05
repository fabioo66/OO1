package ar.edu.unlp.info.oo1.ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String direccion;
	private String nombreDescriptivo;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	public Propiedad(String direccion, String nombreDescriptivo, double precioPorNoche) {
        this.direccion = direccion;
        this.nombreDescriptivo = nombreDescriptivo;
        this.precioPorNoche = precioPorNoche;
        this.reservas = new ArrayList<>();
    }
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public double getPrecioPorNoche() {
		return this.precioPorNoche;
	}
	
	public boolean estaDisponible(IDateLapse anotherDate) {
		return this.reservas.stream()
				.noneMatch(reserva -> reserva.overlaps(anotherDate));
	}
	
	public double calcularIngresosReservas(IDateLapse periodo) {
        return this.reservas.stream()
            .filter(reserva -> reserva.overlaps(periodo))
            .mapToDouble(Reserva::calcularPrecio)
            .sum() * 0.75;
    }
}
