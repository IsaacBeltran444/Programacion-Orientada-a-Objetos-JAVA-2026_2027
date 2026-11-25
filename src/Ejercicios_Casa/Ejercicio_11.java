package Ejercicios_Casa;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int suma = 0;
        int i = 0;
        String continuar = "s";

        while (continuar.equals("s")) {

            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();

            suma = 0;

            for (i = 1; i <= numero; i++) {
                suma = suma + i;
            }

            System.out.println("La suma de 1 hasta " + numero + " es: " + suma);

            System.out.println("¿Deseas continuar? (s/n)");
            continuar = teclado.next();
        }

        teclado.close();
    }
}