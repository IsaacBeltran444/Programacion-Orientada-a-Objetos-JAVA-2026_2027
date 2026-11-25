package Ejercicios_Casa;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int minimo = 0;
        int maximo = 0;
        int suma = 0;
        int cantidad = 0;
        double media = 0;

        System.out.println("Introduce números enteros positivos.");
        System.out.println("Introduce un número negativo para terminar.");

        numero = teclado.nextInt();

        if (numero >= 0) {
            minimo = numero;
            maximo = numero;

            while (numero >= 0) {
                suma = suma + numero;
                cantidad = cantidad + 1;

                if (numero < minimo) {
                    minimo = numero;
                }

                if (numero > maximo) {
                    maximo = numero;
                }

                numero = teclado.nextInt();
            }

            media = (double) suma / cantidad;

            System.out.println("Mínimo: " + minimo);
            System.out.println("Máximo: " + maximo);
            System.out.println("Media: " + media);
        }

        teclado.close();
    }
}