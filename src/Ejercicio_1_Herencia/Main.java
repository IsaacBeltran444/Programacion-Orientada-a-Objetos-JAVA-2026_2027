package Ejercicio_1_Herencia;

public class Main {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(15);
        Computador tabletEjemplo = new Tablet(188);
        tablet.verPeso();
        tabletEjemplo.verPeso();
    }
}
