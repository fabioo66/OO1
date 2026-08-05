package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> adjuntos;

    public Email(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.adjuntos = new ArrayList<>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getCuerpo() {
        return this.cuerpo;
    }

    public List<Archivo> getAdjuntos() {
        return this.adjuntos;
    }

    public void agregarAdjunto(Archivo adjunto) {
        this.adjuntos.add(adjunto);
    }
    
    private int getTamañoAdjuntos() {
    	return this.adjuntos.stream()
    		.mapToInt(adjunto -> adjunto.getTamaño())
    		.sum();
    }
    
    public int getTamaño() {
    	return this.titulo.length() + this.cuerpo.length() + this.getTamañoAdjuntos();
    }
    
    public boolean contieneTexto(String texto) {
    	return this.titulo.contains(texto) || this.cuerpo.contains(texto);
    }
}

