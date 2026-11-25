package Ejercicio_17;

public class MiClase {
    public int entero;

    //============================== constructores ==============================
    //constructor que no se le pasa nada
    public MiClase() {
        this.entero = 1;
    }

    //constructor que se le pasa un int
    public MiClase(int x) {
        this.entero = x;
    }

    //constructor que se le pasa un double
    public MiClase(double x) {
        this.entero = (int) x;
    }

    //constructor que se le pasa dos int
    public MiClase(int x, int y) {
        int z = x * y;
        this.entero = z;
    }

    @Override
    public String toString() {
        return "MiClase{" +
                "entero=" + entero +
                '}';
    }
}
