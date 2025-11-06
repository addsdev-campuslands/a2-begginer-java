package com.adrian;

public class Condicionales {
    // 4. Crea un programa que diga si un número es par o impar.

    /**
     * Esto son el bloques
     */
    int input = 12;

    public void esPar() {
        if (input % 2 == 0) {
            // Par
            System.out.println("Es par");
        } else {
            // Par'nt
            System.out.println("No es Par");
        }
    }

    // Declara una variable con el día de la semana (1-7) y
    // muestra su nombre con switch.
    public static void diaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Sabado");
                break;
        }
    }

    // Comprueba si una cadena de texto contiene una palabra concreta.
    // 1500
    public boolean estaLaPalabra(String cadena,
            String palabra) {
        return cadena.contains(palabra);
    }

    // Muestra la longitud de una cadena de texto.
    public int longitudDeText(String cadena) {
        return cadena.length();
    }

    //Elimina los espacios en blanco al principio y 
    //final de un string.

    public String cadenaFormateada(String cadena) {
        var valor = cadena.trim();
        //System.out.println(cadena == valor);
        return valor;
    }



    //Dado 3 números verifica cual es le mayor usando
    // if - else.
    public int mayor(int a, int b, int c) {
        System.out.println("");
        if(a > b && a > c) {
            return a;
        } else if(b>a && b> c) {
            return b;
        }
        return c;
    }
}
