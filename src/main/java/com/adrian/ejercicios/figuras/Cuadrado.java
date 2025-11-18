package com.adrian.ejercicios.figuras;

public class Cuadrado extends Figura implements IArea {

    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
