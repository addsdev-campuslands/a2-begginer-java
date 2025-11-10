package com.adrian;

import java.util.Scanner;

import com.adrian.game.ahoracado.Ahorcado;

public class Main {
    final static int maxRange = 10000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        var ahoracado = new Ahorcado();
        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Jugar al Ahoracado
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 1:
                    
                    ahoracado.iniciar();
                    ahoracado.ejecutar(scan);
                    break;
                case 0:
                    // Salir
                    flag = false;

                    break;
                default:
                    System.out.println("Ingrese una opcion "+
                    "valida......\nPresione Enter para continuar.");
                    scan.nextLine();
                    break;
            }
        }
        scan.close();
    }
}