package Ejercicio_1_Herencia;

public class Tablet extends Computador{
    int pesoEnGramos;

    //constructor hijo
    public Tablet(int pesoEnKilos){
        super(pesoEnKilos);
        this.pesoEnGramos = getPesoEnKilos()*1000;
    }

    @Override
    public void verPeso(){
        System.out.println("Peso actual de la tablet es: " + pesoEnKilos + " kg y " + pesoEnGramos + " gr");
    }

}
