package com.adrian;

import java.util.*;

import com.adrian.ejercicios.figuras.Circulo;
import com.adrian.ejercicios.figuras.Cuadrado;
import com.adrian.ejercicios.figuras.Figura;
import com.adrian.ejercicios.figuras.IArea;
import com.adrian.ejercicios.figuras.Linea;
import com.adrian.ejercicios.user.Admin;
import com.adrian.ejercicios.user.Cliente;
import com.adrian.ejercicios.user.User;

public class Main {
    final static int maxRange = 10000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        boolean flag = true;
        int duplicados = 0;

        Map<String, User> users = new HashMap<>();

        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Agregar Admin
                    2. Agregar Cliente
                    3. Crear aleatorios
                    4. Listar usuario
                    5. Ejemplo Set
                    0. Salir
                    """);
            switch (scan.nextInt()) {

                case 5:
                        var itemsDuplicados = new ArrayList<String>();
                        for(int z=0;z <100; z++) {
                            itemsDuplicados.add(newRandomUserName(1));
                        }

                        var itemsNoDuplicados = new HashSet<>(itemsDuplicados);

                        System.out.println("Duplicados: "+itemsDuplicados.size());
                        System.out.println("NO Duplicados: "+itemsNoDuplicados.size());

                    break;
                case 4:
                    users.forEach((key, value) -> System.out.println("key: " + key + " value: " + value.showInfo()));
                    System.out.println("Repetidos: " + duplicados);
                    System.out.println("Users: " + users.size());
                    break;
                case 3:
                    for (int a = 0; a < 100000; a++) {
                        switch (r.nextInt(2)) {
                            case 0:
                                var admin = new Admin(newRandomUserName(5));// username = ? lenght = 5
                                admin.setPermissions(new String[] { "x", "y" });
                                if (users.containsKey(admin.getUserName())) {
                                    duplicados++;
                                }
                                users.put(admin.getUserName(), admin);
                                break;
                            case 1:
                                var client = new Cliente();
                                client.setUsername(newRandomUserName(5));
                                if (users.containsKey(client.getUserName())) {
                                    duplicados++;
                                }
                                users.put(client.getUserName(), client);
                                break;

                            default:
                                break;
                        }
                    }
                    break;

                case 2:

                    break;
                case 1:

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

    private static String newRandomUserName(int i) {
        var letras = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "x", "y", "z");
        String username = "";
        Random r = new Random();
        for (int a = 0; a < i; a++) {
            username += letras.get(r.nextInt(letras.size()));
        }
        return username;
    }
}