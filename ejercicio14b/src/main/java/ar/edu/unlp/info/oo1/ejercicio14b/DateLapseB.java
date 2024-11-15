package ar.edu.unlp.info.oo1.ejercicio14b;

import java.time.LocalDate;

public class DateLapseB implements IDateLapse{
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseB(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
        return (other.isEqual(this.from) || other.isAfter(this.from)) && (other.isEqual(this.getTo()) || other.isBefore(this.getTo()));
    }
	
	public boolean overlaps(IDateLapse anotherDateLapse) {
        return !this.getTo().isBefore(anotherDateLapse.getFrom()) && !this.from.isAfter(anotherDateLapse.getTo());
    }
}
