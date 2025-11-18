package com.adrian.ejercicios.pagos;

public class PagoCreditoMasterCard extends PagoCredito implements IProveedor, IMasterCard {

    public PagoCreditoMasterCard(int valor, String lastDigits, String cvv) {
        super(valor, lastDigits, cvv);
        this.lastDigits = lastDigits;
        this.cvv = cvv;
    }

    @Override
    public String nombreProveedor() {
        return "BancoAtraco";
    }

    @Override
    public int bonificacion(int porcentaje) {
        return getValor() * (porcentaje / 100);
    }
    
}
