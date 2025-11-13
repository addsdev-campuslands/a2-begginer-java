package com.adrian;

import java.lang.reflect.Array;
import java.util.Scanner;

import com.adrian.ejercicios.user.Admin;
import com.adrian.ejercicios.user.User;


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
        User common = new User();
        Admin admin = new Admin();
        User user = new Admin();
        
        
        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Ingrese su nombre
                    2. Ingrese su password
                    3. Validar password
                    4. Agregar permisos (ADMINISTRADORES)
                    5. Ver permisos (ADMINISTRADORES)
                    6. Ver info
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 6:
                    System.out.println(common.showInfo());
                    System.out.println(admin.showInfo());
                    break;
                case 5:
                    System.out.println(admin.showPermissions());
                    System.out.println(((Admin)user).showPermissions());
                    break;
                case 4:
                    scan.nextLine();
                    var permiso = scan.nextLine();
                    var permisos = new String[]{"x","y","z"};
                    //common.setPermissions();
                    admin.setPermissions(permiso);
                    ((Admin)user).setPermissions(permisos);
                    //((Admin)common).setPermissions(permisos); X
                    break; 
                case 1:
                    scan.nextLine();
                    var tempName = scan.nextLine();
                    common.setUsername(tempName);
                    admin.setUsername(tempName);
                    user.setUsername(tempName);
                    break;
                case 2:
                    scan.nextLine();
                    var tempPassword = scan.nextLine();
                    common.setPassword(tempPassword);
                    admin.setPassword(tempPassword);
                    user.setPassword(tempPassword);
                    break;
                case 3:
                    scan.nextLine();
                    var tempCheckPassword = scan.nextLine();
                    System.out.println("User: " + common.checkPassword(tempCheckPassword));
                    System.out.println("Admin: " + admin.checkPassword(tempCheckPassword));
                    System.out.println("User-Admin: " + user.checkPassword(tempCheckPassword));
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