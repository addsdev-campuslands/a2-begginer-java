package com.adrian;

import java.util.ArrayList;
import java.util.Scanner;

import com.adrian.ejercicios.pagos.Pago;
import com.adrian.ejercicios.pagos.PagoDebito;
import com.adrian.ejercicios.pagos.PagoEfectivo;

import java.time.LocalDate;
import java.util.*;

public class Main {
    final static int maxRange = 10000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        List<Pago> historial = new ArrayList<>();

        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Historial de Pagos
                    2. Registrar un pago en Efectivo
                    3. Registrar un pago con Tarjeta Debito
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 3:
                    System.out.println("Ingrese el valor a consignar: ");
                    var valorDebit = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Ingrese los ultimos 4 digitos: ");
                    var lasDigits = scan.nextInt() + "";
                    var debito = new PagoDebito(valorDebit, lasDigits);
                    historial.add(debito);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a consignar: ");
                    var valorEfectivo = scan.nextInt();
                    //scan.nextLine();
                    var efectivo = new PagoEfectivo(valorEfectivo, LocalDate.now(), UUID.randomUUID().toString());
                    historial.add(efectivo);
                    break;
                case 1:
                    System.out.println("-----------------------HISTORIAL-----------------------");
                    for (Pago pago : historial) {
                        System.out.println(pago.informacion());
                    }
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