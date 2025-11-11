package com.adrian;

import java.util.Scanner;

import com.adrian.ejercicios.Camper;
import com.adrian.ejercicios.Factorial;
import com.adrian.ejercicios.Trainer;
import com.adrian.game.ahoracado.Ahorcado;

public class Main {
    final static int maxRange = 10000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        var ahoracado = new Ahorcado();
        var factorial = new Factorial();
        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Jugar al Ahoracado
                    2. Palabras Adivinadas
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 1:
                    
                    ahoracado.iniciar("X");
                    ahoracado.ejecutar(scan);
                    break;
                case 2:
                    System.out.println(ahoracado.palabrasAdivinadas);
                    break;
                case 3:
                    //Administrativo
                    //Trainer
                    //Colabarador
                    Camper camper = new Camper("Andrues","Perrea",16,
                    "TI", "10051234512",
                    "?","adrian@gmail.com","12345600");
                    System.out.println(camper.telefono);
                    /*camper.nombre = "Andrues";
                    camper.apellido = "Perrea";
                    camper.edad = 16;
                    camper.tipoDocumento = "TI";
                    camper.documento = "1005123456";
                    camper.estratoSocial = -1;
                    camper.genero = "?";
                    camper.email = "andresitto_777@gmail.com";*/
                    camper.telefono = "018000918080";
                    System.out.println(camper.telefono);
                    //camper.nivelIngles = 10;

                    camper.dormir();
                    camper.divertirse();

                    camper.cambiarNombre("Poncio Zuleta");
                    camper.reportar();
                    camper.calificar();


                    break;

                case 4:
                    Trainer trainer = new Trainer();
                    trainer.nombre = "Adriaaaaann";
                    trainer.apellido = "Nunez";
                    /*trainer.edad = 27;
                    trainer.tipoDocumento = "CC";
                    trainer.documento = "1097101921";
                    trainer.estratoSocial = 8;
                    trainer.genero = "masculino";
                    trainer.email = "adriannnnn00@gmail.com";
                    trainer.telefono = "018000918080";
                    trainer.skill = "Software";*/


                    trainer.dormir();
                    trainer.divertirse();
                    trainer.eseniar();
                    trainer.tomacafe();

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