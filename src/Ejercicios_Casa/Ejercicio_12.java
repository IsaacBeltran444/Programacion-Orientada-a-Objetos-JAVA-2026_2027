package Ejercicios_Casa;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mes = 0;
        int año = 0;
        int dias = 0;

        System.out.println("Introduce el número del mes: ");
        mes = teclado.nextInt();

        System.out.println("Introduce el año: ");
        año = teclado.nextInt();

        switch (mes) {
            case 1:
                dias = 31;
                break;

            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;

            case 3:
                dias = 31;
                break;

            case 4:
                dias = 30;
                break;

            case 5:
                dias = 31;
                break;

            case 6:
                dias = 30;
                break;

            case 7:
                dias = 31;
                break;

            case 8:
                dias = 31;
                break;

            case 9:
                dias = 30;
                break;

            case 10:
                dias = 31;
                break;

            case 11:
                dias = 30;
                break;

            case 12:
                dias = 31;
                break;

            default:
                System.out.println("El mes introducido no es válido.");
        }

        if (mes >= 1 && mes <= 12) {
            System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
        }

        teclado.close();
    }
}