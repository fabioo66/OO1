package ar.edu.unlp.info.oo1.ejercicio17;

public class Reserva {
	private IDateLapse periodo;
	private Propiedad propiedad;
	
	public Reserva(IDateLapse periodo, Propiedad propiedad) {
        this.periodo = periodo;
        this.propiedad = propiedad;
    }
	
	public IDateLapse getPeriodo() {
		return this.periodo;
	}
	
	public Propiedad getPropiedad() {
		return this.propiedad;
	}
	
	public double calcularPrecio() {
		return this.periodo.sizeInDays() * this.propiedad.getPrecioPorNoche();
	}
	
	public boolean overlaps(IDateLapse otroPeriodo) {
		return this.periodo.overlaps(otroPeriodo);
	}
	
	public void eliminarPropiedad() {
		this.propiedad.eliminarReserva(this);
	}
}
