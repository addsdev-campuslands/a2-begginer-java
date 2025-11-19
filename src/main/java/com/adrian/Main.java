package com.adrian;


import java.util.*;

import com.adrian.ejercicios.figuras.Circulo;
import com.adrian.ejercicios.figuras.Cuadrado;
import com.adrian.ejercicios.figuras.Figura;
import com.adrian.ejercicios.figuras.IArea;
import com.adrian.ejercicios.figuras.Linea;

public class Main {
    final static int maxRange = 10000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        List<Figura> shapes = new ArrayList<>();


        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Mostrar informacion de figuras
                    2. Agregar figura -> Circulo
                    3. Agregar figura -> Cuadrado
                    4. Agregar figura -> Linea
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 4:
                    shapes.add(new Linea());
                    break;
                case 3:
                    System.out.println("Ingrese el valor para el lado del Cuadrado: ");
                    var valorLado = scan.nextDouble();
                    var cuadrado = new Cuadrado(valorLado);
                    shapes.add(cuadrado);
                    break;

                case 2:
                    System.out.println("Ingrese el radio del Circulo: ");
                    var valorRadio = scan.nextDouble();
                    var circulo = new Circulo(valorRadio);
                    shapes.add(circulo);
                    break;
                case 1:
                    System.out.println("-----------------------FIGURAS-----------------------");
                    shapes.forEach( fig -> {
                        System.out.println(fig.getNombre().toUpperCase());
                        if (fig instanceof IArea) {
                            var area = (IArea) fig;
                            System.out.println("Area: " + area.calcularArea());
                        }

                        System.out.println("------------------------------------------------------\n");
                    });
                    System.out.println("-------------------------FIN--------------------------");
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