package com.adrian;

import com.adrian.ejercicios.pagos.IVisa;
import com.adrian.ejercicios.pagos.IMasterCard;
import com.adrian.ejercicios.pagos.Pago;
import com.adrian.ejercicios.pagos.PagoCredito;
import com.adrian.ejercicios.pagos.PagoCreditoMasterCard;
import com.adrian.ejercicios.pagos.PagoCreditoVisa;
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
                    4. Registrar un pago con Tarjeta Credito
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 4:
                    System.out.println("Ingrese el valor a consignar: ");
                    var valorCredit = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Ingrese los ultimos 4 digitos: ");
                    var lasDigitsCredit = scan.nextInt() + "";
                    scan.nextLine();
                    System.out.println("Ingrese los 3 digitos de su CVV: ");
                    var cvvCredit = scan.nextInt() + "";
                    var credito = new PagoCredito(valorCredit, lasDigitsCredit, cvvCredit);
                    var creditoVisa = new PagoCreditoVisa(valorCredit, lasDigitsCredit, cvvCredit);
                    var creditoMaster = new PagoCreditoMasterCard(valorCredit, lasDigitsCredit, cvvCredit);
                    historial.add(credito);
                    historial.add(creditoVisa);
                    historial.add(creditoMaster);
                    break;
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
                        if (pago instanceof IVisa) {
                            var visa = (IVisa)pago;
                            System.out.println("Los puntos acomulados en esta compra son de: " + visa.acomuladorDePuntos());
                            System.out.println("El descuento es de: " + visa.descuento());
                        }

                        if (pago instanceof IMasterCard) {
                            var masterd = (IMasterCard) pago;
                            System.out.println("La bonificacion por esta compra es de: " + masterd.bonificacion(10));
                        }

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