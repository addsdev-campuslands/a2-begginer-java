package com.adrian.ejercicios.pagos;

import java.time.LocalDate;
import java.util.UUID;

public class PagoCredito extends Pago {

    protected String lastDigits;
    protected String cvv;

    public PagoCredito(int valor, String lastDigits, String cvv) {
        super(valor, LocalDate.now(), UUID.randomUUID().toString(), Metodo.CREDITO);
        this.lastDigits = lastDigits;
        this.cvv = cvv;
    }

    @Override
    public String informacion() {
        StringBuilder info = new StringBuilder();
        info.append("Referencia: " + getReferencia());
        info.append("\nUltimos digitos: " + lastDigits);
        info.append("\nValor: " + String.format("%s $%20d", "COP", getValor()));
        info.append("\nMetodo: " + String.format("%S", getMetodo().toString()));
        info.append("\nFecha: " + String.format("%tY-%tm-%td", getFecha(), getFecha(), getFecha()));
        return info.toString();
    }

}
