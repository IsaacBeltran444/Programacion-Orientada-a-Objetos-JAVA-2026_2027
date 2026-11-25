package Practica_1;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int numero = 0;
        int multiplicacion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero real entero: ");
        numero = teclado.nextInt();

        numero *= 20;
        numero /= 10;

        System.out.println("resultado: " + numero);



        teclado.close();
    }
}
