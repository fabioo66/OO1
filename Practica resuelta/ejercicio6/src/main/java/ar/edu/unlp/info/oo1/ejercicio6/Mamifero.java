package ar.edu.unlp.info.oo1.ejercicio6;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.madre != null && this.madre.getPadre() != null) {
			return this.madre.getPadre();
		}else {
			return null;
		}
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.madre != null && this.madre.getMadre() != null) {
			return this.madre.getMadre();
		}else {
			return null;
		}
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.padre != null && this.padre.getPadre() != null) {
			return this.padre.getPadre();
		}else {
			return null;
		}
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.padre != null && this.padre.getMadre() != null) {
			return this.padre.getMadre();
		}else {
			return null;
		}
	}

	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean ok = false;
		if ((this.padre != null && this.padre.equals(unMamifero)) || (this.madre != null && this.madre.equals(unMamifero))) {
			ok = true;
		}else {
			if (this.padre != null) {
				ok = this.padre.tieneComoAncestroA(unMamifero);
			}
			if (this.madre != null && !ok) {
				ok = this.madre.tieneComoAncestroA(unMamifero);
			}
		}
		return ok;
	}
}
