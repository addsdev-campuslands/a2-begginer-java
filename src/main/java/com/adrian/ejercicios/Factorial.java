package com.adrian.ejercicios;

public class Factorial {
    
    public int fact(int numero) {
        System.out.print(numero + "x");
        if(numero <= 1) return 1;
        return numero * fact(numero-1);
    }

    public int vueltos(int monto, int moneda) {
        if((monto - moneda) < 0) {
            return 0;
        }

        return 1 + vueltos(monto - moneda, moneda);
    }
}
