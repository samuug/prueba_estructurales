package org.example.factories;

import org.example.elemento.Elemento;
import org.example.elemento.ElementoSimple;


public abstract class FactoryElementoSimple implements FactoryElemento{
    @Override
    public Elemento crearElemento(int codigo, int precio) {
        return new ElementoSimple(codigo, precio);
    }
}
