package org.example.factories;

import org.example.elemento.Elemento;

public interface FactoryElemento {
    Elemento crearElemento(int codigo, int precio);
}
