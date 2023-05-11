package org.example.elemento;

public abstract class Elemento implements Elementos{
    private int codigo;

    public Elemento(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    public abstract double getPrecio();
}
