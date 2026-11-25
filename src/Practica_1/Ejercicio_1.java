package Practica_1;

public class Ejercicio_1 {
    public static void main(String[] args) {
        String shortMsg = "Short Message";
        String longMsg = "Loooooooooong message";
        boolean printShort = true;
        int counter=0;

        if (printShort) {
            System.out.println(shortMsg);
        }else if(!printShort){
            System.out.println(longMsg);
        }else{
            System.out.println("This message is always printed");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Are we there yet?");
        }

        while(counter < 7){
            System.out.println("I'm going to pass this course");
            counter++;
        }

    }
}
