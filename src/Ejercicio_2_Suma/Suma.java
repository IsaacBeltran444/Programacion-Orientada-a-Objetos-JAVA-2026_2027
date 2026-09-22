package Ejercicio_2_Suma;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int sumaResultado = 0;

        System.out.print("Escribe el primer entero: ");
        numero1 = teclado.nextInt();


        System.out.print("Escribe el segundo entero: ");
        numero2 = teclado.nextInt();

        sumaResultado = numero1 + numero2;

        System.out.print("La suma es: " + sumaResultado);

    }

}
