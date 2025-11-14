package com.adrian.ejercicios.pagos;

import java.util.Date;

public class PagoEfectivo extends Pago {

    
    public PagoEfectivo(int valor, Date fecha, String referencia) {
        super(valor, fecha, referencia, Pago.Metodo.EFECTIVO);
    }

    @Override
    public String informacion() {
        StringBuilder info = new StringBuilder();
        info.append("Referencia: #" + getReferencia());
        info.append("\nValor #" + String.format("%s $%20d","COP" ,getValor()));
        info.append("\nValor #" + String.format("%S", getReferencia()));
        return info.toString();
    }
    
}
