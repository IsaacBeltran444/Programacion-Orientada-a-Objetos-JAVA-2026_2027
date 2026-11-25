package Ejercicio_16_arrays_multidim;

public class Ejercicio_16 {

    public static void main(String[] args) {

        // Arrays 3x2
        int[][] array1 = {
                {1, 2},
                {2, 3},
                {4, 5}
        };
        int[][] array2 = {
                {6, 7},
                {8, 9},
                {0, 10}
        };

        int[][] resultado = new int[3][2];

        suma(array1, array2, resultado);
        printearArray(array1);
        System.out.println();
        printearArray(array2);
        System.out.println();
        printearArray(resultado);
    }

    public static void suma(int[][] arrayA, int[][] arrayB, int[][] arrayC) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arrayC[i][j] = arrayA[i][j] + arrayB[i][j];
            }
        }
    }

    public static void printearArray(int[][] array) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }
}