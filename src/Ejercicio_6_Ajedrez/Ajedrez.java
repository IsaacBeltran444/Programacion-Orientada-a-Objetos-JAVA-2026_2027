package Ejercicio_6_Ajedrez;

public class Ajedrez {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            if(i%2!=0){
                    System.out.print("BWBWBWBW");
            }else{
                    System.out.print("WBWBWBWB");
            }
            System.out.println("");
        }
    }
}
