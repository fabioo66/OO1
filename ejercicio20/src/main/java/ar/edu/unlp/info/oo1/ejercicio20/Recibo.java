package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;

public class Recibo {
	private Empleado e1;
	private LocalDate fechaActual;
	
	public Recibo(Empleado empleado) {
		this.e1 = empleado;
		this.fechaActual = LocalDate.now();
	}
	
	public double calcularMonto () {
		Contrato contratoActivo = e1.getContratoActivo();
		int duracionContrato = contratoActivo.calcularDuracion();
		double monto = contratoActivo.calcularMonto(e1);
		if (duracionContrato >= 5)
			return monto * 1.30;
		else {
			if (duracionContrato >= 10)
				return monto * 1.50;
			else {
				if (duracionContrato >= 15)
					return monto * 1.70;
				else {
					if (duracionContrato >= 20)
						return monto + monto;
					else 
						return monto;
				}
			}
		}
	}
	
	public void generarRecibo () {
	        System.out.println("Recibo de Sueldo");
	        System.out.println("Nombre: " + e1.getNombre());
	        System.out.println("Apellido: " + e1.getApellido());
	        System.out.println("CUIL: " + e1.getCuil());
	        System.out.println("Antigüedad: " + e1.getContratoActivo().calcularDuracion() + " años");
	        System.out.println("Fecha: " + fechaActual);
	        System.out.println("Monto Total: $" + calcularMonto());
	}
}
