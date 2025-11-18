package com.adrian.ejercicios.figuras;

public class Circulo extends Figura implements IArea{

    private double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * radio;
    }
    
}
