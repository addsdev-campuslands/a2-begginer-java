package com.adrian.ejercicios.pagos;

public class PagoPSEMasterCard extends PagoPSE implements IMasterCard {

    public PagoPSEMasterCard(int valor, String entidadBancaria) {
        super(valor, entidadBancaria);
    }

    @Override
    public int bonificacion(int porcentaje) {
        return getValor() * (porcentaje / 100) - getValor();
    }

}
