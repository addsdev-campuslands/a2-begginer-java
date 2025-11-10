package com.adrian;

import java.util.Scanner;

import com.adrian.ejercicios.Bibliotek;

public class Main {
    final static int maxRange = 10000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        var biblioteka = new Bibliotek();
        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Listar libros Bibliotek
                    2. Guardar libros Bibliotek
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 1:
                    biblioteka.listarLibros();
                    break;
                case 2:
                    biblioteka.guardar(scan);
                    break;
                case 0:
                    // Salir
                    flag = false;

                    break;
                default:
                    System.out.println("Ingrese una opcion valida......\nPresione Enter para continuar.");
                    scan.nextLine();
                    break;
            }
        }
        scan.close();
    }
}