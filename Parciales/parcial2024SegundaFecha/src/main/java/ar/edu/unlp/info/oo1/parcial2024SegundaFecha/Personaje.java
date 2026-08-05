package ar.edu.unlp.info.oo1.parcial2024SegundaFecha;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Personaje {
    private String nombre;
    private int nivel;
    private double inteligencia;
    private double fuerza;
    private Rol rol;

    public Personaje(String nombre, Rol rol) {
        this.nombre = nombre;
        this.nivel = 1;
        this.inteligencia = 1;
        this.fuerza = 1;
        this.rol = rol;
    }

    public double getInteligencia() {
        return this.inteligencia;
    }

    public double getFuerza() {
        return this.fuerza;
    }

    public int getNivel() {
        return this.nivel;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public void incrementarInteligencia(double inteligencia) {
        this.inteligencia += inteligencia;
    }

    public void incrementarFuerza(double fuerza) {
        this.fuerza += fuerza;
    }

    public void incrementarNivel() {
        this.nivel++;
    }

    public abstract double poderDeAtaque(int momentoDelDia);

    public abstract void subirNivel();

    public void enfrentamiento(Personaje personaje, int momentoDelDia){
        if (this.poderDeAtaque(momentoDelDia) > personaje.poderDeAtaque(momentoDelDia)){
            this.subirNivel();
        }else{
            personaje.subirNivel();
        }
    }

    public boolean esOponenteNivelSimilar(Personaje oponente) {
        return Math.abs(this.getNivel() - oponente.getNivel()) <= 2 || 
               Math.abs(this.poderDeAtaque(12) - oponente.poderDeAtaque(12)) < 5;
    }

    public List<Personaje> buscarOponentesNivelSimilar(List<Personaje> personajes) {
        return personajes.stream()
                .filter(oponente -> !this.equals(oponente)) // Evita compararse consigo mismo
                .filter(oponente -> esOponenteNivelSimilar(oponente))
                .collect(Collectors.toList());
    }
}
