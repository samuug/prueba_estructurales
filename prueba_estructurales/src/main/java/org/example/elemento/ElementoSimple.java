package org.example.elemento;

public class ElementoSimple extends Elemento{

    private double precio;
    public ElementoSimple(double precio, int codigo) {
        super(codigo);
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
