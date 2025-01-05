package ar.edu.unlp.info.oo1.parcial2024SegundaFecha;

public class Humano extends Personaje{

    public Humano(String nombre, Rol rol){
        super(nombre, rol);
        this.setInteligencia(2);
    }
    
    public double poderDeAtaque(int momentoDelDia){
        double valorBase = this.getRol().valorBase(this);
        if (momentoDelDia >= 8 && momentoDelDia <= 20){
            valorBase *= 1.4;
        }
        return valorBase;
    }

    public void subirNivel(){
        this.incrementarNivel();
        if (this.getNivel() >= 7){
            this.getRol().incrementarAtributo(this);
        }
    }
}
