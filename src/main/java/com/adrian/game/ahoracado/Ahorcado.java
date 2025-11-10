package com.adrian.game.ahoracado;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    String palabraSecreta, palabraTablero; // Palabra secreta a adivinar
    String[] palabras; // Array de palabras posibles
    int intentos; // Número máximo de intentos permitidos
    int errores; // Número de errores cometidos

    public Ahorcado() { // Metodo especial - Constructor
        palabras = new String[] { "programacion",
                "java", "computadora", "teclado", "internet", "variable", "funcion", "objeto", "clase", "constructor",
                "compilador", "algoritmo", "desarrollador", "interfaz",
                "depuracion" };
        // AQUI
        palabraTablero = "";
        errores = 0;
        intentos = 0;
    }

    public void iniciar() {
        var r = new Random();
        palabraSecreta = palabras[r.nextInt(palabras.length - 1)];// interfaz
        var flag = "_ ";
        palabraTablero = "";
        for (int a = 0; a < palabraSecreta.length(); a++) {
            palabraTablero += flag; // _ _ _ _ _ _ _ _
        }
        // ejecutar();
    }

    public void ejecutar(Scanner scan) {

        while (true) {
            System.out.println(mensaje());
            var letra = scan.next();
            var temporal = "";
            if (palabraSecreta.contains(letra)) {
                // a
                // _ _ _ _ _ _ _ _
                var letras = palabraTablero.replace(" ", "").toCharArray();
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (String.valueOf(palabraSecreta.charAt(i)).equals(letra)) {
                        // ________
                        // 0123456
                        //Cambio _ > a
                        letras[i] = letra.charAt(0); // _a__a_a_
                        
                    }
                }
                //asignar
                for (char c : letras) {
                    temporal += String.valueOf(c) + " ";
                }
                palabraTablero = temporal;

            } else {
                System.out.println("Ahhh Erroooor");
                System.out.println("Ta'maaaaaaaal");
            }
        }
    }

    public String mensaje() {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("*** AHORCADO ****\n");
        strBuild.append("Intentos restantes: ");
        strBuild.append(intentos);
        strBuild.append("\tErrores: ");
        strBuild.append(errores);
        strBuild.append("\n");
        strBuild.append(palabraTablero);
        strBuild.append("\n");
        strBuild.append(palabraSecreta);
        return strBuild.toString();
    }

}
