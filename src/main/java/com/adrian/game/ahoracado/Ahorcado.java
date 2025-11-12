package com.adrian.game.ahoracado;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    private String palabraSecreta, palabraTablero; // Palabra secreta a adivinar
    private String[] palabras; // Array de palabras posibles
    public String[] palabrasAdivinadas; // Array de palabras adivinadas
    public String[] palabrasUsadas; // Array de palabras usadas
    private int intentos; // Número máximo de intentos permitidos
    private int errores; // Número de errores cometidos

    public Ahorcado() { // Metodo especial - Constructor
        palabras = new String[] { "programacion",
                "java", "computadora", "teclado", "internet", "variable", "funcion", "objeto", "clase", "constructor",
                "compilador", "algoritmo", "desarrollador", "interfaz",
                "depuracion" };
        // AQUI
        palabraTablero = "";
        errores = 0;
        intentos = 5;
        palabrasUsadas = new String[28];
    }

    public int verErrorres() {
        return errores;
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

    public void iniciar(String caracter) {
        var r = new Random();
        palabraSecreta = palabras[r.nextInt(palabras.length - 1)];// interfaz
        var flag = caracter + " ";
        palabraTablero = "";
        for (int a = 0; a < palabraSecreta.length(); a++) {
            palabraTablero += flag; // _ _ _ _ _ _ _ _
        }
        // ejecutar();
    }

    public void ejecutar(Scanner scan) {

        while (true) {
            System.out.println("\f");
            System.out.println(mensaje(palabrasUsadas));
            System.out.println(mensaje());

            var letra = scan.next();
            var temporal = "";
            guardarLetra(letra);
            if (palabraSecreta.contains(letra)) {
                // a
                // _ _ _ _ _ _ _ _
                var letras = palabraTablero.replace(" ", "").toCharArray();
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (String.valueOf(palabraSecreta.charAt(i)).equals(letra)) {
                        // ________
                        // 0123456
                        // Cambio _ > a
                        letras[i] = letra.charAt(0); // _a__a_a_

                    }
                }
                // asignar
                for (char c : letras) {
                    temporal += String.valueOf(c) + " ";
                }
                palabraTablero = temporal;

                if (validarJuego()) {
                    System.out.println("GANO");
                    break;
                }

            } else {

                errores++;
                if (validarGameOver()) {
                    System.out.println("GAME OVER");
                    System.out.println("La palabra era: " + palabraSecreta);
                    break;
                }

                System.out.println("Ahhh Erroooor");
                System.out.println("Ta'maaaaaaaal");
            }
        }
    }

    private void guardarLetra(String letra) {
        if (existeLetra(letra)) return;

        for (int a = 0; a < palabrasUsadas.length; a++) {

            var usada = palabrasUsadas[a];

            if (usada == null) {
                palabrasUsadas[a] = letra;
                break;
            }

        }
    }

    private boolean existeLetra(String letraBuscada) {
        for (String letra : palabrasUsadas) {
            if (letra != null && letra.equals(letraBuscada)) {
                return true;
            }
        }
        return false;
    }

    private boolean validarGameOver() {
        return intentos < errores;
    }

    private boolean validarJuego() {
        return palabraTablero.replace(" ", "").equals(palabraSecreta);
    }

    public String mensaje(String[] data) {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("**************\n");
        strBuild.append("\n");
        for (String item : data) {
            if (item == null)
                break;
            strBuild.append(item);
            strBuild.append(",");
        }
        strBuild.append("\n");
        strBuild.append("**************\n");
        return strBuild.toString();
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
        return strBuild.toString();
    }

}
