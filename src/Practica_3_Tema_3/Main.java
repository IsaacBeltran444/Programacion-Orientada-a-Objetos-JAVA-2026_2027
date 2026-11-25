package Practica_3_Tema_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Carta carta1 = new Carta(1,Carta.figuras.desdeNumero(1)); //ejemplo de crear carta
/*
        for (int i = 0; i < 10; i++) {
            ArrayList<Carta> cartas = new ArrayList<Carta>();
        }
*/
        System.out.println(carta1.toString());
    }
}
