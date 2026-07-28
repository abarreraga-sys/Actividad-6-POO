package com.poo.actividadindividual6.punto1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pedido 1: primer plato y bebida");
        System.out.print("Nombre primer plato: ");
        String primerPlato1 = sc.nextLine();
        System.out.print("Costo primer plato: ");
        double costoPrimerPlato1 = Double.parseDouble(sc.nextLine());
        System.out.print("Nombre bebida: ");
        String bebida1 = sc.nextLine();
        System.out.print("Costo bebida: ");
        double costoBebida1 = Double.parseDouble(sc.nextLine());
        Pedido pedido1 = new Pedido();
        pedido1.calcularPedido(primerPlato1, costoPrimerPlato1, bebida1, costoBebida1);

        System.out.println("Pedido 2: primer plato, segundo plato y bebida");
        System.out.print("Nombre primer plato: ");
        String primerPlato2 = sc.nextLine();
        System.out.print("Costo primer plato: ");
        double costoPrimerPlato2 = Double.parseDouble(sc.nextLine());
        System.out.print("Nombre segundo plato: ");
        String segundoPlato2 = sc.nextLine();
        System.out.print("Costo segundo plato: ");
        double costoSegundoPlato2 = Double.parseDouble(sc.nextLine());
        System.out.print("Nombre bebida: ");
        String bebida2 = sc.nextLine();
        System.out.print("Costo bebida: ");
        double costoBebida2 = Double.parseDouble(sc.nextLine());
        Pedido pedido2 = new Pedido();
        pedido2.calcularPedido(primerPlato2, costoPrimerPlato2, segundoPlato2, costoSegundoPlato2, bebida2, costoBebida2);

        System.out.println("Pedido 3: primer plato, segundo plato, postre y bebida");
        System.out.print("Nombre primer plato: ");
        String primerPlato3 = sc.nextLine();
        System.out.print("Costo primer plato: ");
        double costoPrimerPlato3 = Double.parseDouble(sc.nextLine());
        System.out.print("Nombre segundo plato: ");
        String segundoPlato3 = sc.nextLine();
        System.out.print("Costo segundo plato: ");
        double costoSegundoPlato3 = Double.parseDouble(sc.nextLine());
        System.out.print("Nombre postre: ");
        String postre3 = sc.nextLine();
        System.out.print("Costo postre: ");
        double costoPostre3 = Double.parseDouble(sc.nextLine());
        System.out.print("Nombre bebida: ");
        String bebida3 = sc.nextLine();
        System.out.print("Costo bebida: ");
        double costoBebida3 = Double.parseDouble(sc.nextLine());
        Pedido pedido3 = new Pedido();
        pedido3.calcularPedido(primerPlato3, costoPrimerPlato3, segundoPlato3, costoSegundoPlato3,
                postre3, costoPostre3, bebida3, costoBebida3);

        sc.close();
    }
}
