package org.example.elemento;

import java.util.ArrayList;
import java.util.List;

public class Kit extends Elemento{

    private double descuento=0.1;
    private List<Elemento> elementos;

    public Kit(int codigo) {
        super(codigo);
        this.elementos = new ArrayList<>();
    }

    @Override
    public double getPrecio() {
        double precio=0;
        for (Elemento elemento:this.elementos) {
            precio+=elemento.getPrecio();
        }
        return precio*descuento;
    }
}
