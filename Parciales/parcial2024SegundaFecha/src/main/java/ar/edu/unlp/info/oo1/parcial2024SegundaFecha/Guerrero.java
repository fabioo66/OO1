package ar.edu.unlp.info.oo1.parcial2024SegundaFecha;

public class Guerrero implements Rol{

    public double valorBase(Personaje personaje){
        return (personaje.getFuerza() * 2) + personaje.getNivel() + personaje.getInteligencia();
    }

    public double incrementarHabilidad(Personaje personaje){
        return (personaje.getNivel()/6);
    }
    
    public void incrementarAtributo(Personaje personaje){
        personaje.incrementarFuerza(this.incrementarHabilidad(personaje));
    }
}
