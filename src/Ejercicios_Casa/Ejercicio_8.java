package Ejercicios_Casa;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero = 0;      //<---- Double porque sqrt trabaja con doubles aunque transforma los int a double
        double resultado = 0.0;

        //pido numero
        System.out.println("Introduce un numero entero: ");
        numero = teclado.nextDouble();

        //calculo el cuadrado
        resultado = Math.sqrt(numero);

        if(numero%2==0){    //si el numero al cuadrado es entero...
            System.out.println("Es un número introducido puede representarse como: " + resultado + "^2");
        }

        teclado.close();
    }
}
