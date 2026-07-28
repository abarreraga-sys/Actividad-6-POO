package com.poo.actividadindividual6.punto4;

public class ProfesorTitular extends Profesor {

    int anios = 0;

    @Override
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }

    protected void imprimirAnios() {
        System.out.println("Años = " + anios);
    }
}
