package Ejercicios_Casa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        final double PI = 3.1416;   //constantes con mayusculas

        Scanner teclado = new Scanner(System.in);

        double radio = 0.0;
        double area = 0.0;

        //area circulo -> pi*radio*radio
        System.out.print("Introduce el radio del círculo: ");
        radio = teclado.nextDouble();

        area = PI * radio * radio;

        System.out.print("Área del circulo: " + area);

        teclado.close();
    }
}
