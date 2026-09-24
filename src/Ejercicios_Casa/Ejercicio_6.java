package Ejercicios_Casa;

public class Ejercicio_6 {
    public static void main(String[] args) {

        int num5 = 5;
        int suma = 0;
        int multiplicacion = 1;

        //printeo ================
        System.out.println("5 primeros numeros enteros positivos: ");
        for (int i = 1; i <= num5; i++) {
            System.out.print(i + " ");
        }

        //suma =================
        for (int i = 1; i <= num5 ; i++) {
            suma += i;
        }
        System.out.println("\nsuma de ellos: " + suma);

        //multiplicacion=======
        for (int i = 1; i <= num5 ; i++) {
            multiplicacion *= i;
        }
        System.out.print("multiplicacion de ellos: " + multiplicacion);

        //DIVISION DE LA MULTIPLICACION ENTRE 3=======
        multiplicacion /=3;
        System.out.print("división de la multiplicación entre 3: " + multiplicacion);

    }
}
