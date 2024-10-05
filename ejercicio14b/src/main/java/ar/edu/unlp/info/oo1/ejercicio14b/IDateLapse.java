package ar.edu.unlp.info.oo1.ejercicio14b;

import java.time.LocalDate;

public interface IDateLapse {
	public LocalDate getFrom();
	public LocalDate getTo();
	public int sizeInDays();
	public boolean includesDate(LocalDate other);
}	
