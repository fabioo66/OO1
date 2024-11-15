package ar.edu.unlp.info.oo1.ejercicio15;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private Consumo consumo;
	private CuadroTarifario cuadroTarifario;
	private LocalDate fechaEmision;
	private double bonificacion;
	private double montoFinal;
	
	public Factura(Usuario usuario, CuadroTarifario cuadroTarifario) {
        this.usuario = usuario;
        this.consumo = usuario.getUltimoConsumo(); 
        this.cuadroTarifario = cuadroTarifario;
        this.fechaEmision = LocalDate.now(); // Fecha actual
        this.bonificacion = (this.consumo != null) ? calcularBonificacion() : 0.0;
        this.montoFinal = (this.consumo != null) ? calcularMontoFinal() : 0.0;
    }
	
	public double calcularBonificacion() {
		if (this.consumo.getFactorPotencia() > 0.8) {
			return 0.10;
		}else {
			return 0.0;
		}
	}
	
	public double calcularMontoFinal() {
		double costoConsumo = this.consumo.getEnergiaActiva() * this.cuadroTarifario.getPrecioKWh();
		
		return costoConsumo - (costoConsumo * this.bonificacion);
	}
	
}
