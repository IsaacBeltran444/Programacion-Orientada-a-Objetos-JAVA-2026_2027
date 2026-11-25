package Ejercicio_1_Herencia;

public class Computador {
    //atributos del padre
    int pesoEnKilos;

    public Computador(int peso){
        this.pesoEnKilos = peso;
    }

    public int getPesoEnKilos() {
        return pesoEnKilos;
    }

    public void verPeso(){
        System.out.println("Peso actual del ordenador es: " + pesoEnKilos + " kg");
    }
}
