package com.adrian.ejercicios.pagos;

import java.time.LocalDate;
import java.util.UUID;

public abstract class PagoPSE extends Pago {

    String entidadBancaria;

    public PagoPSE(int valor, String entidadBancaria) {
        super(valor, LocalDate.now(), UUID.randomUUID().toString(), Metodo.PSE);
        this.entidadBancaria = entidadBancaria;
    }

     @Override
    public String informacion() {
        StringBuilder info = new StringBuilder();
        info.append("Referencia: " + getReferencia());
        info.append("\nBanco: " + entidadBancaria);
        info.append("\nValor: " + String.format("%s $%20d", "COP", getValor()));
        info.append("\nMetodo: " + String.format("%S", getMetodo().toString()));
        info.append("\nFecha: " + String.format("%tY-%tm-%td", getFecha(), getFecha(), getFecha()));
        return info.toString();
    }

}
