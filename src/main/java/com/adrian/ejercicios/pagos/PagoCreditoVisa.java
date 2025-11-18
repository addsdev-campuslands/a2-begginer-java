package com.adrian.ejercicios.pagos;

public class PagoCreditoVisa extends PagoCredito  implements IProveedor, IVisa {

    public PagoCreditoVisa(int valor, String lastDigits, String cvv) {
        super(valor, lastDigits, cvv);
        this.lastDigits = lastDigits;
        this.cvv = cvv;
    }

    @Override
    public String nombreProveedor() {
        return "NuncaSirve";
    }

    @Override
    public int descuento() {
        return 10;
    }

    @Override
    public int acomuladorDePuntos() {
        return 5;
    }
    
}
