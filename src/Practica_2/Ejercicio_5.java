package Practica_2;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   //scanner para el teclado
        String palabra = "Objetos";     //palabra hardcodeada
        int vidas = 5;      //cpntador total de vidas
        int guiones = palabra.length();     //numero de guiones de las letras de la palabra
        char letrasUsadas[] = new char[26];     //array q guarda las letras que introduce el usuario
        char letra;     //letra introducida por el usuario
        int totalLetras = 0;        //numero total de letras que ha introducido el usuario
        boolean completada;     //boolean para comprobar que si está completada la palabra o no

        //printeo el titulo
        System.out.println("================[AHORCADO]================");

        //bucle principal
        while (vidas > 0) {     //mientras sigas vivo
            mostrarPalabra(palabra, letrasUsadas, totalLetras);     //printear la palabra

            System.out.print("Introduce una letra: // Letras Usadas["); //pedir la letra y mostrar el contenido del array
            for (int i = 0; i < totalLetras; i++) {         //for para mostrar el contenido del array de las letras
                System.out.print(letrasUsadas[i] + " ");
            }
            System.out.println("] // vidas: " + vidas);    //fin del array


            letra = teclado.next().charAt(0);       // no existe scanner.nextChar, asique se usa next().charAt(0)
            totalLetras = aniadirLetra(letra, letrasUsadas, totalLetras);       //aumentar el numero de letras añadidas
            vidas = validarLetra(letra, palabra, vidas);        //mantener o reducir el valor de las vidas
            completada = palabraCompletada(palabra, letrasUsadas, totalLetras);     //comprueba si está resuelta la palabra

            if (completada) {       //si se completa...
                mostrarPalabra(palabra, letrasUsadas, totalLetras); //printear la palabra
                System.out.println("Ganaste");      //mensajito de perder
            }
            comprobarVidas(vidas);  //comprobar las vidas
        }
        teclado.close();
    }


    //==================================================METODOS==================================================

    static int aniadirLetra(char a, char letras[], int numeroLetras) {
        if (numeroLetras < 26) {    //si el total es menor a 26
            letras[numeroLetras] = a;   //añadir al array la letera
            numeroLetras++; //aumentar el numero de letras
        }
        return numeroLetras;        //devolver el nuevo numero de letras
    }

    static int validarLetra(char letra, String palabra, int vidas) {
        boolean encontrada = false;     //booleano q me dice si está esa letra en la palabra

        for (int i = 0; i < palabra.length(); i++) {    //recorrer toda la palabra caracter a caracter y ver si está esa letra en la palabra
            if (palabra.charAt(i) == letra) {   //si está, poner el boolean en true porque la ha encontrado
                encontrada = true;
            }
        }
        if (encontrada) {       //dependienod si la ha encontrado
            System.out.println("Letra correcta");   //pone el mensaje de letra correcta
        } else {
            System.out.println("Letra incorrecta"); //pone el mensaje de letra incorrecta y resta vida
            vidas--;
        }
        return vidas;   //devuelve el numero de vidas
    }

    static boolean comprobarVidas(int vidas) {
        boolean quedanVidas = true;     //boolean q me dice si sigo con vida

        if (vidas <= 0) {   //si vidas es menos a 0 (osea estoy muerto)
            System.out.println("Perdiste, no te quedan vidas");
            quedanVidas = false;        //poner en false el boolean
        }
        return quedanVidas;     //retornar el valor del boolean
    }

    static void mostrarPalabra(String palabra, char letras[], int numeroLetras) {
        for (int i = 0; i < palabra.length(); i++) {    // Recorrer cada letra de la palabra
            boolean encontrada = false;                 // flag para saber si la letra actual ha sido adivinada

            for (int j = 0; j < numeroLetras; j++) {    // Comparar contra todas las letras usadas por el usuario
                if (palabra.charAt(i) == letras[j]) {   // Si coincide con alguna introducida
                    encontrada = true;      //poner el flag en true
                }
            }

            if (encontrada) {       //si la encuentra
                System.out.print(palabra.charAt(i) + " ");  // Imprimir la letra descubierta
            } else {
                System.out.print("- ");                     // Imprimir guion si aun no se ha adivinado
            }
        }
        System.out.println();
    }

    static boolean palabraCompletada(String palabra, char letras[], int numeroLetras) {
        boolean completada = true;  // asumo q inicialmente que la palabra esta resuelta

        for (int i = 0; i < palabra.length(); i++) {    // recorrer cada caracter de la palabra
            boolean encontrada = false;                 // flag para comprobar si el caracter actual fue descubierto

            for (int j = 0; j < numeroLetras; j++) {    // Revisar si coincide con alguna de las letras ingresadas
                if (palabra.charAt(i) == letras[j]) {
                    encontrada = true;
                }
            }
            if (!encontrada) {      // Si al menos una letra de la palabra no se ha ingresado
                completada = false; // La palabra todavia no esta completa
            }
        }
        return completada;  // Retornar true si gano o false si faltan letras
    }
}