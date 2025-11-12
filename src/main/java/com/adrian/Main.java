package com.adrian;

import java.util.Scanner;


public class Main {
    final static int maxRange = 10000;

    public static void main(String[] args) {
        /**
         * Crea una clase User con los atributos privados username y password. 
         * Implementa los métodos setUsername(String username), 
         * setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
         */
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        
        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. 
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 0:
                    // Salir
                    flag = false;

                    break;
                default:
                    System.out.println("Ingrese una opcion " +
                            "valida......\nPresione Enter para continuar.");
                    scan.nextLine();
                    break;
            }
        }
        scan.close();
    }
}