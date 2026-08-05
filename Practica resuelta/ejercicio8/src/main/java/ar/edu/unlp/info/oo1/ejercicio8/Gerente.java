package ar.edu.unlp.info.oo1.ejercicio8;

public class Gerente extends EmpleadoJerarquico {
	
    public Gerente(String nombre) {
        super(nombre, 8000); // Llama al constructor de EmpleadoJerarquico y pasa el bono por categoría
    }

    @Override
    public double montoBasico() {
        return 57000;
    }

    @Override
    public double aportes() {
        return this.montoBasico() * 0.05d;
    }
}