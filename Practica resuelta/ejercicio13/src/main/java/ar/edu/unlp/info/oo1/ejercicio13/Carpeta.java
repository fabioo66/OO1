package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public List<Email> getEmails(){
		return this.emails;
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public void mover(Email email, Carpeta destino) {
    	if (this.emails.contains(email)) {
    		this.emails.remove(email);
    		destino.agregarEmail(email);
    		System.out.println("El email fue movido");
    	}else {
    		System.out.println("El email ingresado no existe en esta carpeta");
    	}
    }
	
	public Email buscarTextoEnCarpeta(String texto) {
	    return this.emails.stream()
	            .filter(email -> email.contieneTexto(texto))
	            .findFirst()
	            .orElse(null);
	}
	
	public int espacioOcupado() {
	    return this.emails.stream()
	            .mapToInt(Email::getTamaño)
	            .sum();
	}
}
