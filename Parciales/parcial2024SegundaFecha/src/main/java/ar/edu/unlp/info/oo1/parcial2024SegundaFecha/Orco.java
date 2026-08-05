package ar.edu.unlp.info.oo1.parcial2024SegundaFecha;

public class Orco extends Personaje{

    public Orco(String nombre, Rol rol){
        super(nombre, rol);
        this.setFuerza(2);
    }

    public double poderDeAtaque(int momentoDelDia){
        double valorBase = this.getRol().valorBase(this);
        if ((momentoDelDia >= 20 && momentoDelDia <= 23) || (momentoDelDia >= 0 && momentoDelDia <= 8)){
            valorBase *= 1.6;
        }
        return valorBase;
    }

    public void subirNivel(){
        this.incrementarNivel();
        if (this.getNivel() % 3 == 0){
            this.getRol().incrementarAtributo(this);
        }
    }
}
