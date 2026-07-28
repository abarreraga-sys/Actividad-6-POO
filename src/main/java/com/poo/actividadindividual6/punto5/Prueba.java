package com.poo.actividadindividual6.punto5;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos animales desea registrar? ");
        int cantidad = Integer.parseInt(sc.nextLine());
        Animal[] animales = new Animal[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Animal " + (i + 1) + ": 1) Perro 2) Lobo 3) León 4) Gato");
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    animales[i] = new Perro();
                    break;
                case 2:
                    animales[i] = new Lobo();
                    break;
                case 3:
                    animales[i] = new Leon();
                    break;
                default:
                    animales[i] = new Gato();
                    break;
            }
        }

        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].getNombreCientifico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("Hábitat: " + animales[i].getHabitat());
            System.out.println();
        }

        sc.close();
    }
}
