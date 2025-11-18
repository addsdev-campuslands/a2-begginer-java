package com.adrian.ejercicios.pagos;

public class PagoPSEVisa extends PagoPSE implements IVisa{

    public PagoPSEVisa(int valor, String entidadBancaria) {
        super(valor, entidadBancaria);
    }

    @Override
    public int descuento() {
        return 3;
    }

    @Override
    public int acomuladorDePuntos() {
        return 2;
    }
    
}
