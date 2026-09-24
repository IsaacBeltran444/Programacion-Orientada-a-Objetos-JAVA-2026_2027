package Ejercicios_Casa;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int suma = 0;

        System.out.println("Introduce un numero entero: ");
        numero = teclado.nextInt();

        for (int i = 0; i <= numero; i++) {
            suma += i;
        }

        System.out.println("La suma de los enteros desde el 0 hasta " + numero + " es: " + suma);

        teclado.close();
    }
}
