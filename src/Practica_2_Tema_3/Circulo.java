package Practica_2_Tema_3;

public class Circulo {
    public final static double NUMEROPI = 3.1416;     //atributo de clase y constante PI
    private double radio = 0.0; //radio por defecto

    //constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo() {
        this.radio = 4;
    }

    //GETTERS Y SETTERS
    //recibe el radio
    public double getRadio() {
        return radio;
    }
    //setea el radio
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //MÉTOS DE CÁLCULO
    //Calcular el área
    public double areaCirculo(){
        return NUMEROPI * this.radio * this.radio;
    }
    //Calcular la longitud
    public double longitudCirculo(){
        return 2 * NUMEROPI * this.radio;
    }

    //tostring para printear
    @Override
    public String toString() {
        return String.format("Circulo creado[Area: %.2f || Longitud: %.2f]", areaCirculo(), longitudCirculo(), longitudCirculo());
    }
}