package ar.edu.unlp.info.oo1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean isOn;
	private List<Farola> neighbors;
	
	public Farola() {
		this.isOn = false;
		this.neighbors = new ArrayList<>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.neighbors.contains(otraFarola)) {
			this.neighbors.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}

	public List<Farola> getNeighbors(){
		return this.neighbors;
	}
	
	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (this.isOff()) {
			this.isOn = true;
			for (Farola neighbor : this.neighbors) {
				neighbor.turnOn();
			}
		}
    }

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (this.isOn()) {
			this.isOn = false;
			for (Farola neighbor : this.neighbors) {
				neighbor.turnOff();
			}
		}
	}
	
	public boolean isOn() {
		return this.isOn;
	}
	
	public boolean isOff() {
		return !this.isOn;
	}
}
