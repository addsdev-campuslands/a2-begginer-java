package com.adrian.ejercicios;

import java.util.Scanner;

public class Bibliotek {
    public Libro[] libros = new Libro[10];
    int indice = 0;

    public void listarLibros() {
        for (Libro libro : libros) {
            if(libro == null) break;
            System.out.println("--- Información del Libro ---");
            System.out.println("        Título: "+ libro.titulo);
            System.out.println("        Autor: "+ libro.autor);
            System.out.println("        Año: "+ libro.anio);
            System.out.println("        Género: "+ libro.genero);
            System.out.println("        Número de páginas: "+ libro.numPaginas);
        }
    }

    public void guardar(Scanner scanner) {
        if(indice >= 10) {
            System.out.println("No hay mas espacio en la Bibliotek.....");
            return;
        }
        scanner.nextLine(); // Evitar el salto de linea
        Libro libro = new Libro();
        System.out.println("Ingresa el título del libro: ");
        libro.titulo = scanner.nextLine(); 
        System.out.println("Ingresa el autor del libro: ");
        libro.autor = scanner.nextLine(); 
        System.out.println("Ingresa el año de publicación:  ");
        libro.anio = scanner.nextInt(); 
        scanner.nextLine(); // Evitar el salto de linea
        System.out.println("Ingresa el género del libro:  ");
        libro.genero = scanner.nextLine(); 
        System.out.println("Ingresa el número de páginas:  ");
        libro.numPaginas = scanner.nextInt();
        
        libros[indice++] = libro; //0
        
        //libros[indice] = libro;
        //indice++;
        //scanner.close();
    }
}
