package ar.edu.unlp.info.oo1.parcial2024SegundaFecha;

public class Mago implements Rol{
    
    public double valorBase(Personaje personaje){
        return (personaje.getInteligencia() + personaje.getNivel()) * 2;
    }

    public double incrementarHabilidad(Personaje personaje){
        return (3.0/2 * personaje.getNivel());
    }

    public void incrementarAtributo(Personaje personaje){
        personaje.incrementarInteligencia(this.incrementarHabilidad(personaje));
    }
}
