package org.example.factories;

import org.example.elemento.Elemento;
import org.example.elemento.Kit;

public abstract class FactoryKit implements FactoryElemento {
    private static int codigoAutoGenerado=0;
    @Override
    public Elemento crearElemento(int codigo,double precio) {
        codigoAutoGenerado++;
        return new Kit(codigoAutoGenerado);
    }

}
