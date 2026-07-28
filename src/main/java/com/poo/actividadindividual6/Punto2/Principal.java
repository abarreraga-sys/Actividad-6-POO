package com.poo.actividadindividual6.punto2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();

        String[] palabras = new String[3];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra clave " + (i + 1) + ": ");
            palabras[i] = sc.nextLine();
        }

        System.out.print("Publicación: ");
        String publicacion = sc.nextLine();
        System.out.print("Año: ");
        int anio = Integer.parseInt(sc.nextLine());
        System.out.print("Resumen: ");
        String resumen = sc.nextLine();

        ArticuloCientifico articulo = new ArticuloCientifico(titulo, autor, palabras, publicacion, anio, resumen);
        articulo.imprimir();

        sc.close();
    }
}
