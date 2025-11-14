package com.adrian.ejercicios.pagos;

import java.util.Date;

public abstract class Pago {
    private int valor;
    private Date fecha;
    public enum Metodo {
        CREDITO,
        DEBITO,
        PSE,
        EFECTIVO
    }
    private Metodo metodo;
    private String referencia;

    public Pago(int valor, Date fecha, String referencia, Metodo metodo ) {
        this.valor = valor;
        this.fecha = fecha;
        this.referencia = referencia;
        this.metodo = metodo;
    }

    public abstract String informacion();

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Metodo getMetodo() {
        return metodo;
    }

    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    } 
}
