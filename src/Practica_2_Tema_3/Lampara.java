package Practica_2_Tema_3;

public class Lampara {
    public static int contador = 0;

    void sumaContador(){
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Lampara.contador = contador;
    }

    @Override
    public String toString() {
        return "Número de lamparas: " + contador;
    }
}
