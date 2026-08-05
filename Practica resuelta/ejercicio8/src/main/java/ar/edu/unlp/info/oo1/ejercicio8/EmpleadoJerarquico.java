package ar.edu.unlp.info.oo1.ejercicio8;

public class EmpleadoJerarquico extends Empleado {
    private double bonoPorCategoria;

    public EmpleadoJerarquico(String nombre, double bonoPorCategoria) {
        super(nombre); // Llama al constructor de la clase Empleado
        this.bonoPorCategoria = bonoPorCategoria;
    }

    @Override
    public double montoBasico() {
        return 45000;
    }

    public double bonoPorCategoria() {
        return this.bonoPorCategoria;
    }

    @Override
    public double sueldoBasico() {
        return super.sueldoBasico() + this.bonoPorCategoria();
    }
}
