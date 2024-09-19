package ar.edu.unlp.info.oo1.ejercicio8;

public class Main {
	
	public static void main(String[] args) {
		Gerente alan = new Gerente("Alan Turing");
		
		/*
		 * Metodos:
		 * 	aportes(); -> Clase Gerente -> invoca a montoBasico(); -> Clase Gerente		 
		 */
		double aportesDeAlan = alan.aportes();
		
		/*
		 * Metodos:
		 * 	sueldoBasico(); -> Clase EmpleadoJerarquico -> como invoca con super participa
		 * 	la clase Empleado, por lo tanto -> this.montoBasico(); + this.aportes(); (clase Empleado)
		 * 	+ this.bonoPorCategoria(); -> Clase EmpleadoJerarquico
		 */
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		
		// Imprime = 2850
		System.out.println("Alan aportes: " + aportesDeAlan);
		
		// Realiza: this.montoBasico(); + this.aportes(); (clase Empleado) + this.bonoPorCategoria(); (Clase EmpleadoJerarquico)
		// Imprime = 67850 -> (consultar)
		System.out.println("Alan sueldo basico: " + sueldoBasicoDeAlan);
	}
}
