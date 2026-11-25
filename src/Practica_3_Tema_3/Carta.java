package Practica_3_Tema_3;

public class Carta {
    //enum de las posibles figuras que pueden tener las cartas
    enum figuras{
        ESPADAS,
        BASTOS,
        OROS,
        COPAS;

        public static figuras desdeNumero(int numero) {
            return values()[numero];
        }
    }
    //ATRIBUTOS
    int numero;
    figuras figura;

    //================== MÉTODOS ==================
    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", figura=" + figura +
                '}';
    }

    public Carta(int numero, figuras figura) {
        this.numero = numero;
        this.figura = figura;
    }

}
