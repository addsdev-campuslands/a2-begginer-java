package com.adrian;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random(); 
        
        int[] numeros = new int[10000];
        
        for(int a=0; a < numeros.length; a++) {
            numeros[a] = r.nextInt(100);
        }

        for(int a=0; a < 10; a++) {
            int indice = r.nextInt(10000);
            System.out.println("Oiga el indice es: "+ indice+"  = " + numeros[indice]);
        }

        // Mostrar un listado de los indices que su valor en el array de
        // numeros sean menor o igual a 55

    }
}