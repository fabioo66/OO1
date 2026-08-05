package ar.edu.unlp.info.oo1.parcial2024SegundaFecha;

public interface Rol {
    
    public double valorBase(Personaje personaje);

    public double incrementarHabilidad(Personaje personaje);

    public void incrementarAtributo(Personaje personaje);
}
