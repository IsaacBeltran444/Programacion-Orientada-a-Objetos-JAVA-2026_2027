package Ejercicios_Casa;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroIntroducido = 0;
        int multiplicacion = 0;
        int resultado = 0;
        int resto = 0;
        int segundaOperacion = 0;
        int resultado2 = 0;
        int resto2 = 0;

        System.out.println("Introduce un número entero: ");
        numeroIntroducido = teclado.nextInt();

        multiplicacion = numeroIntroducido * 20;
        resultado = multiplicacion / 10;

        System.out.println("Resultado x * 20 / 10: " + resultado);

        segundaOperacion = multiplicacion + resultado;
        resultado2 = segundaOperacion / 10;
        resto2 = segundaOperacion % 10;

        System.out.println("Segunda división por 10: " + resultado2);

        if (resto2 != 0) {
            System.out.println("Resto: " + resto2);
        }

        teclado.close();
    }
}