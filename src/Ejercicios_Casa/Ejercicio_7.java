package Ejercicios_Casa;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        System.out.println("Introduce un numero entero: ");
        numero = teclado.nextInt();

        if(numero%2!=0){
            System.out.println("Es un número impar");
        }else{
            System.out.println("Es un número par");
        }

        teclado.close();
    }
}
