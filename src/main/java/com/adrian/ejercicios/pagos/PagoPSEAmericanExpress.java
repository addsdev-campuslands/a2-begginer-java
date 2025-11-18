package com.adrian.ejercicios.pagos;

public class PagoPSEAmericanExpress extends PagoPSE implements IAmericanExpress {

    public PagoPSEAmericanExpress(int valor, String entidadBancaria) {
        super(valor, entidadBancaria);
    }

    @Override
    public double valorReferenciaCambio() {
        return 3760.00;
    }
    
}
