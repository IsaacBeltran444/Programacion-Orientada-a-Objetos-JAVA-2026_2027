package Ejercicios_Casa;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroIntroducido = 0;

        System.out.println("Introduce un número entero: ");
        numeroIntroducido = teclado.nextInt();

        numeroIntroducido = numeroIntroducido*20/10;
        System.out.println("resultado x * 20 /10: " + numeroIntroducido);


        teclado.close();
    }
}
