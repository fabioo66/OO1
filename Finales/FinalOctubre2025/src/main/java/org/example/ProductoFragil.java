package org.example;

public class ProductoFragil implements Contenido {
    private String tipoDeProducto;
    private boolean necesitaEmbalajeEspecial;

    public ProductoFragil(String tipoDeProducto, boolean necesitaEmbalajeEspecial) {
        this.tipoDeProducto = tipoDeProducto;
        this.necesitaEmbalajeEspecial = necesitaEmbalajeEspecial;
    }

    @Override
    public String resumen() {
        return "Producto frágil: " + tipoDeProducto;
    }

    @Override
    public String instrucciones() {
        return necesitaEmbalajeEspecial ? "Manejar con cuidado y usar embalaje especial." : "Manejar con cuidado.";
    }

    @Override
    public double costo() {
        return necesitaEmbalajeEspecial ? 500 : 700;
    }
}
