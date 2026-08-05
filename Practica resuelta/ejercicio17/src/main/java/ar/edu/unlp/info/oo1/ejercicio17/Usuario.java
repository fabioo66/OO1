package ar.edu.unlp.info.oo1.ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private String dni;
	private List<Reserva> reservas;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.reservas = new ArrayList<>();
		this.propiedades = new ArrayList<>();
	}
	
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public Reserva crearReserva(Propiedad propiedad, IDateLapse date) {
		if (propiedad.estaDisponible(date)) {
			Reserva reserva = new Reserva(date, propiedad);
			this.reservas.add(reserva);
			propiedad.agregarReserva(reserva);
			return reserva;
		}else {
			System.out.println("La propiedad no esta disponible");
			return null;
		}
	}
	
	public boolean cancelarReserva(Reserva reserva) {
		if (this.reservas.contains(reserva)) {
			this.reservas.remove(reserva);
			reserva.eliminarPropiedad();
			return true;
		}else {
			return false;
		}
	}
	
	public double calcularIngresos(IDateLapse otroPeriodo) {
		return this.propiedades.stream()
			.mapToDouble(propiedad -> propiedad.calcularIngresosReservas(otroPeriodo))
			.sum();
	}
	
}
