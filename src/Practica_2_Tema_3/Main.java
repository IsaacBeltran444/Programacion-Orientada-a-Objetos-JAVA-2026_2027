package Practica_2_Tema_3;

import Ejercicio_1_Formas.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el radio del circulo: ");
        double miRadio = teclado.nextDouble();
        Circulo circulo = new Circulo(miRadio);
        System.out.println(circulo);
        teclado.close();
    }
}