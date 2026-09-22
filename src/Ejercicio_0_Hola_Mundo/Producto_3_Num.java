package Ejercicio_0_Hola_Mundo;

import java.util.Scanner;

public class Producto_3_Num {
    public static void main(String[] args) {

        //EJ 3
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int producto = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un primer número: ");
        num1 = teclado.nextInt();

        System.out.println("Introduce un Segundo número: ");
        num2 = teclado.nextInt();

        System.out.println("Introduce un Tercer número: ");
        num3 = teclado.nextInt();

        producto = num1 * num2 * num3;

        System.out.println("El resultado es: " + producto);

        teclado.close();
    }
}
